//Ittehad Qabid Java - Working with Strings

import java.util.Scanner;
public class StringManips
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String phrase = new String(" This is a string test!");
		
		int phraseLength;
		int middleIndex;
		String firstHalf;
		String secondHalf;
		String switchedPhrase;
		String middle3 = null;
		String city, state, hometown;
		
		phraseLength = phrase.length();
		middleIndex = phraseLength/2;
		
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex,phraseLength);
		switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = switchedPhrase.replace(' ', '*');
		
		System.out.print("Enter your City: ");
		city = sc.nextLine().trim();
		System.out.print("Enter your State: ");
		state = sc.nextLine().trim();
		hometown = state.toUpperCase() + city.toLowerCase() + state.toUpperCase();
		System.out.println();
		
		System.out.println("The Original Phrase is:" + phrase);
		System.out.println("The Length of the Phrase is: " + phraseLength + "characters");
		System.out.println("The Index of the Middle is: " + middleIndex);
		System.out.println("The Character at the Middle Index is: " + phrase.charAt(middleIndex));
		System.out.println("The Switched Phrase is: " + switchedPhrase);
		System.out.println("The Middle 3 Characters are: " + middle3);
		System.out.println("Your Modified Hometown is: " + hometown);
		System.out.println();
	}
}


