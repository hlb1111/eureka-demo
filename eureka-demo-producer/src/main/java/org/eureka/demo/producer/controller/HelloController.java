package org.eureka.demo.producer.controller;

import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.eureka.demo.producer.entity.SysRole;
import org.eureka.demo.producer.entity.SysUser;
import org.eureka.demo.producer.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private Logger log = LoggerFactory.getLogger(getClass());

	@Resource
	private ISysUserService sysUserService;

	@Value("${config.producer.instance:0}")
	private int instance;

	@GetMapping({ "/", "" })
	public String hello(@RequestParam(required = false, defaultValue = "Smith") String name) {
		log.debug("您的名字： " + name);

		return "Hello, " + name + "!!!!";
	}

	@GetMapping("/get_user")
	public String getUser(@RequestParam(required = false, defaultValue = "1") Integer id) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 12; i++) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		
		SysUser user = new SysUser();
		user.setCreated(new Date());
		user.setLoginAccount(sb.toString());
		user.setUsername("自动添加");
		user.setStatus(1);

		SysRole role = new SysRole();
		role.setIsSystem(0);
		role.setRoleName("自动添加的角色");
		role.setRoleId(1);

		sysUserService.saveUserRole(user, role);
		return "事务OK";
	}
}
