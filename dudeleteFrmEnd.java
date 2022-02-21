import java.util.*;
class node
{
    int data;
    node next;
    node prev;
    node tail;
    node(int data)
    {
        this.data=data;
    }
}
public class dudeleteFrmEnd
{
    node head;
    node tail;
    public void insertAtBeg(int data)
    {
        node n=new node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.next=head;
            head.prev=n;
            head=n;
            
        }
    }
    public void deletefrmEnd()
    {
        if(head==null)
        {
            return;
        }
        else
        {
            if(head.next==null)
            {
                head=null;
                tail=null;
            }
            else
            {
                tail.prev.next=null;
                tail=tail.prev;
            }
        }
    }
    public void printlm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    } 

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dudeleteFrmEnd obj=new dudeleteFrmEnd();
        int na=sc.nextInt();
        for(int i=0;i<na;i++)
        {
            int num=sc.nextInt();
            obj.insertAtBeg(num);
        }
        obj.deletefrmEnd();
        obj.printlm();
        
    }
}