import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String str = "rober";
        String ss = "Beacheso";

        System.out.println("Task1 :");
        System.out.println(TAsk1(str));
        System.out.println("Task2 :");
        System.out.println(Tassk2(str));
        System.out.println("Task3 :");
        System.out.println(Task3(str));
        System.out.println("Task4 :");
        System.out.println(Task4());
        System.out.println("Task5 :");
        System.out.println(Task5(str));
        System.out.println("Task6 :");
        System.out.println(Task6(str));
        System.out.println("Task7 :");
        String s7 = "fg++df + - 87 - +d";
        System.out.println(Task7(s7));
        System.out.println("Task8 :");
        String s8 = "bortex we are bobres";
        System.out.println(Task8(s8));
        System.out.println("Task9 :");
        System.out.println(Task9(str,ss));
        System.out.println("Task10 :");
        System.out.println(Task10(str));
        System.out.println("Task11 :");
        System.out.println(Task11(str));
        System.out.println("Task12 :");
        System.out.println(Task12(str));
        System.out.println("Task13 :");
        System.out.println(Task13(str));
        String s4 = "54gh 1";
        System.out.println("Task14 :");
        System.out.println(Task14(s4));
        System.out.println("Task15 :");
        String s15 = "abcbc";
        System.out.println(Task15(str));
        System.out.println("Task16 :");
        String s6 = "word 6 - is bebra";
        System.out.println(Task16(s6
        ));
        System.out.println("Task17 :");
        String s17 = "xabc oxab";
        System.out.println(Task17(s17));
        System.out.println("Task18 :");
        String s18 = "abc6 oxab";
        System.out.println(Task18(s18));
        System.out.println("Task19 :");
        String s19 = "aba aba dsfgfdh oxab";
        System.out.println(Task19(s19));
        System.out.println("Task21 :");
        System.out.println(Task21(str,ss));

        String s22 = "4567 hjk 67";
        System.out.println("Task22 :");
        System.out.println(Task22(s22));
        System.out.println("Task23 :");
        System.out.println(Task23(s22));
        System.out.println("Task24 :");
        System.out.println(Task24(s22));

        String s25 = "4567 hjk  67 ";
        System.out.println("Task25 :");
        System.out.println(Task25(s25));
        System.out.println("Task26 :");
        System.out.println(Task26(str,ss));

        System.out.println("Task29 :");
        System.out.println(Task29(str));
        System.out.println("Task30 :");
        System.out.println(Task30(str));



    }
    public static String TAsk1(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){

        }
        return s + "," + s + "," + s + "\nStrLength = "+ s.length();
    }

    public static String Tassk2(String s) {
        return "" + s.charAt(0) + s.charAt(s.length()-1)
                + (s.length() % 2 == 0 ? "" : (s.charAt((s.length()-1)/2) + ""));
    }

    public static String Task3(String s) {
        String first = s.substring(0, Math.min(3, s.length()));
        String last = s.substring(s.length() - 3);
        String res = first + last;

        if(s.length() <= 5){
            res = "";
            for(int i=0;i<s.length();i++){
                res += s.charAt(0);
            }
        }

        return res;
    }

    public static String Task4() {
        String res = "";

        Random rand = new Random();
        for (int i = 0; i < 10; i += 2) {
            res += (char)('a' + rand.nextInt(25));
            res += (rand.nextInt(9));
        }

        return res;
    }

    public static String Task5(String s) {
        char last = s.charAt(s.length() - 1);

        String res = "";

        for (int i = 0; i < s.length()-1; i++)
            if (s.charAt(i) == last)
                res += i + " ";

        return res;
    }

    public static String Task6(String s) {
        String res = "";
        for (int i = 2; i < s.length(); i += 3) {
            res += s.charAt(i);
        }
        return res;
    }

    public static String Task7(String s) {
        int pluses = 0, minuses = 0, chk = 0;
        boolean previs = false;

        for(int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '+') {
                pluses++;
                previs = true;
            } else if (s.charAt(i) == '-') {
                minuses++;
                previs = true;
            }
            else if (s.charAt(i) == '0' && previs)
                chk++;
            else
                previs = false;


        return "+: " + pluses + " -: " + minuses + " 0: " + chk;
    }

    public static String Task8(String s) {
        int wDesti = -1;
        int xDesti = -1;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == 'w') {
                wDesti = i;
            } else if (s.charAt(i) == 'x') {
                xDesti = i;
            }
        }

        if (wDesti < xDesti) {
            return "w";
        } else if (xDesti < wDesti) {
            return "x";
        }
        if (wDesti == -1 || xDesti == -1) {
            return "Error";
        }
        return "";
    }

    public static String Task9(String s, String ss) {
        String bigger = s.length() > ss.length() ? s : ss;
        int times = Math.abs(s.length() - ss.length());

        String res = "";
        for (int i = 0; i < times; i++)
            res += bigger + "\n";

        return res;
    }

    public static String Task10(String s) {
        if (s.startsWith("abc")) {
            s = s.replaceFirst("abc", "www");
        } else {
            s = s.concat("zzz");
        }
        return s;
    }

    public static String Task11(String s) {
        if (s.length() > 10) {
            return s.substring(0, 6);
        } else
            while (s.length() < 12)
                s = s.concat("o");

        return s;
    }

    public static String Task12(String s) {
        String[] blocks = new String[(int)Math.ceil((double)s.length()/3)];

        for (int i = 0, j = 0; i < s.length(); i += 3, j++) {
            blocks[j] = s.substring(i, Math.min(i + 3, s.length()));
        }

        Random rand = new Random();
        for (String block : blocks) {
            if (block.length() == 3) {
                String finalBlock = block;
                char newMiddleChar = (char) rand.ints('A', 'z' + 1)
                        .filter(c -> c != finalBlock.charAt(0) && c != finalBlock.charAt(2))
                        .findAny()
                        .orElse(block.charAt(0));
                block = "" + block.charAt(0) + newMiddleChar + block.charAt(2);
            }
        }
        Arrays.sort(blocks);
        return Arrays.toString(blocks);
    }

    public static String Task13(String s) {
        String res = "";

        for (int i = 1; i <= s.length(); i++) {
            char c = s.charAt(i-1);
            if (i % 2 == 0) {
                if (c != 'a' && c != 'b') {
                    res += 'a';
                } else {
                    res += 'c';
                }
            } else {
                res += c;
            }
        }

        return res;
    }

    public static String Task14(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }

        return Integer.toString(count);
    }

    public static String Task15(String s) {
        boolean res = true;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != 'a' && s.charAt(i) != 'b' && s.charAt(i) != 'c') {
                res = false;
                break;
            }


        return res ? "True" : "False";
    }

    public static String Task16(String s) {
        return s.replaceAll("word", "letter");
    }

    public static String Task17(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)
                    == 'x'
                    && i + 3 < s.length()
                    && (s.charAt(i + 1) == 'a'
                    && s.charAt(i + 2) == 'b'
                    && s.charAt(i + 3) == 'c')
            ) continue;

            res += s.charAt(i);
        }

        return res;
    }

    public static String Task18(String s) {
        return s.replaceAll("abc\\d", "");
    }

    public static String Task19(String s) {
        int count = 0;

        for (int i = 3; i < s.length(); i++) {
            if (s.startsWith("aba", i - 3))
                count++;

        }

        return Integer.toString(count);
    }

    public static String Task20(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");

        return String.join(" ", words);
    }

    public static String Task21(String s, String ss) {
        return String.join(" ", s.split(ss));
    }

    public static String Task22(String s) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        maxCount = Math.max(maxCount, count);

        return Integer.toString(maxCount);

    }

    public static String Task23(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                sum += Integer.parseInt(s.charAt(i) + "");

        return Integer.toString(sum);
    }

    public static String Task24(String s) {
        int sum = 0;
        String[] words = s.split("\\s+");

        for (String word : words) {
            try {
                sum += Integer.parseInt(word);
            } catch (NumberFormatException e) { }
        }

        return Integer.toString(sum);
    }

    public static String Task25(String s) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isWhitespace(c)) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }


        return Integer.toString(maxCount);
    }

    public static String Task26(String s, String ss) {
        String res = "";

        int ceiling = Math.min(s.length(), ss.length());

        for (int i = 0; i < ceiling; i++) {
            char c = s.charAt(i);
            if (ss.contains(Character.toString(c))
                    && s.indexOf(c) == s.lastIndexOf(c)
                    && ss.indexOf(c) == ss.lastIndexOf(c)
            )
                res += c;
        }

        return res;
    }



    public static String Task29(String s) {
        return s.replace('a', 'A').replace('b', 'B');
    }

    public static String Task30(String s) {
        return s.length() <= 2 ? "" : s.substring(1, s.length()-1);
    }
}


