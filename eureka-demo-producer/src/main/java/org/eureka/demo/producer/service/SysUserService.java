package org.eureka.demo.producer.service;

import javax.annotation.Resource;

import org.eureka.demo.producer.dao.ISysUserDao;
import org.eureka.demo.producer.entity.SysRole;
import org.eureka.demo.producer.entity.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SysUserService implements ISysUserService {
	
	@Resource
	private ISysUserDao sysUserDao;
	
	@Override
	@Transactional
	public void saveUser(SysUser user) {
		sysUserDao.save(user);

	}

	@Override
	@Transactional
	public void saveRole(SysRole role) {
		sysUserDao.save(role);
	}

	@Override
	@Transactional
	public void saveUserRole(SysUser user, SysRole role) {
		saveUser(user);
		saveRole(role);
		
	}
	
	
}
