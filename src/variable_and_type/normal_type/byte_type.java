public class byte_type
{
    public static void main(String[] args)
    {
        // byte의 범위는 -128 ~ 127
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte의 최대 범위를 넘었기 떄문에 컴파일 에러
        // byte var6 = 128;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        // byte의 최대 범위를 넘었기 떄문에 컴파일 에러
        // System.out.println(var6);
    }
}