package com.streetflo.miocat.util;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.apache.tomcat.util.codec.binary.Base64;

public class AES256Cipher {
	
	
	private final static String BLOCK_TYPE = "AES/CBC/PKCS5Padding";
	private final static String ENCODING = "UTF-8";
	private KeySpec kyeSpec;
	
	public AES256Cipher(KeySpec kyeSpec) {
		
		this.kyeSpec = kyeSpec;
		
	}
	
	
	public String AesEncode(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
		
		
		Cipher c = Cipher.getInstance(BLOCK_TYPE);
		c.init(c.ENCRYPT_MODE, key, params);
		byte[] encodeStr = c.doFinal(str.getBytes(ENCODING));
		
		return new String(new Base64().encodeBase64(encodeStr));
		
	}
	
	
	public String AesDecode(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
		
		
		Cipher c = Cipher.getInstance(BLOCK_TYPE);
		c.init(c.DECRYPT_MODE, key, params);
		byte[] decodeStr = Base64.decodeBase64(str.getBytes());
		
		return new String(c.doFinal(decodeStr),ENCODING);
		
	}
	
	
	
	public static class KeySpec{
		

		public AES256Cipher bulid() {
			
			return new AES256Cipher(this);
		}
		
		
	}

	
	

}
