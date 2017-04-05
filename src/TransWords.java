/**
 * Created by danawacomputer on 2017-04-04.
 */

//soongon의 s를 맨 뒤로 보내고 뒤에 ay 붙여서 oongonsay만들기

public class TransWords {
    public static void main(String[] args){

        String originWords = "soongon";

        String sliced1 = originWords.substring(0,1);
        String sliced = originWords.substring(1);//숫자 하나면 주면 1부터 끝까지 라는 뜻
        String transWords = sliced + sliced1 + "ay";
        System.out.println(transWords);


    }
}
