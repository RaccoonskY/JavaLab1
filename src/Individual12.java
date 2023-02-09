import java.util.*;



public class Individual12 {

    //import java.util.*;//Можно включить ппакет целиком
    public static void main(String[] args) {
        ArrayList numList = new ArrayList();
        for (String x : args) {
            numList.add(Integer.parseInt(x));
        }
        Collections.sort(numList);
        System.out.println(numList);
    }
}
