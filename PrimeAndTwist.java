package JAP82.OOPs.ClassMethod;

class Twist{
    int reverseNumber(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum*=10;
            sum=sum+n%10;
            n/=10;
        }
        return sum;
    }
    boolean checkPrime(int n)
    {
        boolean b=false;
        if(n==0||n==1)
        {
            b=true;
        }
        else{
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    b = true;
                    break;
                }
            }
        }
        return !b;
    }
    boolean checkPrimeandTwist(int n)
    {
        boolean b = false;
        if(checkPrime((reverseNumber(n))))
        {
            b=true;
        }
        return b;
    }
}

public class PrimeAndTwist {
    public static void main(String[] args) {
        Twist t1 = new Twist();
        System.out.println(t1.checkPrimeandTwist(5697));
    }
}
