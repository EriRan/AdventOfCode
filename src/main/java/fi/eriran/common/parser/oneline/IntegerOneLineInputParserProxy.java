package fi.eriran.common.parser.oneline;

public class IntegerOneLineInputParserProxy extends AbstractOneLineInputParserProxy<Integer> {

    public IntegerOneLineInputParserProxy() {
        super(new IntegerOneLineInputCommaParser());
    }
}
