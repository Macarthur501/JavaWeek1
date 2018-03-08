import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Converter {
public Converter() {
		
	}

//	ArrayList<String> morseInputArray = new ArrayList<String>();
	
	Alphabet alpha = new Alphabet();
	
	public String getMorseInput() {
		System.out.println("Enter your morse code to be converted: ");
		Scanner sc = new Scanner(System.in);
		String morseInput = sc.nextLine();
		return morseInput;
		
	}
	public String getAlphaInput() {
		System.out.println("Enter your message to be converted into morse: ");
		Scanner sc = new Scanner(System.in);
		String alphaInput = sc.nextLine();
		return alphaInput.toLowerCase();
		
	}
	public String[] splitMorseInputToWords(String morseInput) {
		
		String[] toWords = morseInput.split(" / ");
		return toWords;
		
	}
	public String[] splitAlphaInputToWords(String alphaInput) {
		
		String[] toWords = alphaInput.split(" ");
		return toWords;
		
	}
	public String[] convertToAlphabet(String[] toWords) {
		
		for(int i = 0; i < toWords.length; i++) {
			String[] toLetters = toWords[i].split(" ");
		
			for(int j = 0; j < toLetters.length; j++) {
			
				for(String k : alpha.morseLetters) {
				
					if(k.equals(toLetters[j])) {
						int pos = alpha.morseLetters.indexOf(k);
						toLetters[j] = alpha.alphaLetters.get(pos);
						
					}
					
				
				}
			}
		
			toWords[i] = Stream.of(toLetters).collect(Collectors.joining());
		
		}
		return toWords;
		
		
	}
	public String[] convertToMorse(String[] toWords) {
		
		for(int i = 0; i < toWords.length; i++) {
			String[] toLetters = toWords[i].split("");
		
			for(int j = 0; j < toLetters.length; j++) {
			
				for(String k : alpha.alphaLetters) {
				
					if(k.equals(toLetters[j])) {
						int pos = alpha.alphaLetters.indexOf(k);
						toLetters[j] = alpha.morseLetters.get(pos);
						
					}
					
				
				}
			}
		
			toWords[i] = Stream.of(toLetters).collect(Collectors.joining(" "));
		
		}
		return toWords;
		
		
	}
	
	public void outputSentenceMorse(String[] toWords) {
		
		for(int i=0; i < toWords.length; i++) {
			
			System.out.print(toWords[i] + " / ");
		}
		System.out.println("\nLetters have a space between them, and words are seperated by a /");
	}
	public void outputSentenceAlpha(String[] toWords) {
		
		for(int i=0; i < toWords.length; i++) {
			
			System.out.print(toWords[i] + " ");
		}
		
	}
	public void runProgram() {
		System.out.println("Enter a 1 if you would like to convert from morse code \nor a 2 if you would like to convert into morse code. ");
		Scanner sc = new Scanner(System.in);
		int choiceInput = sc.nextInt();
		alpha.addMorseLetters();
		alpha.addAlphaLetters();
		switch(choiceInput) {
		case 1:
			String morseInput = getMorseInput();
			String[] toWords = splitMorseInputToWords(morseInput);
			
			String[] convertedWords = convertToAlphabet(toWords);
			outputSentenceAlpha(convertedWords);
			break;
		case 2:
			String alphaInput = getAlphaInput();
			String[] toWords2 = splitAlphaInputToWords(alphaInput);
			String[] convertedMorse = convertToMorse(toWords2);
			outputSentenceMorse(convertedMorse);
			break;
		default:
			System.out.println("You did not enter a correct value, please try again.");
			runProgram();
		}
	}
}
