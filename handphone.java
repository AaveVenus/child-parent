package Parent;

public class handphone {
    public handphone(){
        System.out.println("============================================");
    }
    
    public handphone(String perusahaan){
        System.out.println("Nama Perusahaan    : " + perusahaan);
    }
    
    public handphone(String perusahaan, String brand){
        System.out.println("Nama Perusahaan      : " + perusahaan);
        System.out.println("Nama Organisasi      : " + brand);
    }
    
    public handphone(String perusahaan, String brand, String produk){
            System.out.println("Nama perusahaan    : " + perusahaan);
            System.out.println("Nama Organisasi    : " + brand);
            System.out.println("Jenis Produk       : " + produk);
    }
    
    protected void a() {
        System.out.println("\t\t====> TIPE PRODUK <====");
    }
    
    protected void b() {
        System.out.println("\t\t====> SISTEM OPERASI <====");
    }
    
    protected void c(){
        System.out.println("\t\t====> SPESIFIKASI <====");
    }
    
    protected void d(){
        System.out.println("\t\t====> HARGA <====");
    }
}