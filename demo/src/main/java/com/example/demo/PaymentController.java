package com.example.demo;

public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam String cardNumber,
                                 @RequestParam String cvv,
                                 @RequestParam String expirationDate,
                                 @RequestParam double amount) {
        return paymentService.processPayment(cardNumber, cvv, expirationDate, amount);
    }
}
