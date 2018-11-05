/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;
import java.util.*;
import java.util.regex.*;

public class regex {
    public static void main(String [] a) {
        Scanner c = new Scanner(System.in);
        //String s=c.nextLine();
        //String s="This, is a test. of punc-tuation";
        //String [] words = s.split("[\\,\\s\\?\\.]+");
        String re= "-";
        String INPUT="This, is a test. of punc-tuation";
        String [] words = INPUT.split("[\\,\\s\\?\\.]+");
        String replace="";
        Pattern p=Pattern.compile(re);
        for(int i=0;i<words.length;i++){
            Matcher matcher = p.matcher(words[i]);
            StringBuffer buffer = new StringBuffer();
            while(matcher.find()) {
                matcher.appendReplacement(buffer, replace);
            }
            matcher.appendTail(buffer);
            System.out.println(buffer.toString());
        }
        /*for(int i=0;i<words.length;i++)
            System.out.println(words[i]);*/
    }
}
