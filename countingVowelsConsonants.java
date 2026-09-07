package indhirakumar;

public class countingVowelsConsonants {

	public static void main(String[] args) {
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
