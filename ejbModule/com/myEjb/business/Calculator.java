package com.myEjb.business;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44
 * @desc:
 * 
 */

public interface Calculator {
	int add(int x, int y);

	int subtract(int x, int y);
}

@Local
interface CalculatorLocal extends Calculator {
}

@Remote
interface CalculatorRemote extends Calculator {
}

