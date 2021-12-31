package fi.eriran.common.parser;

public class IntegerOneLineInputCommaParserProxy extends AbstractOneLineInputParserProxy<Integer> {

    public IntegerOneLineInputCommaParserProxy() {
        super(new IntegerOneLineInputCommaParser());
    }
}
