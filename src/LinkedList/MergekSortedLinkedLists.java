package LinkedList;

public class MergekSortedLinkedLists {

    public static void run(Node[] arr , int k){

        Node head = mergeKList(null , 4);
    }

    public static Node mergeKList(Node[]arr,int k)
    {
        //Add your code here.

        if(k == 1){
            return arr[0];
        }

        Node result = null;

        int l = 0;
        int r = k-1;

        while(l < r){

            if(result == null){
                result =  merge(arr[l],arr[r]);
            }else {
                Node sorted = merge(arr[l],arr[r]);
                result = merge(result , sorted);
            }

            l++;
            r--;
        }

        if(k%2 == 1){
            result = merge(result , arr[k/2]);
        }

        return result;

    }

    public static Node merge(Node head1 , Node head2){

        Node result = null;

        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        if(head1.getVal() <= head2.getVal()){
            result = head1;
            Node sorted = merge(head1.getNext() , head2);
            result.setNext(sorted);
        }else{
            result = head2;
            Node sorted = merge(head1 , head2.getNext());
            result.setNext(sorted);
        }

        return result;
    }
}
