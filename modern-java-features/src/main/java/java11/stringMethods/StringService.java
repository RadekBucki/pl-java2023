package java11.stringMethods;

import java.util.List;

public class StringService {

    List<String> getOnlyNotBlankStrings(List<String> input) {
        // implement here

        return input.stream()
                .filter(s -> !s.isBlank())
                .toList();
    }

    List<String> getStrippedTextLines(String text) {
        // implement here
        // split text to lines and strip
        return text.lines()
                .map(String::strip)
                .toList();
    }

    List<String> extendFoundStringByRepeatSomeTimes(List<String> list, String searchedText, int nTimesRepeat) {
        // implement here
        // search for searchedText in a list. Change this string by repeat n times if found
        return list.stream()
                .map(s -> s.contains(searchedText) ? searchedText.repeat(nTimesRepeat) : s)
                .toList();
    }
}
