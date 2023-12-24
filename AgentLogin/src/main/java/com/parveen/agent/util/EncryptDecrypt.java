package com.parveen.agent.util;

import java.util.Base64;

public class EncryptDecrypt {
	
	public static String encrypt(String data) {
	String encode=Base64.getEncoder().encodeToString(data.getBytes());
	
	return encode;
	}
	
	public static byte[] decrypt(String data) {
	byte[] decode=Base64.getDecoder().decode(data.getBytes());
	return decode;
	}

}
