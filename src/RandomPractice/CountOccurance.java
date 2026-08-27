package RandomPractice;
import java.util.HashMap;

public class CountOccurance {
    public HashMap<Character,Integer> count(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<s.length();j++){
            if(map.get(s.charAt(j))==1){
                System.out.println("first: " + s.charAt(j));
                break;
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String s="hello";
        String s2="";

        CountOccurance obj= new CountOccurance();
        System.out.println(obj.count(s));;
    }
}
