package com.bptn.course._03_flow_control._04_switch_statement;

public class SwitchStatement {

	public static void main(String[] args) {
		for(int i = 0; i <= 6; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("We've finished the loop!");

    }
	}

