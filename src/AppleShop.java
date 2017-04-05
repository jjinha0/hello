import java.text.DecimalFormat;

/**
 * Created by danawacomputer on 2017-04-04.
 */

//Apple Shop에서 iPad Pro 를 15% 할인한다면 얼마인지 계산해 출력 해보세요.
//iPad Pro 정가 : 999,000원
public class AppleShop {
    public static void main(String[] args){

        int listPrice = 999000;
        double discountedPrice = listPrice * 0.85;
        DecimalFormat commaIn = new DecimalFormat("#,###");

        System.out.println("할인 가격은 " + commaIn.format(discountedPrice) + "입니다.");

    }



}
