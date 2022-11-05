
import java.util.Scanner;
public class User {
    public String nama;
    public String nomorHp;
    public Scanner scan = new Scanner(System.in);
    public void isianNama(){
        System.out.print("Nama :");
        nama = scan.nextLine();
    }
    public void isianNomor(){
        System.out.print("No.Handphone :");
        nomorHp = scan.nextLine();
    }
    public void berhasil(){
        System.out.println("Register Success");
        System.out.println("Name :"+ nama);
    }
   

}
