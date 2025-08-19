package JAP82.OOPs.ClassMethod;

class Prime{

    boolean checkPrimeNumber(int n)
    {
        boolean b = false;
        if(n==0|| n==1)
        {
            b= true;
        }
        else
        {
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    b=true;
                    break;
                }
            }
        }
        return !b;
    }

    int findNthprime(int n)
    {
        int count =0, a=0;
        while (true) {
            if(checkPrimeNumber(a))
            {
                count++;
            }
            if(count==n)
            {
                break;
            }
            a++;
        }
        return a;
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Prime p2 = new Prime();
        System.out.println(p2.findNthprime(7));
    }
}
