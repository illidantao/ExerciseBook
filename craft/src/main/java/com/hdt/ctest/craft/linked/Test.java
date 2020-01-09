package com.hdt.ctest.craft.linked;

import com.hdt.ctest.craft.Node;
import com.hdt.ctest.craft.Utils;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-08 10:45
 * @use 链表操作 练习题；
 * 单链表倒转；
 * 链表序号奇偶排序；
 */
public class Test {

    public static void main(String[] args){
        Node origin = Utils.getNode(8);
        Utils.printListNode(origin);
        System.out.println("=====");
        Utils.printListNode(oddEven(origin));
    }

    /**
     *
     * @param node
     * @return
     */
    public static Node reverse(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node pre = null;
        Node now = node;
        Node next = node.next;
        while(next != null){
            now.next = pre;

            pre = now;
            now = next;
            next = next.next;
        }
        //注意：不要落了最后一个元素的指向
        now.next = pre;

        return now;
    }

    /**
     *
     * @param node
     * @return
     */
    public static Node reverse2(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node pre = null;
        Node now = node;
        Node next = node.next;
        //以 当前节点作为判空条件
        while(now != null){
            now.next = pre;

            pre = now;
            now = next;
            if(next != null)
                next = next.next;
        }
        //跳出循环，则 now 必然为 null，以 pre 为 链表头
        return pre;
    }

    /**
     *  单链表按顺序序号奇偶重排，奇数序号在前偶数序号灾后，135246
     * @param node
     * @return
     */
    public static Node oddEven(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node odd = node;
        Node even = node.next;
        Node evenHead = node.next;

        while (odd != null && even != null){
            odd.next = even.next;
            if(even.next != null){
                even.next = even.next.next;
            } else {
                break;
            }

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return node;
    }
}
