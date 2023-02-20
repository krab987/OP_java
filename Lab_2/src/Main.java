import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {

    static void tests (){

        int x;
        x = 1;

        var a = 1; // var сам зрозуміє що там за тип потрібно взять
        // var b; помилка - потрібно зразу ініціювать
        final int LIMIT = 5; // constanta
        System.out.println(LIMIT);  // 5

        boolean isActive = false; // бул
        byte am = 3; // 1 byte

        System.out.print("Hello world!"); // тупо принт
        System.out.print("Bye world...");

        System.out.println("Hello world!"); // принт на кожну нову строчку
        System.out.println("Bye world...");

    }

    public static void main(String[] args) {

        System.out.println("Hello Java! It`s my first program. Don`t judge strictly");
        System.out.println("Input text (small eng symbols) --> ");

        Scanner in = new Scanner(System.in); // підключили клас сканер, який користується System.in для вводу
        String input;
        boolean check;
        do{

            input = in.nextLine(); // прочитали записали в инпут\

            input = input.replace(" ", "");
            input = input.replace(".", "");

            check = inValid(input);

        }while(check == false);

        char [] letters = replace(input);
        input = zeroOut(letters);
        System.out.println(input);

        in.close();
    }

    static boolean inValid(String s){
        boolean onlyLatin = s.matches("^[a-zA-Z]+$");
        return onlyLatin;
    }
    static char [] replace (String s){

        char[] letters = s.toCharArray();
        char[] reletters = new char[letters.length];
        int number = 0;

        Arrays.sort(letters);

        for(int i = 0; i < letters.length; i++){
            int count = 0;
            for(int j = i + 1; j < letters.length; j++){
                if(letters[i] == letters[j]){
                    count++;
                }
            }
            if(count > 0){
                reletters[number] = letters[i];
                number++;
                i += count;
            }
        }

        return reletters;

    }
    static String zeroOut(char[] symbols) {
        String str = "";
        for (char symbol:
                symbols) {
            if (symbol != 0) {  // якщо символ не 0 то зберігаєм
                str += symbol + " ";
            }
        }
        return str;
    }
}

