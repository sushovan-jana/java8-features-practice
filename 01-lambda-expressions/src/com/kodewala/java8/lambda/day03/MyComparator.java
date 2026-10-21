package com.kodewala.java8.lambda.day03;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		if o1 is bigger then it should go after o2 -> return +ve
//		if o1 is smaller then it should come before o2 -> return -ve
//		if both are equal then -> return 0
		return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
	}
}
