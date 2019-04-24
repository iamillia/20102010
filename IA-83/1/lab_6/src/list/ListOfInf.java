package list;
import java.util.*;
public class ListOfInf {
    public static ArrayList<String> paramNames = new ArrayList<>();
    private static Map<String, String> teamInfo = new HashMap <>();
    static {
        paramNames.add("a");
        paramNames.add("b");
        paramNames.add("c");
        paramNames.add("d");

        teamInfo.put("Kudrenko D. A.", "kudrenko.jpg");
        teamInfo.put("Savinov V. V.", "savinov.jpg");
        teamInfo.put("Melaschenko V. A.", "melaschenko.jpg");
    }
    public static Map<String, String> getInfo(){
        return teamInfo;
    }
    public static ArrayList<String> getParamNames(){
        return paramNames;
    }
}
