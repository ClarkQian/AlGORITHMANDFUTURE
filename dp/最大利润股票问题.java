

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static int solve(int[]prices,int fee){
		int[]res = new int[prices.length];
		res[0] = 0;
		for(int i = 1; i < prices.length; i++){
			int tmp = 0;
			for(int j = 0; j < i; j++){

				if(prices[j] + fee < prices[i]){
					tmp = Math.max(prices[i] - prices[j] - fee+res[j], tmp);
				} else {
					tmp = Math.max(res[j], tmp);
				}
				
			}
			res[i] = tmp;
		}
		return res[prices.length-1];
		
	}
	
	public static void main(String[] args) {
		int prices[] = new int[]{1,3,2,8,4,9};
		int fee = 2;
		System.out.println(solve(prices,fee));
	}
}
