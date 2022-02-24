package by.si;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mode;
        Scanner scanMode = new Scanner(System.in);
        for ( int i = 0; i < 6; i++ ){
            System.out.println( (i+1)  + " - Run Task" + (i+1));
        }
      do{
          System.out.print("Choose Task: ");
          mode=scanMode.nextInt();
          switch (mode){
              case 1:
                  Task1();
                  break;
              case 2:
                  Task2();
                  break;
              case 3:
                  Task3();
                  break;
              case 4:
                  Task4();
                  break;
              case 5:
                  Task5();
                  break;
              default:
                  break;
          }
          System.out.println(" *** Task completed **** ");
      }while (mode!=6);
          System.out.println(" *** Work completed **** ");
}

    static void Task1(){
        String str;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your text: ");
            str = scanner.nextLine();
        } while (!str.equals("Exit"));

    }

    static  void Task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your digit: "  );
        int x = scanner.nextInt();
        int sum = 0;
        int min = x < 0  ? x : 0;
        int max = x < 0 ? 0 : x;
        for ( int i = min ; i <= max; i++ ){
            sum += i;
        }
        System.out.printf("The sum all numbers from %d to %d = %d  \n" , min , max , sum);
    }

    static void Task3() {
       System.out.print("Enter your score: ");
       Scanner scanner = new Scanner(System.in);
       int score = scanner.nextInt();
       while (true){
        if (score >= 70 && score <= 100 )  {
            System.out.println("You've passed test ");
            break;
        }else{
        if (score >= 0  && score < 70) {
            System.out.println("You've failed test ");
            break;
        }else {
            if (score > 100 || score < 0) {
                System.out.print("Repeat your scope: ");
                score = scanner.nextInt();
            }
        }
      }
    }
  }
  static void Task4() {
      String[] button = { "TNT","Euronews","Eurosport","CNN","CTC","Travel","Discovery","Mezzo","RBK" };
      System.out.print("Please choose program from 0 to 9: ");
      Scanner scanner = new Scanner(System.in);
      int program = scanner.nextInt();
      if ( program > 9 ||  program < 0 ) {
          System.out.println("No such program");
          return;
      }
      while ( program != 0 ) {
          System.out.printf( "Button %d - You watch %s",program,button[program-1] + "\n");

          System.out.print("Please choose program from 0 to 9: ");
          program = scanner.nextInt();
      }
      System.out.println(" ****  GoodBye  ****");

  }
  static void Task5(){
    String menu[] = {"Name","LastName","Уear of Birth","Information","Exit"};
    int mode;
    String name= "";
    String lastName="";
    String year="";

    Scanner scanner = new Scanner(System.in);
    Scanner scanMode = new Scanner(System.in);
    for ( int i = 0; i < menu.length-1; i++ ){
         System.out.println(( i+1 ) + " - Enter " + menu[i]);
      }
    System.out.println(  "0 - Enter " + menu[4]);
    do {
          System.out.print("Please choose mode: ");
          mode = scanMode.nextInt();
          switch (mode) {
              case 1:
                  System.out.print("Enter your name: ");
                  name = scanner.nextLine();
                  break;
              case 2:
                  System.out.print("Enter your Last name: ");
                  lastName = scanner.nextLine();
                  break;
              case 3:
                  System.out.print("Enter your Уear of Birth: ");
                  year = scanner.nextLine();
                  break;
              case 4:
                  System.out.printf("Your name : %s %s .  You were born in %s", name, lastName, year + "\n");
                  break;
              default:
                  break;
          }
      }while (mode != 0);
  }
}

