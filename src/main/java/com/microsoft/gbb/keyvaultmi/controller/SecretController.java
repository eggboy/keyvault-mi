package com.microsoft.gbb.keyvaultmi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {
	@Value("${connectionString:default value}")
	private String connectionString;

	@GetMapping("/property-source")
	public String getProperty() {
		return connectionString;
	}
}
