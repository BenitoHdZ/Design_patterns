# Challenge - Strategy

## Código
```java
class Payment {
    void pay(String method, double amount){
        if(method.equals("paypal")){
            System.out.println("Pagando " + amount + " con PayPal");
        } else if(method.equals("card")){
            System.out.println("Pagando " + amount + " con Tarjeta");
        }
    }
}

Instrucciones

Reemplaza condicionales por estrategias (PaymentStrategy).

Implementa clases concretas: PayPalStrategy, CardStrategy.

Usa una clase PaymentContext que acepte la estrategia.

Tips

¿Qué principio SOLID se aplica?

¿Cómo podrías agregar nuevos métodos de pago sin modificar código?