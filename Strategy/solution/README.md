# Solución - Strategy

## Cambios principales
- Se definió interfaz `PaymentStrategy`.
- Se crearon estrategias concretas.
- Se eliminó el uso de condicionales.

## Código
```java
interface PaymentStrategy {
    void pay(double amount);
}

class PayPalStrategy implements PaymentStrategy {
    public void pay(double amount){ System.out.println("Pagando " + amount + " con PayPal"); }
}

class CardStrategy implements PaymentStrategy {
    public void pay(double amount){ System.out.println("Pagando " + amount + " con Tarjeta"); }
}

class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy){ this.strategy = strategy; }
    public void pay(double amount){ strategy.pay(amount); }
}

public class Main {
    public static void main(String[] args){
        PaymentContext ctx = new PaymentContext();
        ctx.setStrategy(new PayPalStrategy());
        ctx.pay(100);
        ctx.setStrategy(new CardStrategy());
        ctx.pay(50);
    }
}

Salida esperada:
Pagando 100 con PayPal
Pagando 50 con Tarjeta

Extensión:
Añadir CryptoStrategy sin cambiar codigo existente.