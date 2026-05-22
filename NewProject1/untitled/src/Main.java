//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  static int x;

    public static void myMethod(){

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
}