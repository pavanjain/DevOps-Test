package com.tutorial.sample;

import java.io.FileReader;

public class AuthenticateUser {

	public void authenticateUser(UserInfo userInfo, UserStorage userStorage){
		String name =userInfo.getName().substring(0, 2);
		String dob = userInfo.getDob().substring(0, 2);;
		String phonenumber = userInfo.getPhonenumber().substring(0, 2);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name).append(dob).append(phonenumber);
		String reverseInput= stringBuffer.reverse().toString();
		String userKey=userStorage.getKey();
		if (reverseInput.equals(userKey)){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
	
//	public void userStorage(){
//		FileReader fileReader = new FileReader("D:");
//		
//	}
}
