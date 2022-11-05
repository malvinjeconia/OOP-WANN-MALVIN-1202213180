public class Menu {

    public String[] makanan = {"Bakso","EsTeh","Brownies"};
    public String[] jenis = {"(Makanan)","(Minuman)","(Dessert)"};
    public String[] harga = {"Rp.10000","Rp.5000","Rp.15000"};
    public void showMenu(){
        System.out.println("1" + makanan[0] + jenis[0]+ harga[0]);
        System.out.println("2" + makanan[1] + jenis[1]+ harga[1]);
        System.out.println("3" + makanan[2] + jenis[2]+ harga[2]);
    }
    public void isiMenu(String masukUsr){
        switch(masukUsr){
            case "bakso":
            System.out.println(makanan[0]+jenis[0]+harga[0]);
            break;
            case "esteh":
            System.out.println(makanan[1]+jenis[1]+harga[1]);
            break;
            case "brownies":
            System.out.println(makanan[2]+jenis[2]+harga[2]);
        }
    }
}
