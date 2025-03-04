package com.javacore.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean isEnabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-countries}")
    private List<String> supportedCountries;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
        System.out.println("APIURL: " + apiUrl);
        System.out.println("Enabled: " + isEnabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Countries: " + supportedCountries );
    }
}
