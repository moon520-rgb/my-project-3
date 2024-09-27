import java.util.Scanner;
public class Exit {
    public String choice;
    public void isExit(looking e){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("你真的要退出嘛。确认输入y,不退出输入n:");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice))
            {
                break;
            }
        }
        if (choice.equals("y")) {
            e.loop = false;
        }

    }
}
