import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<String>cities = new ArrayList<>();
        cities.add("lucknow");
        cities.add("shahjahanpur");
        cities.add("jamnapar");
        cities.add("gulabsahar");
        cities.remove("jamnapar");
        cities.remove(0);
        System.out.println(cities);
        }
}