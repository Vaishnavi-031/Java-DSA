import java.util.*;
public class solution {
public static boolean checkIfPangram(String sentence){
        int [] freq = new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    System.out.println(checkIfPangram(sentence));
    }
}
