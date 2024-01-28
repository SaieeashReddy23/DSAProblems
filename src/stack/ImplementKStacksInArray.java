package stack;

import java.util.Arrays;

public class ImplementKStacksInArray {

//    N is capacity of array and k is no of stacks


    /*
    *
    * Here next array is doing two duties , it is having the next element means in the stack from top the next element that is below and
    *
    *   it is also having the next free element pos no for that pos
    *
    *
    * */


    private int[] arr;
    private int[] next;
    private int[] top;
    private int freeTop;




    public ImplementKStacksInArray(int n , int k) {
        arr = new int[n];
        next = new int[n];
        top = new int[k];
        Arrays.fill(top , -1);
        for(int i=0 ; i < n-1 ; i++){
            next[i] = i+1 ;
        }
        next[n-1] = -1;
        freeTop = 0;
    }


    public void push(int x , int sn){

        if(freeTop == -1){
            System.out.println("No space");
            return;
        }

        int i = freeTop;
        arr[i] = x;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
    }

    public void pop(int sn){

        if(top[sn] == -1){
            System.out.println( sn + " Stack is empty");
        }

        int i = top[sn];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;

    }


    public void print(){

        System.out.println("=======================================================");
        System.out.print("Normal array : ");
        for(int i=0; i< arr.length ;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("next array : ");
        for(int i=0; i< next.length ;i++){
            System.out.print(next[i] + " ");
        }

        System.out.println();

        System.out.print("top array : ");
        for(int i=0; i< top.length ;i++){
            System.out.print(top[i] + " ");
        }

        System.out.println();

        System.out.println("Free : " + freeTop);
        System.out.println("=======================================================");

    }




}
