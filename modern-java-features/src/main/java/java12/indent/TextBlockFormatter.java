package java12.indent;

public class TextBlockFormatter {
    private final int CODE_TEXT_BLOCK_INDENT = 4;

    String formatLinesToCodeBlockIndent(String code) {
        // implement here
        // use CODE_TEXT_BLoCK_INDENT as padding value

        return code.indent(CODE_TEXT_BLOCK_INDENT);
    }
}
