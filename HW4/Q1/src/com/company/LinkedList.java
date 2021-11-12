package com.company;

public class LinkedList {
    public Node head;
    int length;

    public LinkedList(){
        this.length = 0;
        head = null;
    }

    public int length(){
        return this.length;
    }

    public void addAtPosition(int index, int element){
        if(index > length) return;
        synchronized (this){
            if(index == 0) {
                Node prev = head;
                head = new Node(element);
                head.next = prev;
                length++;
            }else{
                length++;
                Node pres = head;
                for(int i=0;i<index-1;i++){
                    pres = pres.next;
                }
                Node node = new Node(element);
                node.next = pres.next;
                pres.next = node;
            }
        }
    }

    public void removeAtPosition(int index, int element){
        if(index > length) return;
        synchronized (this){
            length--;
            Node pres = head;
            for(int i=0; i<index-1;i++){
                pres = pres.next;
            }
            pres.next = pres.next.next;
        }
    }
    public int getFirst(){
        synchronized (this){
            return head.next.val;
        }
    }

    public int getLast(int index) {
        synchronized (this){
            Node tail = head;
            for(int i=0; i< index; i++){
                tail = tail.next;
            }
            return tail.val;
        }
    }

    public int size(){
        return length;
    }

}
