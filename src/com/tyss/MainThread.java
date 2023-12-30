package com.tyss;

public class MainThread {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
