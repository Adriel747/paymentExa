package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    @Test
    public void testProcessPayment() {
        // Arrange: Preparamos los datos de entrada y el resultado esperado
        String validCardNumber = "1234567812345678";
        String validCvv = "123";
        String validExpirationDate = "12/25";
        double validAmount = 100.0;
        String expectedSuccessMessage = "Payment of 100.0 processed successfully.";

        String invalidCardNumber = "1234";
        double invalidAmount = -50.0;
        String expectedFailureMessage = "Payment failed. Invalid details or amount.";

        // Act: Llamamos al método a probar
        String actualSuccessMessage = paymentService.processPayment(validCardNumber, validCvv, validExpirationDate, validAmount);
        String actualFailureMessage1 = paymentService.processPayment(invalidCardNumber, validCvv, validExpirationDate, validAmount);
        String actualFailureMessage2 = paymentService.processPayment(validCardNumber, validCvv, validExpirationDate, invalidAmount);

        // Assert: Verificamos que los resultados sean los esperados
        assertEquals(expectedSuccessMessage, actualSuccessMessage, "El pago debería ser procesado exitosamente.");
        assertEquals(expectedFailureMessage, actualFailureMessage1, "El pago debería fallar debido a la tarjeta inválida.");
        assertEquals(expectedFailureMessage, actualFailureMessage2, "El pago debería fallar debido a un monto inválido.");
    }
}