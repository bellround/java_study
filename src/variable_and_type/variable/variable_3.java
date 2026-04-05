package variable;

public class variable_3
{
    public static void main(String[] args)
    {
        int v1 = 15;
        if (v1 > 10) {
            // 변수는 선언된 위치로 부터 자신이 속한 블록 내부에서만 사용 가능
            int v2;
            v2 = v1 - 10;
            System.out.println(v2);
        }
        // v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
        int v3 = v1 +5;
        System.out.println(v3);
    }
}