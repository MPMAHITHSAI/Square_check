package Squareprob;
import java.util.*;

class Square_check {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int value = sc.nextInt();
        if(squareval(value)==1) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static int squareval(int sq)
    {
        for (int i=1; i*i<=sq; i++)
        {
            if((sq%i==0) && (sq/i==i))
            {
                return 1;
            }
        }
        return sq;
		
    }
}