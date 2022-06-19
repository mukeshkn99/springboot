package com.springboot.beans.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.binding.Loginform;
import com.springboot.beans.binding.Regform;
import com.springboot.beans.models.UserDtlsEntity;
import com.springboot.beans.repository.UserRepository;

@Service
public class UserManageServiceImpl implements UserManageService {
	
	@Autowired
	private UserRepository userrepo;

	@Override
	public String loginform(Loginform login) {
		UserDtlsEntity entity = userrepo.findByEmailAndPassword(login.getEmail(), login.getPassword());

		if (entity != null) {
			return "Invalid Credentials";
		}

		return "success";

	}

	@Override
	public String signup(Regform reg) {
		UserDtlsEntity entity = new UserDtlsEntity();
		BeanUtils.copyProperties(reg, entity);
		UserDtlsEntity savedentity = userrepo.save(entity);
       return "register";
	}

}
