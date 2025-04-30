package dl;

import java.io.File;

import lexer.Lexer;
import lexer.Tag;
import lexer.Token;

public class DL {
    public static void main(String[] args){
        /*Token tk1 = new Token(Tag.ASSIGN, "=");
        Token tk2 = new Token(Tag.LE, "<=");
        System.out.println(tk1);
        System.out.println(tk2);*/

        Lexer l = new Lexer(new File("prog.dl"));
        Token t = l.nextToken();
        
        while (t.tag() != Tag.EOF) {
            System.out.println(t);
            t = l.nextToken();
        }
        System.out.println(l.nextToken());
    }
}
