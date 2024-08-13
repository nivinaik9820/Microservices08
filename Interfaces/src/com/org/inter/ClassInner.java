package com.org.inter;

import com.org.inter.Cpu.Proccessor;

class Cpu{
	double price;
	protected class ram{
		double memory;
		String manifacture;
		double getclockspeed() {
			return 5.2;
		}
	}
	class Proccessor{
		double cores;
		String manifacture;
		double getcache(){
			return 1;
		}
		
		
	}
	
}

public class ClassInner {
	public static void main(String args[])
	{
		Cpu c=new Cpu();
		Cpu.Proccessor p=c.new Proccessor();
		System.out.println(p.getcache());
		
		
	}
}
