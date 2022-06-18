package Child;

import Parent.handphone;

public class sistemOperasi extends handphone{
	public sistemOperasi(String OS){
		super.b();
		System.out.println("Sistem Operasi   : " + OS);
	}
	
	public sistemOperasi(String OS, String ui){
		super.b();
		System.out.println("Sistem Operasi   : " + OS);
		System.out.println("Nama UI          : " + ui);
	}
	
	public sistemOperasi(String OS, String ui, String android){
		super.b();
		System.out.println("Sistem Operasi     : " + OS);
		System.out.println("Nama UI            : " + ui);
		System.out.println("Android            : " + android);
	}
}
