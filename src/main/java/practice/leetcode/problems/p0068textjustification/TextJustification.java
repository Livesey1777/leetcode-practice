package practice.leetcode.problems.p0068textjustification;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int currentLength = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int gap = temp.isEmpty() ? 0 : 1;
            if (currentLength + word.length() + gap <= maxWidth) {
                temp.add(word);
                currentLength += word.length() + gap;
            } else {
                result.add(buildLine(temp, maxWidth, false));
                temp = new ArrayList<>();
                temp.add(word);
                currentLength = word.length();
            }
        }
        result.add(buildLine(temp, maxWidth, true));
        return result;
    }

    private String buildLine(List<String> line, int maxWidth, boolean isLastLine) {
        StringBuilder result = new StringBuilder();
        if (isLastLine) {
            String joined = String.join(" ", line);
            result.append(joined).repeat(" ", maxWidth - joined.length());
        } else if (line.size() == 1) {
            result.append(line.get(0)).repeat(" ", maxWidth - result.length());
        } else {
            int totalLength = 0;
            for (String word : line) {
                totalLength += word.length();
            }
            int totalSpace = maxWidth - totalLength;
            int gaps = line.size() - 1;
            int base = totalSpace / gaps;
            int extraSpace = totalSpace % gaps;
            result.append(line.get(0));
            for (int i = 1; i < line.size(); i++) {
                int spaces = base + (i <= extraSpace ? 1 : 0);
                result.repeat(" ", spaces).append(line.get(i));
            }
        }
        return result.toString();
    }
}
