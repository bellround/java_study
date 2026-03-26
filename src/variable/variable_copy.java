public class variable_copy
{
    public static void main(String[] args)
    {
            int x = 3;
            int y = 5;
            System.out.println("x:" + x + ", y:" + y);

            // x와 y를 교체한다
            int temp = x;
            x = y;
            y = temp;
            System.out.println("x:" + x + ", y:" + y);
    }
}