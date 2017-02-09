package com.alibaba.dubbo.demo.pp;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.langqiao.dubbo.api.DemoService;
import com.langqiao.dubbo.model.User;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("tom");
		System.out.println(hello);

		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
		}
		System.in.read();
	}

}