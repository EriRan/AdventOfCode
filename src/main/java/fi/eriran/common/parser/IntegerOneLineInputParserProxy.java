package fi.eriran.common.parser;

public class IntegerOneLineInputParserProxy extends AbstractOneLineInputParserProxy<Integer> {

    public IntegerOneLineInputParserProxy() {
        super(new IntegerOneLineInputCommaParser());
    }
}
