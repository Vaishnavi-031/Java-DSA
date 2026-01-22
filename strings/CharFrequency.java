import java.util.*;
public class solution {
public static void printCharFrequency(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a') + "->" + freq[i]);
            }
        }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    printCharFrequency(s);
    }
}
