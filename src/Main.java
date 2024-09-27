import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int key=0;
        looking mylook=new looking();
        do{
            System.out.println("-------下一次选择-------");
            System.out.println("--------------------零钱通菜单-----------------");
            System.out.println("\t\t\t"+"1:零钱通明细");
            System.out.println("\t\t\t"+"2:收益入账");
            System.out.println("\t\t\t"+"3:消费");
            System.out.println("\t\t" + "\t"+"4:退 \t出");
            System.out.println("请输入(1-4):");
            Scanner scanner = new Scanner(System.in);
             key=scanner.nextInt();
            switch (key){
                case 1:
                {
                    mylook.lookMingXi();
                    break;
                }
                case 2:
                {
                    income myincome = new income();
                    myincome.revenue(mylook);
                    break;
                }
                case 3:
                {
                    Consuming myconsume = new Consuming();
                    myconsume.consum(mylook);
                    break;
                }
                case 4:
                {
                    Exit myexit=new Exit();
                    myexit.isExit(mylook);
                    break;
                }
                default:
                    System.out.println("你输入了错误的数字，请重新输入:");
            }
        }while (mylook.loop);
        }
    }
