package org.execute;

import java.io.IOException;

import org.sample.HDFCBanking;

public class HDFCOutput {
	public static void main(String[] args) throws IOException {
		HDFCBanking h = new HDFCBanking ();
		h.readDataFromDP();
		h.setUsername("Hema");
		h.setPassword("hema@101");
		String password = h.getPassword();
		h.setBalance(1);
		int balance = h.getBalance();
		System.out.println(balance);
	}
	

}
