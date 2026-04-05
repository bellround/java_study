public class variable_2
{
    public static void main(String[] args)
    {
        // 변수 hour에 3을 입력
        int hour = 3;
        // 변수 minute에 5를 입력
        int minute = 5;
        // 변수 hour와 minute를 출력
        System.out.println(hour + "시간" + minute + "분");

        // 변수에 다른 단어가 붙으면 그 단어의 첫 문자를 대문자로 한다
        // 변수 totalMinute에 hour * 60 + minute를 입력
        int totalMinute = (hour * 60) + minute;
        // 변수 totalMinute를 출력
        System.out.println("총" + totalMinute + "분");
    }
}