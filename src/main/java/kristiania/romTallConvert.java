package kristiania;


public class romTallConvert {

    public static String toRoman(int numb) {
        StringBuilder romannumb = new StringBuilder();


        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (numb >= values[i]) {

                numb -= values[i];

                romannumb.append(romanLiterals[i]);
            }

        }
        return romannumb.toString();
    }
}

