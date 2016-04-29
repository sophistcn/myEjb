package com.myEjb.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��2��3�� ����2:46:44 
 * @desc: 
 * 
 */
@Stateless
@Remote
public class FirstEjbBean implements FirstEjb {

	@Override
	public String saySomething(String name) {
		  return "���," + name;  
	}

}

