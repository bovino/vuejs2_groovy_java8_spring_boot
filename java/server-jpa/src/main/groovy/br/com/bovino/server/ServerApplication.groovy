package br.com.bovino.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class ServerApplication {

	static void main(String[] args) {
		SpringApplication.run ServerApplication, args
	}
}
