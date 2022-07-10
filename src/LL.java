import java.util.*;
import java.io.*;


public class LL
{
    public Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add
    public void addF(String data){

        Node node=new Node(data);

        if(head==null){
            head=node;
            return;
        }

        node.next=head;
        head=node;
    }

    //add
    public void addL(String data){

        Node node=new Node(data);

        if(head==null){
            head=node;
            return;
        }

        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=node;
    }

    //print
    public void priL(){

        if(head==null){
            System.out.println("List empty");
            return;
        }

        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list =new LL();

        list.addF("hello");
        list.addL("RAJ");
        list.priL();
    }
}
