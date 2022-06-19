package com.springboot.beans.service;

import com.springboot.beans.binding.Loginform;
import com.springboot.beans.binding.Regform;

public interface UserManageService {
	
	public String loginform(Loginform login);
	
	public String signup(Regform reg);

	
}
