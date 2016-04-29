package com.myEjb.business;

import javax.ejb.Stateless;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��2��3�� ����2:46:44 
 * @desc: 
 * 
 */

@Stateless
public class CalculatorBean implements CalculatorRemote, CalculatorLocal {
	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}
}
