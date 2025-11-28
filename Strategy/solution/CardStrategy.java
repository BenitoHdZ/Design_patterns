class CardStrategy implements PaymentStrategy {
    public void pay(double amount){ System.out.println("Pagando " + amount + " con Tarjeta"); }
}