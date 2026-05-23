//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Game {
    String word = "coconut";
    int length = word.length();
    int x = 0;

    public void myWelcome() {
        System.out.println("||WELCOME TO THE HANGMAN GAME||");
        System.out.println("\nYOUR WORD IS: ");
    }

    public void myHangman() {

        if (x == 0) {
            System.out.printf("%5s", "O\n");
        } else if (x == 1) {
            System.out.printf("%5s%3s", "O\n","/\n");
        } else if (x == 2) {
            System.out.printf("%5s%3s%s", "O\n","/","|\n");
        } else if (x == 3) {
            System.out.printf("%5s%3s%s%s", "O\n","/","|","\\\n");
        } else if (x == 4) {
            System.out.printf("%5s%3s%s%s%4s", "O\n","/","|","\\\n","/\n");
        } else if (x == 5) {
            System.out.printf("%5s%3s%s%s%3s %s", "O\n","/","|","\\\n","/","\\\n");
        }
    }


    public void main(String[] args) {
        myWelcome();
        Scanner myObj = new Scanner(System.in);

        int i = 0;

        while (i < length) {
            String text = "_ ".repeat(length);
            System.out.print(text);

            System.out.println("\n\nENTER A LETTER: ");

            String userLetter = myObj.nextLine();
            String lowerCase = userLetter.toLowerCase();

            String c = String.valueOf(word.charAt(i));


            if (c.equals(lowerCase)) {
                text = text.replace("c","upperCase");


            } else {
                myHangman();
                x++;
                if (x == 6){
                    System.out.println("YOU LOST");
                    break;
                }
            }
            i++;
        }
    }
}