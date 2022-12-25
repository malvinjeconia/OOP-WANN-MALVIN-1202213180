public class Restaurant implements Runnable{
    private boolean PickupDuration = false;
    private static final Object lock = new Object();
    private static int NoFood = 1;

    @Override
    public void run(){
       while(true){
           Food();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
       }
    }

    public void PickupDuration(boolean PickupDuration){
        this.PickupDuration = PickupDuration;
    }

    public static int NoFood(){
        return NoFood;
    }

    public static Object lock(){
        return lock;
    }

    public void Food(){
        synchronized(lock()){
            if(this.PickupDuration){
                try{
                    System.out.println("Restaurant : Waiting for the waiter to deliver the food");
                    lock().wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
        }
        PickupDuration = true;
        System.out.println("Restaurant : Making food Number "+NoFood++);
        lock().notifyAll();
        System.out.println("Restaurant : Telling the waiter to get food\n");
    }
    }
    
}
