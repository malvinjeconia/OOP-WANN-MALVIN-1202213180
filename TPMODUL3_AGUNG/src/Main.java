import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant rest = new Restaurant();
        int id,ord;

        try{    
            System.out.print("Enter Customer ID : ");
            id = input.nextInt();
            System.out.print("Enter how much food to made : ");
            ord = input.nextInt();

            Thread th1 = new Thread(rest);
            Waiters waiter = new Waiters(ord,id);
            Thread th2 = new Thread(waiter);

            th1.start();
            th2.start();
            th1.join();
            th2.join();

        }catch(Exception e){
            System.out.println("Input must be Integer");
        }

    }
}
