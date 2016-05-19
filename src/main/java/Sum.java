import java.util.Scanner;

/**
 * Created by manjushadas on 5/19/16.
 */
public class Sum {
    int answer;
    Scanner scanner= new Scanner(System.in);
    public void newSum(){
        System.out.println("Type a number:");
        answer=1+scanner.nextInt();
        System.out.println("Your number is one less than: "+ answer);
        return;
    }
}
