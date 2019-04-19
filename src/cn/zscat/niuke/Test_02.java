package cn.zscat.niuke;
/*
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

 */


/*
解题思路：
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
      从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
 */

public class Test_02 {

    public static void main(String[] args) {
        StringBuffer str =new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));

    }

    public static String replaceSpace(StringBuffer str){
        int space_num=0;    //计算空格数
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                space_num++;
            }
        }

        int indexold =str.length()-1;   //替换前的下标
        int newlenth =str.length()+2*space_num;     //计算新字符串长度
        int indexnew =newlenth-1;   // 替换后的下标
        str.setLength(newlenth);    //  扩大字符串长度

        for (;indexold>=0 && indexold<newlenth;--indexold) {
            if(str.charAt(indexold)==' '){
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');

            }else{
                str.setCharAt(indexnew--,str.charAt(indexold));
            }
        }

        return str.toString();
    }
}
