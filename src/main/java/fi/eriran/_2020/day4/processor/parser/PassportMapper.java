package fi.eriran._2020.day4.processor.parser;

import fi.eriran._2020.day4.processor.pojo.Passport;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PassportMapper {

    private final PassportRawFieldParser rawFieldParser;
    private final Logger logger = Logger.getGlobal();

    public PassportMapper() {
        rawFieldParser = new PassportRawFieldParser();
    }

    public List<Passport> map(List<String> lines) {
        Passport currentlyConstructedPassport = new Passport();
        List<Passport> builtPassports = new ArrayList<>();
        for (String line : lines) {
            if (StringUtils.isBlank(line)) {
                if (!MapUtils.isEmpty(currentlyConstructedPassport.getFields())) {
                    builtPassports.add(currentlyConstructedPassport);
                }
                currentlyConstructedPassport = new Passport();
            } else {
                addNewFields(line, currentlyConstructedPassport);
            }
        }
        //Add the last passport if one was being built before the lines ran out
        if (!MapUtils.isEmpty(currentlyConstructedPassport.getFields())) {
            builtPassports.add(currentlyConstructedPassport);
        }
        return builtPassports;
    }

    private void addNewFields(String line, Passport currentlyConstructedPassport) {
        rawFieldParser.parse(line)
                .forEach(fieldAndValue -> {
                    if (currentlyConstructedPassport.getFields().containsKey(fieldAndValue.getFieldName())) {
                        logger.warning("Same field encountered twice for a passport: "
                                + fieldAndValue.getFieldName() + ". Replacing the last encountered value!");
                    }
                    currentlyConstructedPassport.getFields()
                            .put(fieldAndValue.getFieldName(), fieldAndValue.getValue());
                });
    }
}
