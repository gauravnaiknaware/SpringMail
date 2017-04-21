package com.bonzai.decode;

import java.util.Base64;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;

public class DecodePassword extends DataSourceProperties {

	@Override
	public String getPassword() {
		String password = super.getPassword();
		return decode(password);
	}
	
	 private String decode(String decode) {	
		 byte[] asBytes = Base64.getDecoder().decode(decode);
		 return new String(asBytes);
	}
	 
	@Bean
	public DecodePassword decodePassword(){
		return new DecodePassword();
	}
}
