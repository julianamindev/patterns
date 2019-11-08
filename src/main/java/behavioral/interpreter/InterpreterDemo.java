package behavioral.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterpreterDemo {

    private static Logger log = LoggerFactory.getLogger(InterpreterDemo.class);

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        //return alternation2;

        //Bears and (Lions or (Tigers and Bears))
        return new AndExpression(terminal3, alternation2);
    }

    // build the interpreter and then interpret a specific sequence
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();
        log.info("{} is {} ", context, define.interpret(context));
    }
}
