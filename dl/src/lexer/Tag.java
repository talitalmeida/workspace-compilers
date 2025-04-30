package lexer;

public enum Tag {
    //Reserved Words
    PROGRAM("PROGRAM"), BEGIN("BEGIN"), END("END"),
    //assign
    ASSIGN("ASSIGN"),
    //arithmetical operators
    SUM("SUM"), MUL("MUL"), SUB("SUB"),
    //logical operators
    OR("OR"), 
    //relational operators
    LT("LT"), LE("LE"), GT("GT"),
    //identifiers
    ID("ID"),
    //others, para fim de código
    EOF("EOF"), UNK("UNK");

private String name;

private Tag(String name){
    this.name = name;
}

@Override
public String toString(){
    return name;
}

}