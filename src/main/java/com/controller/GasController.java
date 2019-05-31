package com.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Gas;
import com.bean.Msg;
import com.bean.User;
import com.bean.WellKey;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.GasService;
import com.service.WellService;


/**
 * 气质控制层
 * @author ws
 * @param <V>
 */
@Controller
public class GasController {
	
	private Logger logger = Logger.getLogger(GasController.class);
		
	@Autowired
	GasService gasService;
	
	@Autowired
	WellService wellService;
	
	
	
	/*
	 * 到气质首页
	 */
	@RequestMapping("/gas/getGasPhoto")
	public String getPhoto() {
		return "gas/gasPhoto";
	}

	/*
	 * 跳转到a区图界面
	 */
	@RequestMapping("/gas/a")
	public String getA() {
		return "gas/a";
	}
	
	/*
	 * 跳转到ac区图界面
	 */
	@RequestMapping("/gas/ac")
	public String getAC() {
		return "gas/ac";
	}
	/*
	 * 跳转e区
	 */
	@RequestMapping("/gas/e")
	public String getE() {
		return "gas/e";
	}
	
	/*
	 * 跳转到B区域表格页面
	 */
	@RequestMapping("/gas/b1table")
	public String table1() {
		return "gas/b1Table";
	}
	
	/*
	 * 跳转到A区表格页面
	 */
	@RequestMapping("/gas/aTable")
	public String table2() {
		return "gas/aTable";
	}
	/*
	 * 跳转到AC区表格页面
	 */
	@RequestMapping("/gas/acTable")
	public String table3() {
		return "gas/acTable";
	}
	/*
	 * 跳转到E区表格页面
	 */
	@RequestMapping("/gas/eTable")
	public String  table4() {
		return "gas/eTable";
	}
	
	/*
	 * 返回到图形界面
	 */
	@RequestMapping("/gas/gasGraph")
	public String getgraph(Model model) {
		
		//获取到所有的井编
		List<WellKey> wells = wellService.getWellAll();
		model.addAttribute("wells", wells);
		
		//获取到所有井的区域信息
		List<WellKey> wellsRegion =  wellService.getWellAndwRegion();
		
		model.addAttribute("wellsRegion", wellsRegion);
		
		return "gas/graph";
	}
	
	
	/*
	 * 到气质输入界面
	 */
	@RequestMapping("/gas/getinsertGas")
	public String getInsertGas(Model model) {
		
		List<WellKey> well = 	wellService.getWellAll();
		model.addAttribute("wells", well);

		return "gas/addGas";
	}
	/*
	 * 添加气质数据的方法
	 */
	@RequestMapping("/gas/insertGas")
	@ResponseBody
	public Msg insertGas(Gas gas) {
		
		try {
			
			Subject subject = SecurityUtils.getSubject();
			User user = (User) subject.getPrincipal();
			//获取当前用户名
			String uName =  user.getUname();
			
			//设置当前时间
			gas.setGtime(new Date());
			//设置录入人员
			gas.setUname(uName);
			
			gasService.insertAndGas(gas);
			
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	/*
	 * 跳转到气质数据的页面
	 */
	@RequestMapping("/gas/gasList")
	public String getlist(Model model) {
		//出现出所有的井编号
		
		List<WellKey> list = wellService.getWellAll();
		
		model.addAttribute("wells", list);
		
		
		return "gas/gasList";
	}
	
	/*
	 * 添加井编号
	 */
	@RequestMapping("/gas/addWell")
	public String addWell() {
		return "gas/addWell";
	}
	/*
	 * 返回添加结果
	 */
	@RequestMapping("/gas/addWellName")
	@ResponseBody
	public Msg addWellName(String wname,String wRegion) {
		try {
			
			//判断是否存在查询所有的井编号  不存在返回true
			boolean bool = wellService.getWellAll(wname);
			if(bool) {
				wellService.addWell(wname,wRegion);
			}else {
				return Msg.file();
			}			
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	
	/*
	 * 查询的方法
	 */
/*	@RequestMapping("/gas/getGasAll")
	@ResponseBody
	public String getGas() {
		List<Gas> gass =  gasService.getGasAll();
		return null;
	}*/
	
	/*
	 * 分页查询
	 */
	@RequestMapping("/gas/getGasList")
	@ResponseBody
	public Msg listGasAll(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		PageInfo<Gas> pageinfo = null;
		
		try {
			PageHelper.startPage(pn, 10);//显示从第几行到第几行的数据
			List<Gas> gasAll = gasService.getGasAll();//获取全部数据
			pageinfo = new PageInfo<Gas>(gasAll,7);
		} catch (Exception e) {
			return Msg.file();
		}
	   return Msg.success().add("pageInfo", pageinfo);
	}
	
	
	@RequestMapping("/gas/getListTime")
	public String timeGas() {
		return "gas/gasListTime";
	}
	
	/*
	 * 通过时间查询
	 */
	@RequestMapping("/gas/TimeGas")
	@ResponseBody
	public Msg TimeGas(@RequestParam(value="pn",defaultValue="1")Integer pn,String dates,String selectVal,Model model) {
		
		System.out.println("接收到的时间是="+dates);
		System.out.println("获取到的井编号="+selectVal);
		
		if(selectVal == null || "".equals(selectVal) && dates != null){  //有时间没井编号执行的方法
			PageInfo<Gas> pageinfo = null;
			try {
				//通过时间查询的方法
				List<Gas> list = gasService.getGasByTime(dates);
				pageinfo = new PageInfo<Gas>(list);
			} catch (Exception e) {
				return Msg.file();
			}
			return Msg.success().add("pageInfo", pageinfo);
		}else if(dates == null || "".equals(dates) && selectVal != null){  //有井编号没时间的方法
			PageInfo<Gas> pageinfo = null;
			try {
				//通过井编号查询的方法
				List<Gas> list = gasService.getGasBywName(selectVal);
				pageinfo = new PageInfo<Gas>(list);
			} catch (Exception e) {
				return Msg.file();
			}
			return Msg.success().add("pageInfo", pageinfo);
		}else if(dates != null && selectVal != null) {
			PageInfo<Gas> pageinfo = null;
			try {
				//通过录入时间和井编号查询的方法
				List<Gas> list = gasService.getGasByTimeAndWname(dates,selectVal);
				pageinfo = new PageInfo<Gas>(list);
			} catch (Exception e) {
				return Msg.file();
			}
			return Msg.success().add("pageInfo", pageinfo);
		}
		return null;
	}
	
	/*
	 * 图形报表七天
	 */
	@RequestMapping("/gas/getEchartsData")
	@ResponseBody
	public Msg getEcharts(String gname) {
		
		//通过名字获取到气质数据
		PageInfo<Gas> pageinfo = null;
		try {
			//查询气质前七天的时间到当前时间的方法
			List<Gas> list = gasService.getGasBywNameTimeWeek(gname);
			
			pageinfo = new PageInfo<Gas>(list);
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("pageInfo", pageinfo);
	}
	/*
	 * 图形报表一个月
	 */
	@RequestMapping("/gas/getEchartsDataMonth")
	@ResponseBody
	public Msg getEchartsY(String gname) {
		
		//通过名字获取到气质数据
		PageInfo<Gas> pageinfo = null;
		try {
			//查询气质前七天的时间到当前时间的方法
			List<Gas> list = gasService.getGasBywNameTimeMonth(gname);
			pageinfo = new PageInfo<Gas>(list);
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("pageInfo", pageinfo);
	}
	
	
	
	/*
	 * 返回气质数据 
	 */
	@RequestMapping("/gas/getTimeDate")
	@ResponseBody
	public Msg getDate() {
		List<Gas> gas = gasService.getfinally();
		return Msg.success().add("list", gas);
	}
	
	
	/*
	 * 跳转到数据录入jsp
	 */
	@RequestMapping("add")
	public String phoneAdd(String name,Model model) {
		model.addAttribute("name", name);
		return "phone/a1";
	}
	
	/*
	 * 手机端录入接口
	 */
	@RequestMapping("gas/phoneAddGas")
	@ResponseBody
	public Msg phoneAddGas(Gas gas,HttpServletResponse response) {
		//System.out.println("111");
		System.out.println("执行");
		
		response.addHeader("Access-Control-Allow-Origin", "*");   //允许所有源跨域访问。解决了ajax回调函数拿不到数据的问题
		try {
			if(null == gas.getWname()) {
				return Msg.file().add("d", "井编号获取失败");
			}else if( gas.getCh4() == 0.0 && gas.getCo2()==0.0 && gas.getO2() == 0.0 && gas.getH2s() == 0.0 && gas.getBal() == 0.0 && gas.getL() == 0.0) {
				return Msg.file().add("d", "没有填写任何数据");
			}else {
				//获取一下当前时间
				gas.setGtime(new Date());
				//把数据存在数据库中
				gasService.insertAndGas(gas);
			}
		} catch (Exception e) {
		    return Msg.file();
		}
		return Msg.success().add("d", "添加成功");
	}
	
	/*
	 * 跳转到b1按钮请求页面吧
	 */
	@RequestMapping("/gas/b1")
	public String b1() {
		return "gas/b1";
	}
	
	/*
	 * 通过井编号查询数据
	 */
	@RequestMapping("/gas/getGasByName")
	@ResponseBody
	public Msg getByName(String wname) {
		Gas gas = null;
		try {
			gas = gasService.getGasBywNameReturnOne(wname);
		} catch (Exception e) {
			return Msg.file();
		}
		return  Msg.success().add("Gas", gas);
	}
	
	/**
	 * 查询一个区域的所有单井数据
	 * @param string   区域编号
	 * @return
	 */
	@RequestMapping("/gas/getTableData")
	@ResponseBody
	public Map<String, Object> getTableData(String string) {
		List<Gas> gas = null;
		HashMap<String, Object> data =null;
		try {
			gas = gasService.getGasZoneData(string);
			data = new HashMap<String, Object>();
			data.put("data", gas);
		} catch (Exception e) {
			logger.error("控制层 /gas/getTableData 出现错误"+e.getMessage());
		}
		return  data;
	}
	
	
	
	
}
