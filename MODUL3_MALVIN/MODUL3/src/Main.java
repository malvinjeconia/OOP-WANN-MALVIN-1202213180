import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    boolean mengulang = true;
    Scanner scan = new Scanner(System.in);
    Calculation perhitungan = new Calculation();

    do {
      
      try {

        System.out.println("=== Menu Program ==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapoized");
        System.out.print("Select menu : ");

        int menu = scan.nextInt();
        switch (menu) {
          
          case 1:
            System.out.print("Enter the length of the side of the square : ");
            double kotak = scan.nextDouble();
            perhitungan.setSquare(kotak);
            perhitungan.run();
            System.out.println("Result = " + perhitungan.getSquare());
            break;

          case 2:
            System.out.print("Enter the radius of circle : ");
            double lingkaran = scan.nextDouble();
            perhitungan.setCircle(lingkaran);
            perhitungan.run();
            System.out.println("Result = " + perhitungan.getCircle());
            break;

          case 3:
            System.out.print("Insert the side of the base of the trapezoid : ");
            double a = scan.nextDouble();
            System.out.print("Enter the upper side of the trapezoid : ");
            double b = scan.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double c = scan.nextDouble();

            perhitungan.setTrapezoid(a, b, c);
            perhitungan.run();
            System.out.println("Result = " + perhitungan.getTrapezoid());

          case 0:
            System.out.println("Program End");
            mengulang = false;
            break;
          default:
            System.out.println("Option tidak tersedia");
            continue;
        }

    } catch (InputMismatchException e) {
        System.out.println("Error: Input must be a number");
        scan.next();
    } catch (IllegalArgumentException e) {
        System.out.println(e);
    } 
  } while (mengulang);
  scan.close();
  }
}