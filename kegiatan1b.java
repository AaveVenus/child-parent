package Parent;

class jualan {
    public String nama, produk, total;

    public void metu() {
        System.out.println("Nama    : " + nama);
        System.out.println("Produk  : " + produk);
        System.out.println("Harga   : " + total);
    }
}

class Ayah extends jualan {
}

class Ibu extends jualan {
}

class Anak extends jualan {
}

public class kegiatan1b {
    public static void main(String[] args) {
        System.out.println("List Pembelian Toko");
        Ayah nota = new Ayah();
        nota.nama = "Ayah Budi";
        nota.produk = "Sabun";
        nota.total = "Rp. 10.000";
        nota.metu();
        System.out.println();

        Ibu nota1 = new Ibu();
        nota1.nama = "Ibu Budi";
        nota1.produk = "Roti";
        nota1.total = "Rp. 5000";
        nota1.metu();
        System.out.println();

        Anak nota2 = new Anak();
        nota2.nama = "Anak Budi";
        nota2.produk = "Sampo";
        nota2.total = "Rp. 15.000";
        nota2.metu();
        System.out.println();
    }
}
