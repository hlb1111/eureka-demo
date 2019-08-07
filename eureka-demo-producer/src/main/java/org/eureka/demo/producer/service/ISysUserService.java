package org.eureka.demo.producer.service;

import org.eureka.demo.producer.entity.SysRole;
import org.eureka.demo.producer.entity.SysUser;

public interface ISysUserService {
	
	public void saveUser(SysUser user) ;
	
	public void saveRole(SysRole role) ;
	
	public void saveUserRole(SysUser user, SysRole role);
	
}
