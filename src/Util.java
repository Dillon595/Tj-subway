import java.util.List;

public class Util {
    public static String calStationofLine(Station a,Station b)
    {
        String s ="null";
        List<String> aLines = a.getLineNow();
        List<String> bLines = b.getLineNow();
        for (String line:aLines
        ) {
            if (bLines.contains( line ))
            {
                s = line;
            }
        }
        return s;
    }
}
