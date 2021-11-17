package threds;
import Bricks.Core;
/**
 * 搬运方块
 * */
public class Handing implements Runnable{
    @Override
    public void run() {
/*        while (true){
            handing();
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }

        }*/
        ceshi();
    }
    public synchronized void ceshi(){
        for(int i = 0; i < 3; i ++){
            System.out.println("搬运的第"+i+"次");
        }

    }
    public synchronized void handing(){
        int[] jihe = new int[8];
        jihe[0] = 0;
        jihe[1] = 0;
        jihe[2] = 0;
        jihe[3] = 1;
        jihe[4] = 1;
        jihe[5] = 0;
        jihe[6] = 1;
        jihe[7] = 1;
        if(jihe[0] != 0)
        {
                for(int i = 0; i < jihe.length - 1; i ++){
                    if(i%2 != 0) continue;
                    Core.twoArray[jihe[i]-1][jihe[i+1]] = 0;
                }
        }

            for(int i = 0; i < jihe.length - 1; i ++){
                if(i%2 != 0) continue;
                Core.twoArray[jihe[i]][jihe[i+1]] = 1;
            }
            jihe[0] ++;
            jihe[2] ++;
            jihe[4] ++;
            jihe[6] ++;

    }
}
