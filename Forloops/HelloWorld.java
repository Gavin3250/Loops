public class HelloWorld
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("i is " + i + " but is less than or equal to 15");
        }
    }
    public void run2() {
        for (int j = 10; j >= 0; j = j + (-2)) {
            System.out.println("j is " + j + "more than 0");
        }
    }
    public void run3(){
        for (int k = 10; k != 0; k = k + (-3)) {
            System.out.println("k is " + k + " more than 0");
        }
    }
    public static void main (String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.run();
        hw.run2();
        hw.run3();
        
    }
}