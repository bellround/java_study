public class char_operator
{
    public static void main(String[] args)
    {
        char c1 = 'A' + 1;
        char c2 = 'A';
        // char변수가 산술 연산에 사용시 int로 변환된다
        // char c3 = c2 + 1;
        System.out.println("c1 : "+c1);
        System.out.println("c2 : " + c2);
        // System.out.println("c3 : " + c3);
    }
}