public class Calculation implements Runnable {
    public double pi = 3.14;
    public double samping, luas, perputaran;

    public void setSquare(double panjang)  {
      if (panjang >= 1){
        this.samping = panjang;
        this.luas = panjang * panjang;
      } else {
        throw new IllegalArgumentException("Side cannot 0");
      }
    }

    public double getSquare() {
        return luas;
      }

    public void setCircle(double r)  {
        this.perputaran = r;
        this.luas = pi * r * r;
      }

      public double getCircle() {
        return luas;
      }

      public void setTrapezoid(double a, double b, double t)  {
       this.luas = 0.5 * (t * (a + b));
      }

      public double getTrapezoid() {
        return luas;
      }

    @Override
    public void run() {
        System.out.println();
        System.out.println("Program will start!");
        for (int i = 3; i >= 1; i--) {
            System.out.println("Starting with thread " + i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}