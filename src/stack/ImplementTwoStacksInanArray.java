package stack;

public class ImplementTwoStacksInanArray {
    private int[] arr;

    private int pos1;

    private int pos2;

    public ImplementTwoStacksInanArray(int capacity){
        arr = new int[capacity];
        pos1 = -1;
        pos2 = capacity;
    }

    public boolean push1(int x){
        if(pos1 < pos2 - 1){
            pos1++;
            arr[pos1] = x;
            return true;
        }

        System.out.println("Stack is full");
       return false;
    }

    public boolean push2(int x){
        if(pos2 > pos1 + 1){
            pos2--;
            arr[pos2] = x;
            return true;
        }

        System.out.println("Stack is full");
        return false;
    }

    public boolean pop1(){

        if(pos1 == -1){
            System.out.println("COuld not pop as , stack 1 is empty");
            return false;
        }
        arr[pos1] = 0;
        pos1--;
        return true;
    }

    public boolean pop2(){
        if(pos2 == arr.length ){
            System.out.println("COuld not pop as , stack 2 is empty");
            return false;
        }

        arr[pos2] = 0;
        pos2++;
        return true;
    }

    public void getSize1(){
        System.out.println(pos1 + 1);

    }

    public void getSize2(){

        System.out.println(arr.length - pos2 );
    }


    public void print(){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
