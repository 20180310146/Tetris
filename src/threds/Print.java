/// 打印数组的线程
package threds;

import Bricks.Core;

public class Print implements Runnable{
    @Override
    public void run() {
        while(true){
            caozuo();
            try{
                Thread.sleep(10000);  //打印一秒执行一次
            }
            catch (InterruptedException e){
            }

        }

    }
    public synchronized void ceshi(){
        if(Thread.currentThread().getName().equals("打印")){
            for(int i = 0; i < 3; i ++){
                System.out.println("打印的第"+i+"次");
            }
        }
        else {
            for(int i = 0; i < 3; i ++){
                System.out.println("搬运的第"+i+"次");
            }
        }


    }
    public synchronized void ceshi_1(){
        for(int i = 0; i < 3; i ++){
            System.out.println("搬运的第"+i+"次");
        }

    }
    public synchronized void caozuo(){
        if(Thread.currentThread().getName().equals("打印")){
            print();
        }
        else {
            handing();

        }


    }
    /*打印的方法*/
    public void print(){

            for(int i =0;i < Core.twoArray.length; i++){  //前四行为方块出生点，不打印显示
                for(int j = 0; j < Core.twoArray[i].length; j++){
                    int number_n = 0;
                    String newline = "";
                    if(j == Core.twoArray[i].length-1) number_n = 1;
                    if(i == Core.twoArray.length-1 && j == Core.twoArray[i].length-1) number_n = 9;
                    for(int y=0; y<number_n; y++){
                        newline += "\n";
                    }
                    System.out.print(Core.twoArray[i][j] + newline);
                }
            }



    }
    /*搬运的方法*/
    public void handing(){
            if(Core.jihe[0] != 0){
                for(int i = 0; i < Core.jihe.length - 1; i ++){
                    if(i%2 != 0) continue;
                    Core.twoArray[Core.jihe[i]-1][Core.jihe[i+1]] = 0;
                }
            }

            for(int i = 0; i < Core.jihe.length - 1; i ++){
                if(i%2 != 0) continue;
                Core.twoArray[Core.jihe[i]][Core.jihe[i+1]] = 1;
            }
            Core.jihe[0] ++;
            Core.jihe[2] ++;
            Core.jihe[4] ++;
            Core.jihe[6] ++;


    }
}
