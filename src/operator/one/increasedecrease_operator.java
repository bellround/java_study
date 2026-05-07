public class increasedecrease_operator
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 10;
        int z;
        System.out.println("-----------------------");
        x++;
        ++x;
        System.out.println("x="+x);

        System.out.println("-----------------------");
        y--;
        --y;
        System.out.println("y="+y);

        System.out.println("-----------------------");
        // z에 x의 값을 대입한 후 x를 증가
        z = x++;
        System.out.println("z="+z);
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        // x를 먼저 증가시킨 후 z에 x의 값을 대입
        z = ++x;
        System.out.println("z="+z);
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        z = ++x + y++;
        System.out.println("z="+z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}