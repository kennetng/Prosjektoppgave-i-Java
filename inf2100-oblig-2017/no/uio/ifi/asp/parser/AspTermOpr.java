package no.uio.ifi.asp.parser;

import no.uio.ifi.asp.main.Main;
import no.uio.ifi.asp.runtime.RuntimeReturnValue;
import no.uio.ifi.asp.runtime.RuntimeScope;
import no.uio.ifi.asp.runtime.RuntimeValue;
import no.uio.ifi.asp.scanner.Scanner;

public class AspTermOpr extends AspSyntax {
    AspTermOpr(int n) {
        super(n);
    }

    static AspTermOpr parse(Scanner s) {
        Main.log.enterParser("term opr");
        AspTermOpr ato = new AspTermOpr(s.curLineNum());
        Main.log.leaveParser("term opr");

        return ato;
    }

    @Override
    void prettyPrint() {

    }

    @Override
    RuntimeValue eval(RuntimeScope curScope) throws RuntimeReturnValue {
        return null;
    }


}