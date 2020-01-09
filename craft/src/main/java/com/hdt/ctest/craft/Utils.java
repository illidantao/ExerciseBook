package com.hdt.ctest.craft;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-08 10:38
 * @use a
 */
public class Utils {

    /**
     * 制造一个长度为 length 的单链表；
     * @param length
     * @return
     */
    public static Node getNode(int length){
        Node head = null;
        Node node = null;
        for(int i = 1 ;i < length+1; i++){
            Node temp = new Node(i);
            if(node == null){
                node = temp;
                head = temp;
            } else {
                node.next = temp;
                node = temp;
            }
        }
        return head;
    }



    /**
     * 按序打印链表
     * @param node
     */
    public static void printListNode(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
