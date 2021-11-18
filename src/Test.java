import Bricks.Core;
import threds.Print;
import Test.Mydll;

///程序的入口
public class Test {
    public static void main(String[] args){
        Core core = new Core();
        Print print = new Print();
        Thread printThread = new Thread(print);
        Thread handingThread = new Thread(print);
        printThread.setName("打印");
        handingThread.setName("搬运");
        handingThread.start();
        printThread.start();
        while (true){
            try{
                int a = Mydll.mydll.qiguai_1();
                if(a == 100){
                    Core.jihe[1] += 1;
                    Core.jihe[3] += 1;
                    Core.jihe[5] += 1;
                    Core.jihe[7] += 1;
                }
            }
            catch ( Exception e){

            }
        }


    }

}
