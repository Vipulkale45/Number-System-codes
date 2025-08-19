package JAP82.OOPs.ClassMethod;

class Perfect 
{
    boolean checkPerfect(int n)
    {
       int sum=0;
       for(int i=1; i<=n/2; i++)
       {
        sum+=i;
       }
       return sum==n;
    }
}
public class PerfectNumber {
    public static void main(String[] args) {
        Perfect p1 = new Perfect();
        System.out.println(p1.checkPerfect(6));
    }
}
