public class auto_change {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x =10;
        byte y = 20;
        // byte result2 = x+ y 컴파일 에러
        int result3 = x + y;
        System.out.println(result3);

        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        // long타입이 피 연산자면 자동으로 long으로 변환후 계산
        long result4 = value1 + value2 + value3;
        System.out.println(result4);

        char charValue1 = 'A';
        char charValue2 = 1;
        // char charValue3 = charValue1 + charValue2; 컴파일 에러
        int intValue1 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue1);
        System.out.println("출력문자=" + (char)intValue1);

        int intValue2 = 10;
        // 정수 / 정수 = 몫
        int intValue3 = intValue2 / 4;
        System.out.println(intValue3);

        int intValue4 = 10;
        // int intValue5 = 10 / 4.0; 컴파일 에러
        double doubleValue = intValue4 / 4.0;
        System.out.println(doubleValue);

        int x1 = 1;
        int y1 = 2;
        double result = (double) x1 / y1;
        System.out.println(result);
    }
}