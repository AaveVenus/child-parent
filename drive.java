package Parent;

import Child.*;

public class drive {
	public static void main(String[] args) {
		new handphone();
		System.out.println("\t\t====> INFORMASI <====");
		new handphone("Xiaomi Inc.","Xiaomi","Alat Elektronik");
		new type("Handphone","Poco F3","Alioth");
		new sistemOperasi("Android","MIUI 13","Android 12 (Snow Cone)");
		new spek("256GB dan 128GB","6GB dan 8GB","Snapdragon 870");
		new rego(5499999,4999999);
	}
}
