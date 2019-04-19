package cn.zscat.niuke;

/*

题目描述
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


 */
public class Test_01 {
    public static void main(String[] args) {
        int [][] b= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int a=7;
        System.out.println(Find(a,b));

    }

    public static boolean Find(int target, int [][] array) {
        int lie = array[0].length;
        int han = array.length;
        boolean found = false;
        int c = lie - 1;
        int r = 0;
        while (r <han && c>=0){
            int value=array[r][c];
            if(target>value){
                c--;
            }else if(target>value){
                r++;
            }else{
                found=true;
                break;
            }
        }

        return found;
    }
}
