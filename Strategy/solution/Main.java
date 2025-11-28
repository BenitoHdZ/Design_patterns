public class Main {
    public static void main(String[] args){
        PaymentContext ctx = new PaymentContext();
        ctx.setStrategy(new PayPalStrategy());
        ctx.pay(100);
        ctx.setStrategy(new CardStrategy());
        ctx.pay(50);
    }
}