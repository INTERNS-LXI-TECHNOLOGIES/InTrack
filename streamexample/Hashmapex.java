import java.util.Map;
import java.util.HashMap;

public class Hashmapex{
public static void main(String args[]){
Map <String,Integer> map=new HashMap<>();

map.put("anila",23);
map.put("anu",12);
map.put("sruthi",22);
map.put("arya",29);
map.put("nandu",15);

System.out.println(map.get("anila"));
System.out.println(map.size());
 System.out.println((map.remove("sruthi"))+"sruthi is removed");
 System.out.println(map.size());



}
}