package math;

public class LCM {

    public static void run (int a , int b){
        int max = Math.max(a, b);
        int i = max;
        while(true){
            if(i%a == 0 && i%b == 0){
                break;
            }
            i++;
        }
        System.out.println("LCM of " + a + " " + b + " is " + i);
    }


//    Based on the proof that a*b = LCM(a,b) * GCD(a,b)
    public static void effSol(int a , int b){
        int gcd = GCDorHCP.gcd(a, b);

        int lcm = (a*b)/gcd;

        System.out.println("LCM of " + a + " " + b + " is " + lcm);

    }



}
