/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {

    public static void main(String[] args){

        String myStr = "Hello, World!";
        String myStr2 = "안녕하세요!";

        String result = myStr + myStr2;
        String sliced = myStr2.substring(0,2);
        String sliced2 = myStr2.substring(5,6);
        String result2 = myStr + 3;
        //System.out.println(sliced + sliced2);
        boolean b = myStr.contains("Work");
        boolean a = myStr.startsWith("He");
        System.out.println(a);

    }
}
