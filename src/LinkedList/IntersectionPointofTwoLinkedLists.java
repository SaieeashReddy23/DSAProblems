package LinkedList;

public class IntersectionPointofTwoLinkedLists {


    /*
    *
    * Idea is get absolute of l1 and l2 , now move the pointer that many times
    *
    *
    * From here start moving both pointers and you will find intersection.
    *
    * */

    public static void run(Node head1 , Node head2){

        Node curr1 = head1;
        Node curr2 = head2;

        int l1 = 0;
        int l2 = 0;

        while(curr1 != null){
            curr1 = curr1.getNext();
            l1++;
        }

        while(curr2 != null){
            curr2 = curr2.getNext();
            l2++;
        }

        int diff = Math.abs(l1-l2);

        Node curr;

        if(l1 > l2){
            curr1 = head1;
            curr2 = head2;
            int count = 0;
            while(curr1 !=null && count < diff ){
                curr1 = curr1.getNext();
                count++;
            }

        }else {
            curr1 = head1;
            curr2 = head2;
            int count = 0;
            while(curr2 !=null && count < diff ){
                curr2 = curr2.getNext();
                count++;
            }


        }

        while(curr1!=null && curr2 !=null){
            if(curr1 == curr2){
                System.out.println(curr1.getVal() + " is the intersection point");
                return;
            }
            curr1 = curr1.getNext();
            curr2 = curr2.getNext();
        }

        System.out.println("Not intersection found");


    }
}
