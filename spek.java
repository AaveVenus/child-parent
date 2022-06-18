package Child;

import Parent.handphone;

public class spek extends handphone {
	public spek(String internal){
		super.c();
		System.out.println("Penyimpanan   : " + internal);
	}
	
	public spek(String internal, String ram){
		super.c();
		System.out.println("Penyimpanan   : " + internal);
		System.out.println("Ram           : " + ram);
	}
	
	public spek(String internal, String ram, String cpu){
		super.c();
		System.out.println("Penyimpanan        : " + internal);
		System.out.println("Ram                : " + ram);
		System.out.println("Prosesor           : " + cpu);
	}
}