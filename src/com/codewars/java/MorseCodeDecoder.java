package com.codewars.java;

import java.util.HashMap;

public class MorseCodeDecoder {
	public static String decode(String morseCode) { 
		
		HashMap<String, String> morseCodeStorage = new HashMap<String, String>();
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L",
				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
				"0","1","2","3","4","5","6","7","8", "9",
				".", ",", "!", "SOS"};
		String[] morseCharacters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", 
				"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",             
				".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
				"---..", "----.",
				".-.-.-", "--..--", "-.-.--", "···−−−···"};
		for (int i=0; i<alphabet.length;i++) {
			morseCodeStorage.put(morseCharacters[i], alphabet[i]);
		}
		String crackedCode = "";
		for (String word : morseCode.trim().split("   ")) {
			for (String letter : word.trim().split("\\s")) {
				crackedCode += morseCodeStorage.get(letter);
			}
			crackedCode += ' ';
		}
		return crackedCode.trim();	
}
}

