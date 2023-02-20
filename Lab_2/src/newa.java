public class newa {
    public static void main(String[] args) {
        String[] inputStrings = {"jjjaavva", "jar", "android", "", "qwertyqwerty", "jajavava"};

        for (String input : inputStrings) {
            System.out.println(input + " - " + replaceDuplicatesWithTemplate(input));
        }
    }

    // удаляем дубликаты из входной строки
    public static String replaceDuplicatesWithTemplate(String inputString) {
        // проверяем входну строку на валидность
        if (inputString == null || inputString.length() < 2) {
            return inputString;
        }
        // возможная позиция дублирующего символа
        int position = 1;
        char[] characters = inputString.toCharArray();
        for (int i = 1; i < inputString.length(); i++) {
            int j;
            // находим уже пройденную позицию
            for (j = 0; j < position; ++j) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            // если это символ в этой же позиции, то идем к следующему символу
            if (j == position) {
                characters[position] = characters[i];
                ++position;
                // иначе заменяем его на шаблон 0 и переходим к следующему символу
            } else {
                characters[position] = 0;
                ++position;
            }
        }
        return getStringWithoutDuplicates(characters);
    }

    public static String getStringWithoutDuplicates(char[] inputChars) {
        StringBuilder stringBuilder = new StringBuilder(inputChars.length);
        for (char character : inputChars) {
            // если символ не равен шаблону 0, то это не дубль,
            // значит сохраняем его
            if (character != 0) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}