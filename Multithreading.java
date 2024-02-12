import java.util.Random;

class RandomNum implements Runnable{
    static int random;
    Random  r = new Random();
    public void run(){
        random = r.nextInt(25);
        System.out.println(random);
    }
}
class isEven implements Runnable{
    public void run(){
        if(RandomNum.random % 2 == 0)
            System.out.println((int)Math.pow(RandomNum.random, 2)+"\n");
    }
}
class isOdd implements Runnable{
    public void run(){
        if(RandomNum.random % 2 != 0)
            System.out.println((int)Math.pow(RandomNum.random, 3)+"\n");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            Thread t1 = new Thread(new RandomNum());
            Thread t2 = new Thread(new isEven());
            Thread t3 = new Thread(new isOdd());
            t1.start();
            t2.start();
            t3.start();

            try{
                Thread.sleep(1000);
            }catch(Exception e){
               System.out.println("could not start Thread");
            }
           
        }
    }
}
