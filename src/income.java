import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class income {
    public int money;
    public void revenue(looking e){
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        date=new Date();
        System.out.println("请输入本次收益多少钱:");
        Scanner scanner = new Scanner(System.in);
         money=scanner.nextInt();
         if (money>0) {
             e.balance += money;
             e.details = e.details + "\n" + "收益入账\t\t" + "+" + money + "\t\t" + sdf.format(date) + "\t\t" + "余额:" + e.balance;
         }
         else
             System.out.println("您输入了错误的数字，请重新输入");
            //System.out.println(look.details);

    }
}
