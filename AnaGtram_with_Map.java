package String_Questions;
import  java.util.*;

public class AnaGtram_with_Map {
    public  static  boolean Anagram(String s1,String t1){
        if(s1.length()!=t1.length()){
            return false;
        }
        Map<Character, Integer>Fm=new HashMap<>();
        for(char C:s1.toCharArray()){
            Fm.put(C, Fm.getOrDefault(C,0)+1);

        }
        for(char C:t1.toCharArray()){
            if(!Fm.containsKey(C)){
                return false;
            }
            Fm.put(C,Fm.get(C)-1);
            if(Fm.get(C)==0){
                Fm.remove(C);
            }
        }
        return Fm.isEmpty();
    }
    public static void main(String[] args) {
        String S1="SILENT";
        String T1="MISTEN";
     boolean result=Anagram(S1,T1);
        System.out.println(result);


    }
}
