import java.util.ArrayList;
import java.util.List;

public class Line {
    int id; //地铁的标记
    String name; //地铁明
    List<String> stations = new ArrayList<>(); //某条地铁存储的所有站名

    public List<String> getStations() {
        return stations;
    }

    @Override
    public String toString() {
        String s="";
        s = s+"name:"+name+"\n";
        if (stations.size()>0)
        {
            for (String a : stations) {
                s = s + a +"->";
            }
        }
        return  s;
    }
}
