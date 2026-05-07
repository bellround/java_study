public class string_operator
{
    public static void main(String[] args)
    {
        String str1 = "JDK" + 6.0;
        String str2 = str1 + "특징";
        System.out.println(str2);

        // JDK + 3을 하고 3.0을 더헤 JDK33.0이 된다
        String str3 = "JDK" + 3 + 3.0;
        // 3 + 3.0을 하고 JDK를 더해 6.0JDK가 된다
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);
    }
}