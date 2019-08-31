package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.qhy.demo.service.IDemoService;

@Controller
public class IndexController {
	@Autowired
	IDemoService iDemoService;

	@ResponseBody
	@RequestMapping("/getUserName")
	public JSONObject getUserName() throws Exception {
//		File file = demoService.getFile();
		JSONObject json = new JSONObject();
		try {
			Object sendMessage = iDemoService.sendMessage("你好哈哈");
//			String string = IOUtils.toString(new FileInputStream(file), "UTF-8");
			json.put("key", sendMessage);
//			json.put("value", string.replaceAll("<", "").replaceAll("/>", ""));
			System.out.println(json.toString());
			System.out.println(sendMessage);
			return json;
		} catch (Exception e) {
			json.put("key", e.getMessage());
            return json;
		}

	}

}
