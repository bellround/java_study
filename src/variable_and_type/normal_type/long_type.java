public class long_type
{
    public static void main(String[] args)
    {
        // int의 범위는 -2,147,483,648 ~ 2,147,483,647
        // long의 범위는 +-900경이다
        long var1 = 10;
        // long 함수를 쓸려면 정수값뒤에 L을 사용한다
        // 소문자 L도 쓸수있다
        long var2 = 20L;
        // int범위를 넘어서 컴파일 에러
        // long var3 = 1000000000000;
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}