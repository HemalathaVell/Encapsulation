package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class HDFCBanking {
	Map<String,Integer> m;
	//data member -private variable
	//database-no of coloumn=no of data menmenr
	//datatype of coloum=datatype of variable
	//coloumnname=variablename
	private  String username;
	
	private String password;
	
	private int balance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.equals("Hema")) {
			
		this.username = "Hema Account";
	}
	else if(username.equals("Mohan")) {
		this.username="mohan Account";
}
	else if(username.equals("Yuvi")) {
		this.username="yuvi Account";
}
	else {
		this.username="Invalid Account";
	
	}
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.equals("hema@101")&&username.equals("Hema Account")) {
		this.password="Hema Account is Validated" ;
	}
		else if(password.equals("mohan@102")&&username.equals("Mohan Account")) {
		this.password="Mohan Account is Validated" ;
	}
		else if(password.equals("yuvi@103")&&username.equals("Yuvi Account")) {
			this.password="Yuvi Account is Validated" ;
		}
		else {
			this.password="Invalid Account";
	}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(this.password.equals(entry.getKey())) {
		this.balance = entry.getValue();
	}
		}
	}
			public void readDataFromDP()throws IOException{ 
				File f =new File("C:\\Users\\hemav\\eclipse-workspace\\Encapsulation\\BankInfo\\bank.txt");
				List<String> readLines = FileUtils.readLines(f);
				m= new LinkedHashMap();
				String string=readLines.get(0);
				String[] split = string.split(",");
				m.put("Hema Account is Validated", Integer.parseInt(split[2]));
				String string1=readLines.get(1);
				String[] split1 = string1.split(",");
				m.put("Mohan Account is Validated", Integer.parseInt(split1[2]));
				String string2=readLines.get(2);
				String[] split2 = string2.split(",");
				m.put("Yuvi Account is Validated", Integer.parseInt(split2[2]));
				
				
				
			}
	
		
		
	}
	
	
	


