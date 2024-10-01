package com.bptn.course._03_flow_control._02_for_loop;

public class FindOddPosInArray {

	public static void main(String[] args) {
		int [] numbers = new int [] {10, 20, 30, 40, 50};  

        System.out.println("At odd indexes, the elements are: ");
// FREEZE CODE END
        for(int i=1; i<numbers.length ; i+=2) {
        	System.out.println(numbers[i]);
        	}
	
	}   

}
