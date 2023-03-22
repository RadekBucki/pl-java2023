package java12.indent;

public class NoIndentTextFormatter {

    String noIndentText(String text) {
        // implement here
        // remove indent

        return text.lines()
                .map(String::stripLeading)
                .reduce("", (s1, s2) -> s1 + s2 + "\n");
    }
}
