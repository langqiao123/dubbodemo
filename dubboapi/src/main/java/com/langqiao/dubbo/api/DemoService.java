package com.langqiao.dubbo.api;

import java.util.List;

import com.langqiao.dubbo.model.User;

public interface DemoService {

	String sayHello(String name);

	public List<User> getUsers();

}