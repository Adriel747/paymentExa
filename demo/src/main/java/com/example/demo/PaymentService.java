package com.example.demo;

public class PaymentService {
    public String processPayment(String cardNumber, String cvv, String expirationDate, double amount) {
        // Aquí podrías agregar la lógica para validar la tarjeta y procesar el pago.
        if (isValidCard(cardNumber, cvv, expirationDate) && amount > 0) {
            return "Payment of " + amount + " processed successfully.";
        } else {
            return "Payment failed. Invalid details or amount.";
        }
    }

    private boolean isValidCard(String cardNumber, String cvv, String expirationDate) {
        // Aquí deberías agregar la lógica para validar los datos de la tarjeta
        return cardNumber.length() == 16 && cvv.length() == 3 && !expirationDate.isEmpty();
    }
}
