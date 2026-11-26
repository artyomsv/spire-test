package com.testt.inputlimit;

/** TEST-input-limit round 1: generated helpers that make this pull request large. */
public final class CharlieSteps {

    private CharlieSteps() {
    }

    /** Returns the 0th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step0(int value, int lower, int upper) {
        int shifted = value + 0;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 0. */
    public static int countWords0(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 0 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 1th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step1(int value, int lower, int upper) {
        int shifted = value + 1;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 1. */
    public static int countWords1(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 1 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 2th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step2(int value, int lower, int upper) {
        int shifted = value + 2;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 2. */
    public static int countWords2(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 2 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 3th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step3(int value, int lower, int upper) {
        int shifted = value + 3;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 3. */
    public static int countWords3(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 3 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 4th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step4(int value, int lower, int upper) {
        int shifted = value + 4;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 4. */
    public static int countWords4(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 4 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 5th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step5(int value, int lower, int upper) {
        int shifted = value + 5;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 5. */
    public static int countWords5(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 5 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 6th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step6(int value, int lower, int upper) {
        int shifted = value + 6;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 6. */
    public static int countWords6(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 6 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 7th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step7(int value, int lower, int upper) {
        int shifted = value + 7;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 7. */
    public static int countWords7(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 7 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 8th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step8(int value, int lower, int upper) {
        int shifted = value + 8;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 8. */
    public static int countWords8(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 8 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 9th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step9(int value, int lower, int upper) {
        int shifted = value + 9;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 9. */
    public static int countWords9(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 9 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 10th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step10(int value, int lower, int upper) {
        int shifted = value + 10;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 10. */
    public static int countWords10(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 10 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 11th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step11(int value, int lower, int upper) {
        int shifted = value + 11;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 11. */
    public static int countWords11(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 11 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 12th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step12(int value, int lower, int upper) {
        int shifted = value + 12;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 12. */
    public static int countWords12(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 12 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 13th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step13(int value, int lower, int upper) {
        int shifted = value + 13;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 13. */
    public static int countWords13(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 13 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 14th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step14(int value, int lower, int upper) {
        int shifted = value + 14;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 14. */
    public static int countWords14(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 14 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 15th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step15(int value, int lower, int upper) {
        int shifted = value + 15;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 15. */
    public static int countWords15(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 15 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 16th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step16(int value, int lower, int upper) {
        int shifted = value + 16;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 16. */
    public static int countWords16(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 16 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 17th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step17(int value, int lower, int upper) {
        int shifted = value + 17;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 17. */
    public static int countWords17(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 17 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 18th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step18(int value, int lower, int upper) {
        int shifted = value + 18;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 18. */
    public static int countWords18(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 18 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 19th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step19(int value, int lower, int upper) {
        int shifted = value + 19;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 19. */
    public static int countWords19(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 19 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 20th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step20(int value, int lower, int upper) {
        int shifted = value + 20;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 20. */
    public static int countWords20(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 20 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 21th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step21(int value, int lower, int upper) {
        int shifted = value + 21;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 21. */
    public static int countWords21(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 21 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 22th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step22(int value, int lower, int upper) {
        int shifted = value + 22;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 22. */
    public static int countWords22(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 22 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 23th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step23(int value, int lower, int upper) {
        int shifted = value + 23;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 23. */
    public static int countWords23(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 23 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 24th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step24(int value, int lower, int upper) {
        int shifted = value + 24;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 24. */
    public static int countWords24(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 24 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 25th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step25(int value, int lower, int upper) {
        int shifted = value + 25;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 25. */
    public static int countWords25(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 25 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 26th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step26(int value, int lower, int upper) {
        int shifted = value + 26;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 26. */
    public static int countWords26(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 26 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 27th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step27(int value, int lower, int upper) {
        int shifted = value + 27;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 27. */
    public static int countWords27(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 27 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 28th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step28(int value, int lower, int upper) {
        int shifted = value + 28;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 28. */
    public static int countWords28(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 28 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 29th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step29(int value, int lower, int upper) {
        int shifted = value + 29;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 29. */
    public static int countWords29(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 29 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 30th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step30(int value, int lower, int upper) {
        int shifted = value + 30;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 30. */
    public static int countWords30(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 30 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 31th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step31(int value, int lower, int upper) {
        int shifted = value + 31;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 31. */
    public static int countWords31(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 31 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 32th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step32(int value, int lower, int upper) {
        int shifted = value + 32;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 32. */
    public static int countWords32(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 32 % 26)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the 33th step of the CharlieSteps sequence, clamped to the given bounds. */
    public static int step33(int value, int lower, int upper) {
        int shifted = value + 33;
        if (shifted < lower) {
            return lower;
        }
        if (shifted > upper) {
            return upper;
        }
        int folded = (shifted * 31) ^ (shifted >>> 3);
        return Math.floorMod(folded, Math.max(1, upper - lower + 1)) + lower;
    }

    /** Counts the words in a line that start with the letter for step 33. */
    public static int countWords33(String line) {
        if (line == null || line.isBlank()) {
            return 0;
        }
        int count = 0;
        for (String word : line.trim().split("\\s+")) {
            if (!word.isEmpty() && Character.toLowerCase(word.charAt(0)) == (char) ('a' + 33 % 26)) {
                count++;
            }
        }
        return count;
    }
}
