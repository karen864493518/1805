package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.client.EurekaServiceFeigh;

@RestController
public class HelloController {
	
	@Autowired
	EurekaServiceFeigh feign;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return feign.hello(name);
	}
}
