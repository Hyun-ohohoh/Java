package poly.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {
        PayService1 payService = new PayService1();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 10000;
        payService.processPay(payOption3, amount3);

        //잘못된 결제 수단 선택
        String payOption4 = "toss";
        int amount4 = 10000;
        payService.processPay(payOption4, amount4);
    }
}
