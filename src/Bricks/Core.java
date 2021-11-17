package Bricks;

public class Core {
    public static int[][] twoArray;
    public static int[] jihe = new int[8];

    public Core(){
        ///初始化核心数组，并用数字0填充满
        twoArray = new int[24][10];
        /// 填充核心数组，初始值都为0，
        /// 值为0时，代表没有方块；值为1时，代表有方块
        for(int i = 0; i < 24; i ++){
            int [] row = new int[10];
            for(int j = 0; j < 10; j ++){
                row[j] = 0;
            }
            twoArray[i] = row;
        }
        jihe[0] = 0;
        jihe[1] = 0;
        jihe[2] = 0;
        jihe[3] = 1;
        jihe[4] = 1;
        jihe[5] = 0;
        jihe[6] = 1;
        jihe[7] = 1;
    }
}
