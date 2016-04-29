package com.myEjb.business;

import javax.naming.InitialContext;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44 
 * @desc: 
 * 
 */
public class Client {
	public static void main(String[] args) throws Exception {
		InitialContext ctx = new InitialContext();
		Calculator calculator = (Calculator) ctx.lookup("CalculatorBean/remote");
		System.out.println("1 + 1 = " + calculator.add(1, 1));
		System.out.println("1 - 1 = " + calculator.subtract(1, 1));
	}
}
