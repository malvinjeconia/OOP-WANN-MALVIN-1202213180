
public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir trans = new TransportasiAir(4,20000);
        trans.informasi();
        trans.berlayar();
        trans.berlabu();
        System.out.println("\n");
        Sampan sampn = new Sampan(20,50000,2);
        sampn.informasi();
        sampn.berlayar();
        sampn.berlabu();
        sampn.berlabu(2);
        System.out.println("\n");
        Kapal kap = new Kapal(50,10000,"Diesel");
        kap.informasi();
        kap.berlabu();
        kap.berlayar();
        kap.berlayar(20);
    }
}
