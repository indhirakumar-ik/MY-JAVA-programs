package indhirakumar;

class countingVowelsAndConsonents{
	void main(){
		String name="Indhirakumar";
		String word=name.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("Number of vowels in the word is :"+vowels);
		System.out.println("Number of consonent in the word is :"+consonants);
	}
}

class countDigitAlphabetSpecialCharacter {
	void main() {
		String a="indhirakumade@@1323";
		String word=a.toLowerCase();
		int character=0,alphabet=0,specialChar=0;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(Character.isDigit(c) ) {
				character++;
			}else if(Character.isLetter(c)) {
				alphabet++;
			}else {
				specialChar++;
			}
		}
		System.out.println("Number of Alphabet :"+alphabet);
		System.out.println("Number of Digits :"+character);
		System.out.println("Number of SpecialCharacter :"+specialChar);
	}
}



public class JavaHomeWorks {

	public static void main(String[] args) {
		countingVowelsAndConsonents c1=new countingVowelsAndConsonents();
		c1.main();
		countDigitAlphabetSpecialCharacter cha1=new countDigitAlphabetSpecialCharacter();
		cha1.main();
	}

}
