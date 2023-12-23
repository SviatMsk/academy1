package by.academy.Deal;

import java.util.regex.Pattern;

public class ValidateDate2 implements Validator {
    final Pattern p = Pattern.compile("\\d{2}[/]\\d{2}[/]\\d{4}");

    public Pattern getPattern() {
        return p;
    }

}

