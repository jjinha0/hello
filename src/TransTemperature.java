/**
 * Created by danawacomputer on 2017-04-04.
 */

// (섭씨 X 1.8) + 32= 화씨
// (화씨 - 32) / 1.8 = 섭씨

public class TransTemperature {
    public static void main(String[] args){
        double tempF, tempC;

        tempC = 19;
        tempF = (tempC * 1.8) + 32;
        tempC = (tempF - 32) / 1.8;

        System.out.println("섭씨온도는 " + tempC + "입니다.");
        System.out.println("화씨온도는 " + tempF + "입니다.");
    }
}
