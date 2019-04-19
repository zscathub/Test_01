package cn.zscat.niuke;

import java.util.List;

/*
题目描述
    输入一个链表，输出该链表中倒数第k个结点。

 */

/*
思路
    两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指针走(k-1)步，到达第k个节点。
    然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了
 */

public class Test_14 {
        public static void main(String[] args) {

        }

    public static ListNode FindKthTotail(ListNode head,int k){
        ListNode list_1=head;
        ListNode list_2=head;
        if (head==null || k<=0){
            return null;
        }
        for (int i = 1; i < k; i++) {
            if(list_1.next!=null){
                list_1=list_1.next;
            }else {
                return null;
            }
        }

        while(list_1.next!=null){
            list_1=list_1.next;
            list_2=list_2.next;
        }
        return  list_2;
    }

    public static ListNode FindKthTotail_pro(ListNode head,int k){
        ListNode p,q;
        p=q=head;
        int i=0;
        while(p!=null){
            if (i>=k){
                q=q.next;
            }
            p=p.next;
        }

        return i<k ? null : q;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}