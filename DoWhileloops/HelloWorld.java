public class HelloWorld
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        } while (i < 15);
    }
    public void run2() {
        int k = 9;
        do {
            System.out.println("k is " + k + " but is more than 5");
            k--;
        } while (k > 5);
    }
    public void run3(){
        int a = 4;
        int b = 9;
        do {
            System.out.println("a is " + a + " but isless than 10" + 
            "b is " + b + "but is less than 20");
            a++;
            b++;
            
        } while (a < 10 && b <= 20);
    }
    public static void main (String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.run();
        hw.run2();
        hw.run3();
        
    }
}