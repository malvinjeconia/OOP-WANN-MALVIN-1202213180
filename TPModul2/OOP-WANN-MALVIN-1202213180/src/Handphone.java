public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone (String drive , int ram , float processor , boolean fingerprint){
        super(drive , ram , processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void information(){
        System.out.println("Handphone ini meimiliki driver tipe"+drive+"dengan ram sebesar "+ram+"Gb dan processor");
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }
    public void SentSMS(int no_hp){
        System.out.println("handphone berhasil mengirim SMS ke no "+no_hp);
    }
    public void SentSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengeirim SMS ke No"+no_hp1+"dan ke No"+no_hp2);
    }
}
