import Bricks.Core;
import threds.Handing;
import threds.Print;

///程序的入口
public class Test {
    public static void main(String[] args){
        Core core = new Core();
        Print print = new Print();
        //Handing handing = new Handing();
        Thread printThread = new Thread(print);
        Thread handingThread = new Thread(print);
        printThread.setName("打印");
        handingThread.setName("搬运");
        printThread.start();
        handingThread.start();

    }

}
