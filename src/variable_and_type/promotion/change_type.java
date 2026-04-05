public class change_type
{
    public static void main(String[] args)
    {
        // 작은 허용 범위타입 -> 큰 허용범위 타입으로 자동변환
        // byte -> short -> int -> long -> float -> double
        // 자동 타입변환 예시
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: "+ intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드" + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: "+ longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}