package com.company.www.utils.listExample;
import com.company.www.utils.*;


public class ListExample {

    public LinkNode searchNode(LinkNode head,int key){
            while(head != null || (int)head.data == key)
                head = head.next;
        return head;
    }

}
