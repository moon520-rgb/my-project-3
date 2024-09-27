import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Consuming {
    public int money;
    public String  content;
    public void consum(looking e){
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        date=new Date();
        Scanner scanner = new Scanner(System.in);
       System.out.println("请输入本次消费内容:");
        content=scanner.next();
        System.out.println("请输入本次消费多少钱:");
        money=scanner.nextInt();
        if(money>e.balance) {
            System.out.println("您的余额不够辣，请充值");

        }
        else {
            e.balance -= money;
            e.details = e.details + "\n" + "消费扣账\t\t" + "-" + money + "\t\t" + sdf.format(date) + "\t\t" + "余额:" + e.balance + "\t\t" + "本次消费内容" + content;
        }
    }
}
