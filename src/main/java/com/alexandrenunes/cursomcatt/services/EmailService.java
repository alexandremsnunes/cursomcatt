package com.alexandrenunes.cursomcatt.services;

import org.springframework.mail.SimpleMailMessage;

import com.alexandrenunes.cursomcatt.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
