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

            Thread Thread1 = new Thread(rest);
            Waiters waiter = new Waiters(ord,id);
            Thread Thread2 = new Thread(waiter);

            Thread1.start();
            Thread2.start();
            Thread1.join();
            Thread2.join();

        }catch(Exception e){
            System.out.println("Input must be Integer");
        }

    }
}
