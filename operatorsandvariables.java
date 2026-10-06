public class operatorsandvariables{
    public static void main(String[] args){
        int a=2;
        int b=6;
        int sum=a+b;
        System.out.println("Sum of two no's is:"+sum);
        int sub=a-b;
        System.out.println("Subtraction of two no's is:"+sub);
        int mul=a*b;
        System.out.println("multiplication :"+mul);
        int div=a/b;
        System.out.println("Division :"+div);
        int mod=a%b;
        System.out.println("Modulus :"+mod);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.print(a<<b); 
        System.out.print(a>>b);
        System.out.print(a>>>b);
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
        System.out.println(a > 0 && b > 0); // both are positive?
        System.out.println(a > 0 || b > 0); // at least one is positive?
        System.out.println(!(a < 0));      
    }
    
}
