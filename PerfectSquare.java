package JAP82.OOPs.ClassMethod;

class Square{
    boolean chekPerfectSquare(int n)
    {
        return Math.sqrt(n)%1==0;
    }
    boolean checkPerfectcube(int n)
    {
        return Math.cbrt(n)%1==0;
    }
}

public class PerfectSquare {
    public static void main(String[] args) {
        Square s1  = new Square();
        System.out.println(s1.chekPerfectSquare(16));
        System.out.println(s1.checkPerfectcube(27));
    }
}
