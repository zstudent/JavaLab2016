package lesson160510;

public class BasicThread {    

    public static void main(String[] args) throws InterruptedException {
        
        Thread thread = new Thread(() -> System.out.println(">>> I am running in a separate thread!"));
        
        thread.start();
        thread.join();        

    }    
}