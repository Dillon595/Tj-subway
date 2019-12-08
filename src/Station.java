
import java.util.ArrayList;
import java.util.List;

public class Station {
    String name; //存储地铁的线路名字
    boolean visited; //BFS算法中表示的标记，表示是否访问
    String preStation; //BFS访问过的站点保存信息
    String line; //站点所在的线路
    List<String> lineNow = new ArrayList<String>(); //地铁站名初始所属的地铁线
    List<Station> nextStation = new ArrayList<Station>(); //相邻地铁信息，即下一次能到达的所有地铁

    public Station() {
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getPreStation() {
        return preStation;
    }

    public void setPreStation(String preStation) {
        this.preStation = preStation;
    }

    public List<String> getLineNow() {
        return lineNow;
    }

    public void setLineNow(List<String> lineNow) {
        this.lineNow = lineNow;
    }

    public List<Station> getNextStation() {
        return nextStation;
    }

    public void setNextStation(List<Station> nextStation) {
        this.nextStation = nextStation;
    }

    @Override
    public String toString() {
        String s = "";
        s = s + name;
        return s;
    }
}