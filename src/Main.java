//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word="BINGO";
        int attempts=5;
        while(attempts>0){
            System.out.println("enter your word :  ");
            String userword=sc.nextLine();
            if(userword.length()<5){
                System.out.println("WORD LESS THAN 5 CHARACTERS");
                continue;
            }
            if(userword.toUpperCase().equals(word)){
                System.out.println("CORRECT WORD");
                attempts=attempts-5;
            }
            else{
                check(userword,word);
                attempts=attempts-1;
            }


        }
        System.out.println("The correct word is "+word);
    }
    public static void check(String useword, String word){
        String green="green : ";
        String yellow="yellow :";
        String gray="gray :";
        for(int i=0;i<useword.length();i++){
            if(word.charAt(i)==useword.charAt(i)){
                green=green+word.charAt(i);
            }
            else{
                if(word.contains(String.valueOf(useword.charAt(i)))){
                    yellow=yellow+useword.charAt(i);
                }
                else{
                    gray=gray+useword.charAt(i);
                }
            }
        }
        System.out.println(green);
        System.out.println(yellow);
        System.out.println(gray);

    }
}

