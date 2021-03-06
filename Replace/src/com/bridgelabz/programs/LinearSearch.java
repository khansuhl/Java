/*
 Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
   search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
   to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
*/
package com.bridgelabz.programs;

import java.util.ArrayList;

import com.bridgelabz.util.Utility;

public class LinearSearch {

	public static void main(String[] args) {

		// INITIALIZATION
		Utility u = new Utility();
		ArrayList<String> MyList;
		String Input, FilePath;
		System.out.print("Enter file path: ");
		FilePath = u.inputString();
		System.out.print("Enter word to search: ");
		Input = u.inputString();

		// COMPUTATION
		MyList = u.ReadFile(FilePath);
		if (MyList.contains(Input))
			System.out.print("String is FOUND");
		else
			System.out.print("String is NOT FOUND");

	}
}
