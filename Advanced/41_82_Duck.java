package demo;

import java.io.Serializable;

public class Duck extends Animal implements Swimmer,Serializable {
	public void 呼吸() {
		System.out.println("呱");
	}
	public void 下蛋() {
		System.out.println("下蛋了");
	}
	
}
