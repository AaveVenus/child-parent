package Child;

import Parent.handphone;

public class type extends handphone{
	public type(String jenis){
		super.a();
		System.out.println("Jenis  : " + jenis);
	}
	
	public type(String jenis, String model){
		super.a();
		System.out.println("Jenis      : " + jenis);
		System.out.println("Model      : " + model);
	}
	
	public type(String jenis, String model, String codename){
		super.a();
		System.out.println("Jenis              : " + jenis);
		System.out.println("Model              : " + model);
		System.out.println("Codename           : " + codename);
	}
}
