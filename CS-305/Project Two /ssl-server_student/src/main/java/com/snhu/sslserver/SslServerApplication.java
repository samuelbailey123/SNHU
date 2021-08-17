package com.snhu.sslserver;

import java.security.MessageDigest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController 
class ServerController{

	@RequestMapping("/hash")
	public String myHash() throws NoSuchAlgorithmException{
		String name = "Samuel Bailey"; 
		String outputline; 
		MessageDigest mDigest = MessageDigest.getInstance("SHA-356");
		mDigest.update(name.getBytes()); 
		byte[] digest = mDigest.digest(); 
		StringBuffer hexString = new StringBuffer(); 
		for (int i = 0; i<digest.length; i ++){
			hexString.append(Integer.toHexString(0xFF & digest[i]));
		}
		outputline = "Name output: " + name + " Check sum value: " + hexString.toString();
		return outputline; 

	}
}