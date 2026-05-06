public class sign_operator
{
    public static void main(String[] args)
    {
        int x = -100;
        // 양수 * 음수 = 음수
        int result1 = +x;
        // 음수 * 음수 = 양수
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        // byte result3 = -b (컴파일 에러)
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}