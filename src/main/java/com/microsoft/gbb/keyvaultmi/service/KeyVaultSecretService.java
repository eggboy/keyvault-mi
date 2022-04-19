package com.microsoft.gbb.keyvaultmi.service;

import com.azure.security.keyvault.secrets.SecretClient;

public class KeyVaultSecretService {

	private final SecretClient secretClient;

	public KeyVaultSecretService(SecretClient secretClient) {
		this.secretClient = secretClient;
	}

	public String getValue(String key) {
		var keyVaultValue = secretClient.getSecret(key);

		if (keyVaultValue == null)
			return "null";
		else
			return keyVaultValue.getValue();
	}

}
