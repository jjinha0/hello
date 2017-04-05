/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {

    public static void main(String[] args){

        String[] strArr = {"최우영스시", "은행골", "돌배기집", "육식예찬", "낭만부대찌개"};

        /*
        1. 각 엘레먼트의 글자 수의 평균 구하기.
        2. 글자수가 3글자 이하인 엘레먼트의 배열을 만드시오.
         */

        int sumLength = 0;
        int count = 0;
        int strArrLeng = 0;
        for(String e : strArr) {

            strArrLeng = e.length();
            count++;
            sumLength += strArrLeng ;

            if (strArrLeng <= 3) {
                System.out.print(e + " ");

            }
        }

        double sumAvgLength = sumLength / (double)count;
        System.out.println();
        System.out.println(sumAvgLength);



    }


}
