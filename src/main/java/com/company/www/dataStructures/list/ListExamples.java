package com.company.www.dataStructures.list;
import com.company.www.utils.LinkNode;


public class ListExamples {

    public LinkNode searchNode(LinkNode head, int key){
            while(head != null || (int)head.data == key)
                head = head.next;
        return head;
    }

}
