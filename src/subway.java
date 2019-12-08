
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class subway {
    private static Solve solve = new Solve();
    public static void main(String[] args) {
        read();
        while (true){
            write();
        }
//        write1(args);
    }


    private static void read()
    {
        solve.getSubwayMessage();
    }
    private static void write() {
        Scanner input=new Scanner(System.in);
        System.out.print("输入指令：(查询地铁线路信息：-info 几号线）,（查询起末站线路：-way star end）:");
        String s=input.nextLine();
        String[] split =s.trim().split("\\s+");
        if(split[0].equals("-map")) {
            if(split.length==1){
                solve.getSubwayMessage();
                System.out.println("成功读取subway.txt文件");
            }else{
                System.out.println("重新输入");
            }
        }
        else if(split[0].equals("-info")) {
//		    java subway -a 1号线 -map subway.txt -o station.tx
            if(split.length==2){
                solve.getStationByLine( split[1] );
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        else if(split[0].equals("-way")) {
            if(split.length==3){
                if(split[1].equals(split[2]))
                    System.out.println("输入站点重复，请重新输入");
                else {
                    List list = solve.calPassStations( split[1], split[2]);
                    solve.getChangeInfo(list);
                    solve.output(list);
                }
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println();
    }
    private static void write1(String args) {
        String s=args;
        String[] split =s.trim().split("\\s+");
        if(split[0].equals("-map")) {
//            java subway -map subway.txt
            if(split.length==2){
                Situation1();
                System.out.println("成功读取subway.txt文件");
            }else{
                System.out.println("重新输入");
            }
        }
        else if(split[0].equals("-a")) {
//            java subway -a 1号线 -map subway.txt -o station.txt
            if(split.length==6){
                Situation2(split[1]);
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        else if(split[0].equals("-b")) {
//            subway.exe -b 洪湖里 复兴路 -map subway.txt -o routine.txt
            if(split.length==7){
                Situation3(split[1],split[2]);
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println();
    }
    public static void Situation1()
    {
        solve.getSubwayMessage();

    }
    public static void Situation2(String line)
    {
        solve.getStationByLine( line );
    }
    public static void Situation3(String st1,String st2)
    {
        if(st1.equals(st2))
            System.out.println("输入站点重复，请重新输入");
        else {
            List list = solve.calPassStations( st1, st2 );
            solve.getChangeInfo(list);
            solve.output(list);
        }
    }
}
