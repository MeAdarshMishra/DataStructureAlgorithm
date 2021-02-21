import java.util.Scanner;

class MorseCode
{
    public static String morseToString(char x)
    {

        return switch (x) {
            case 'a' -> ".-";
            case 'b' -> "-...";
            case 'c' -> "-.-.";
            case 'd' -> "-..";
            case 'e' -> ".";
            case 'f' -> "..-.";
            case 'g' -> "--.";
            case 'h' -> "....";
            case 'i' -> "..";
            case 'j' -> ".---";
            case 'k' -> "-.-";
            case 'l' -> ".-..";
            case 'm' -> "--";
            case 'n' -> "-.";
            case 'o' -> "---";
            case 'p' -> ".--.";
            case 'q' -> "--.-";
            case 'r' -> ".-.";
            case 's' -> "...";
            case 't' -> "-";
            case 'u' -> "..-";
            case 'v' -> "...-";
            case 'w' -> ".--";
            case 'x' -> "-..-";
            case 'y' -> "-.--";
            case 'z' -> "--..";
            case 'A' -> "*-";
            case 'B' -> "-***";
            case 'C' -> "-*-*";
            case 'D' -> "-**";
            case 'E' -> "*";
            case 'F' -> "**-*";
            case 'G' -> "--*";
            case 'H' -> "****";
            case 'I' -> "**";
            case 'J' -> "*---";
            case 'K' -> "-*-";
            case 'L' -> "*-**";
            case 'M' -> "--";
            case 'N' -> "-*";
            case 'O' -> "---";
            case 'P' -> "*--*";
            case 'Q' -> "--*-";
            case 'R' -> "*-*";
            case 'S' -> "***";
            case 'T' -> "-";
            case 'U' -> "**-";
            case 'V' -> "***-";
            case 'W' -> "*--";
            case 'X' -> "-**-";
            case 'Y' -> "-*--";
            case 'Z' -> "--**";
            case '1' -> ".----";
            case '2' -> "..---";
            case '3' -> "...--";
            case '4' -> "....-";
            case '5' -> ".....";
            case '6' -> "-....";
            case '7' -> "--...";
            case '8' -> "---..";
            case '9' -> "----.";
            case '0' -> "-----";
            default -> "";
        };
    }

    static void morseCode(String s)
    {
        for (int i = 0;i<s.length(); i++)
            System.out.print(morseToString(s.charAt(i)));
        System.out.println();
    }
    public static void main (String[] args)

    {
        System.out.println("Enter Your Normal String to Covert in into MorseCode");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        morseCode(str);
    }
}