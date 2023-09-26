package br.com.movimentacaoservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class MovimentacaoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovimentacaoServiceApplication.class, args);
	}

}
