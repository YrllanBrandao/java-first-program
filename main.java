import java.util.Scanner;


public class main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
       System.out.println("STARTING CONNECTION...");

       int i = 0;
        while(i < 100)
        {
            i+=10;
            System.out.println("loading......" + i);

        }


        System.out.println("Type your username");
        String username = "";
        username = scan.nextLine();


        System.out.println("please, enter your password");
        String password = "";

        password = scan.nextLine();


        System.out.println("RESULT" + password);
        if(password.equals("123456"))
        {
            System.out.println("LOGIN SUCESSFULLY!");

        }
        else{
            System.out.println("LOGIN FAILED, ABORTING...");
        }
;    }

}