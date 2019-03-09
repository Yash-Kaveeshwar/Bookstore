package com.bookstore.service.impl;

import com.bookstore.domain.Payment;
import com.bookstore.domain.UserPayment;
import com.bookstore.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * The type Payment service.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Payment setByUserPayment(UserPayment userPayment, Payment payment) {

		payment.setType(userPayment.getType());
		payment.setCardNumber(userPayment.getCardNumber());
		payment.setCvc(userPayment.getCvc());
		payment.setExpiryMonth(userPayment.getExpiryMonth());
		payment.setExpiryYear(userPayment.getExpiryYear());
		payment.setHolderName(userPayment.getHolderName());

		return payment;
	}
}
