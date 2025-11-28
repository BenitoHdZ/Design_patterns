class Payment {
    void pay(String method, double amount){
        if(method.equals("paypal")){
            System.out.println("Pagando " + amount + " con PayPal");
        } else if(method.equals("card")){
            System.out.println("Pagando " + amount + " con Tarjeta");
        }
    }
}