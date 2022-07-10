import java.util.*;
import java.io.*;

public class d1 {

    public static void main(String[] args) {

       String s="R_L_";
      String t="__LR";

      String a="";
      String b="";

        for (int i = 0; i <s.length(); i++) {

            if(s.charAt(i)!='_')
                a+=s.charAt(i);
        }

        for (int i = 0; i <t.length(); i++) {

            if(t.charAt(i)!='_')
                b+=t.charAt(i);
        }

        System.out.println(b.contains(a));
    }
}
