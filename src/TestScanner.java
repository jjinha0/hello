import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class TestScanner {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        String inputted = in.nextLine();//Scanner type의 in, nextLine()을 만나면 일시정지하고 입력을 기다림
        System.out.println("->" + inputted);
    }
}
