package Child;

import Parent.handphone;

public class rego extends handphone{
	public rego(int a){
		super.d();
		System.out.println("Harga ram 8/256   : Rp. " + a);
	}
	
	public rego(int a, int b){
		super.d();
		System.out.println("Harga ram 8/256    : Rp. " + a);
		System.out.println("Harga ram 8/128    : Rp. " + b);
	}
}