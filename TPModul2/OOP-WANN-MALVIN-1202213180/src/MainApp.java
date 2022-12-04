public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat p = new Perangkat("Adata",2,1.80F);
        p.information();
        System.out.print("\n");

        Laptop lepi = new Laptop("Seagate",8,2.40F,true);
        lepi.information();
        lepi.Open("Dota 2");
        lepi.SentEmail("niceyuk@gmail.com");
        lepi.SentEmail("annarji@gmail.com","rusmangc@gmail.com");

        System.out.print("\n");
        Handphone gawai = new Handphone("Sandisk",3,2.20F,false); 
        gawai.information();
        gawai.telfon(628122122);
        gawai.SentSMS(62852112);
        gawai.SentSMS(628121212,629292211);
    }
}
