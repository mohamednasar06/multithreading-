package com.tyss;

public class Demo1  extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
