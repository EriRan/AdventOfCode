package fi.eriran.common.parser;

public class IntegerOneLineInputCommaParserProxy extends AbstractInputParserProxy<Integer> {

    public IntegerOneLineInputCommaParserProxy() {
        super(new IntegerOneLineInputCommaParser());
    }
}
