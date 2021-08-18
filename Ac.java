import java.util.*;

public class Ac {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       HashMap<String, HashMap<String, String>> outerMap = new HashMap<>();

       HashMap<String, Object> innerMap1 = new HashMap<>();
       HashMap<String, String> innerMap2 = new HashMap<>();
   
   
       innerMap1.put("Name", "az");
       innerMap1.put("Address", "7lab");
       innerMap1.put("Age", "fourty");
   
       innerMap2.put("Name", "sab");
       innerMap2.put("Address", "bk3");
       innerMap2.put("Age", "thirteen");
   
       outerMap.put("1",innerMap1);
       outerMap.put("2", innerMap2);
       System.out.println("outerMap = " + outerMap);


    }
}