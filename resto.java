package Child;

public class resto {
    public String menu;
    public int harga, pajak;

    public void view(){
        System.out.println( "Menu  : " + menu);
        System.out.println( "Harga : Rp. " + harga);
        System.out.println( "Pajak : " + pajak + "%");
    }

    public static class nasiAyam extends resto{}
    public static class nasiDaging extends resto{}
    public static class nasiIkan extends resto{}
}
