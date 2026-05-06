// Scanner 클래스를 불러온다 안그러면 입력받는 기능을 사용할 수 없다
import java.util.Scanner;

public class input_2_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String inputDate;
        while (true)
        {
            inputDate = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputDate + "\"");
            if (inputDate.equals("q"))
            {
                break;
            }
        }

        System.out.println("종료");
    }
}