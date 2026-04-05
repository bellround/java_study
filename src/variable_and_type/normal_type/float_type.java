public class float_type
{
    public static void main(String[] args)
    {
        //float var1 = 3.14; // 컴파일 에러
        // float 타입은 뒤에 f혹은 F를 붙여야 한다
        float var2 = 3.14f;
        // 자바의 실수형은 기본적으로 double타입이다
        double var3 = 3.14;

        //정밀도
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        //e 사용하기
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 2e-3;
        System.out.println("var6: "+var6);
        System.out.println("var7: "+var7);
        System.out.println("var8: "+var8);
    }
}