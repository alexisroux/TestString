package presentation;

import metier.Maj;
import metier.Prefix;
import metier.Sufix;

public class Main {
	
	public static void main(String[] args) {
		
		String phrase = "test";
		
		String phraseSufix = Sufix.transform(phrase);
		String phrasePrefix= Prefix.transform(phrase);
		String phraseMaj = Maj.transform(phrase);
		System.out.println("Phrase de base : "+phrase);
		System.out.println("Phrase avec sufixe : "+phraseSufix);
		System.out.println("Phrase avec préfixe :"+phrasePrefix);
		System.out.println("Phrase en majuscules : "+phraseMaj);
	}
}
