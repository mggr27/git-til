public class Operator{
    public static void main(String[] args){
        
        //산술연산자
        int a,b,c;
        a=10; b=3;
        c= a+b;
        System.out.println(c); //13
        c = a%b;
        System.out.println(c); //1

        short s1,s2,s3;
        s1=10; s2=3;
        s3 = (short)(s1+s2); //연산시 s2가 int자동변환됨

        float f;
        a=10;
        b=3;
        f = a+b;
        System.out.println(f);

        f = a/b;
        System.out.println(f);

        f = (float)a/b;
        System.out.println(f);

        a+=10;
        System.out.println(a);

        //비교연산자
        a=10;
        System.out.println(a%2==0);
        b=3;
        System.out.println(b%2!=1);
        System.out.println(a>b);

        //논리연산자
        System.out.println(true&&true);
        System.out.println(true&  true);
        
        //비트연산자
        System.out.println(0&1); 

        //단항연산자
        a=10;
        a++;
        System.out.println(a); //11

        a=10;
        a--;
        System.out.println(a); //9
 
        a=10;
        b=a++;
        System.out.println(b); //10
        System.out.println(a); //11

        a=10;
        b=++a;
        System.out.println(b); //11
        System.out.println(a); //11

        byte b1;
        b1=127;
        b1++;
        //b1=128; //컴파일오류
        System.out.println(b1);

        //삼항연산자
        a=10;
        System.out.println(a%2==0?"짝수":"홀수");

        

    }
}
