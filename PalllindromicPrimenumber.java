package JAP82.OOPs.ClassMethod;

class pallindrommic {
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

    boolean checkPallindromicPrime(int n)
    {
        boolean b = false;
        if(n==reverseNumber(n))
        {
            if (checkPrime(n)) {
                b=true;
            }
        }
        return b;
    }
}

public class PalllindromicPrimenumber {
    public static void main(String[] args) {
        pallindrommic p1 = new pallindrommic();
        System.out.println(p1.checkPallindromicPrime(5425));
    }
}
