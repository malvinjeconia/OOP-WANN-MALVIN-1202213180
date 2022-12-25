public class Waiters implements Runnable{
    private int Quantity,id,price;
    public Waiters(int Quantity,int id){
        this.Quantity = Quantity;
        this.id = id;
        this.price = 25000;
    }

    public void run(){
        while(true){
            getFood();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void orderInfo(){
        System.out.println("==============================");
        System.out.println("Customer ID : " + this.id);
        System.out.println("Number of Food : " + this.Quantity);
        System.out.println("Total Price : " + (this.Quantity * this.price));
        System.out.println("==============================");
    }
    public void getFood(){
        synchronized(Restaurant.lock()){
            System.out.println("Waiter : Food is ready to deliver");
            Restaurant rest = new Restaurant();
            rest.PickupDuration(false);
            if(rest.NoFood() == this.Quantity + 1){
                orderInfo();
                System.exit(0);
            }
            rest.lock().notifyAll();
            System.out.println("Waiter : Tell the restaurant to make another food \n");
        }
    }

}
