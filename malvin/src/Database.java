
import java.util.Scanner;
public class Database {
    public Menu menu = new Menu();
    public String inp;
    public Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.print("Masukan Nama Menu :");
        inp = scan.nextLine();
        System.out.println("Hasil Pencarian :" + inp);
    }
    public void Display(){
        menu.showMenu();
    }
    public void pencarian(){
        menu.isiMenu(inp);
    }
}
