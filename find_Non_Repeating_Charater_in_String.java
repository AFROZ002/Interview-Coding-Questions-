package String_Questions;

import java.util.HashMap;
import java.util.Map;

public class find_Non_Repeating_Charater_in_String {
    public  static  String NonRepeating(String str1){

        Map<Character,Integer>map=new HashMap<>();
        for(char C:str1.toCharArray()){
            map.put(C,map.getOrDefault(C,0)+1);

        }
        StringBuilder SB=new StringBuilder();
        for(char C:str1.toCharArray()){
            if(map.get(C)==1){
                SB.append(C);
            }
        }
        return SB.toString();

    }
    public static void main(String[] args) {
        String str1="AfrozAlam";
     String results=NonRepeating(str1);
        System.out.println(results);
    }
}
