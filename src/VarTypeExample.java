/**
 * Created by danawacomputer on 2017-04-04.
 */
public class VarTypeExample {

    public static void main(String[] args){
        //integer type
        int myInt = 2_000_000_000; //java7부터 _로 구분해도 됨
        long myLong = 1_000_000_000_000_000_000L;

        int myIntg; //변수의 선언, 메모리 공간을 확보한다.
        myIntg = 5; //최초로 변수에 값을 담는 행위, 초기화.
        myIntg = 7; //재할당, re-assignment


        //float type
        double myDouble = 3.14;

        //string type
        String myStr = "Hello world";

        //char type
        char myChar = 'a';

        //boolean type
        boolean myBool = true;

        System.out.println(myBool);

    //왼쪽에 변수타입, 오른쪽에 변수명, 변수타입과 변수명의 타입이 같아야 한다.

    }
}
