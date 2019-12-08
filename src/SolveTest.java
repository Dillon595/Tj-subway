
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolveTest {


   // @Test
    public void getSubwayMessage() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
        System.out.println("line"+"\n");
        solve.lines.stream().forEach( x-> System.out.println(x.toString()) );
        System.out.println("key"+"\n");
        System.out.println( solve.map.keySet().size() );
        solve.map.keySet().forEach( x-> System.out.println(x) );
        solve.map.values().forEach( x-> System.out.println(x.getLineNow()+"name:"+x.getName()+"station:"+x.nextStation) );
    }

    //@Test
    public void getStationByLine() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
        solve.getStationByLine("1号线");
    }

    //@Test
    public void BFS() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
//        solve.BFS( "刘园","鼓楼");
//        solve.printPath( "刘园","鼓楼" );

    }


    //@Test
    public void calStationofLine() {
        Station a = new Station("天府");
        Station b = new Station("春熙路");
        List<String>  pass1 = new ArrayList<>();
        List<String>  pass2 = new ArrayList<>();
        pass1.add( "1号线" );
        pass1.add( "2号线" );
        pass1.add( "4号线" );
        pass2.add( "7号线" );
        pass2.add( "2号线" );
        pass2.add( "12号线" );
        a.setLineNow( pass1 );
        b.setLineNow( pass2 );
        Solve solve = new Solve();
        String s = Util.calStationofLine( a, b );
        System.out.println(s);
    }

   // @Test
    public void getChangeInfo() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
        solve.getChangeInfo( solve.calPassStations( "刘园","鼓楼") );
//        System.out.println("line"+"\n");
//        solve.lines.stream().forEach( x-> System.out.println(x.toString()) );
//        System.out.println("key"+"\n");
//        System.out.println( solve.map.keySet().size() );
        solve.map.keySet().forEach( x-> System.out.println(x) );
        solve.map.values().forEach( x-> System.out.println(x.getLineNow()+"name:"+x.getName()+"station:"+x.nextStation+" belongline"+x.getLine()) );
    }

   // @Test
    public void output() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
        List list = solve.calPassStations( "乐园道", "鼓楼" );
        solve.getChangeInfo(list);
        solve.output(list);
    }
}