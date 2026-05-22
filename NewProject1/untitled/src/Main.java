//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   int x;

   public static void myWelcome(){
       System.out.println("||WELCOME TO THE HANGMAN GAME||");
       System.out.println("\nYOUR WORD IS: ");
   }

    public void myHangman(){

      if (x == 0){
          System.out.printf("%5s", "O");
      } else if(x == 1) {
          System.out.printf("3%s", "/");
      } else if(x == 2){
          System.out.printf("%5s","|");
      } else if(x == 3){
          System.out.printf("%7s","\\");
      } else if(x == 4){
          System.out.printf("3%s","/");
      } else if(x == 5){
          System.out.printf("%7s","\\");
      }
  }
    public static void myWord(){
        String word = "coconut";
        int length = word.length();

        for(int i = 0; i < length; i++){
            System.out.print("_ ");
        }
  }
  public static void main(String[] args) {
   myWelcome();
   myWord();



  }

}