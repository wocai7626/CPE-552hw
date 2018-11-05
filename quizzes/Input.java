/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Name: Li Da Zou
*/

//((?:abstract\s+)?class|interface)\s+([\$A-Za-z_][\$_A-Za-z\d_\$]*)// find class name
package Input;
import java.util.*;
import java.util.regex.*;
public class Input {
    public static void main(String [] a) {
        Scanner c = new Scanner(System.in);
        //String s="((abstract)\\s+)?((class|interface)\\s+)([\\$A-Za-z][\\$_A-Za-z\\d]*)";
        String S="((abstract)\\s+)?(class|interface)\\s+([_A-Za-z][_A-Za-z\\d]*)";
        Pattern P=Pattern.compile(S);
        //line.split("[,\\s]+");
        while(c.hasNext()){
            String line = c.nextLine();
            Matcher m=P.matcher(line);
            System.out.println(m.matches());
        }
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
        
    }
}
