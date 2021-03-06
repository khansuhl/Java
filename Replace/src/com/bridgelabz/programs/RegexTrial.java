/*
 Regular Expression Demonstration
a. Desc -> Read in the following message: Hello <<name>>, We have your full
   name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
   Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
   Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
       i. Replace <<name>> by first name of the user (assume you are the user) 
          replace <<full name>> by user full name.
       ii. replace any occurance of mobile number that should be in format
       iii. 91-xxxxxxxxxx by your contact number.
       iv. replace any date in the format XX/XX/XXXX by current date.
d. O/P -> Print the Modified Message. 
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTrial {

	public static void main(String[] args) {

		Utility u = new Utility();
		String str = "", FilePath = "";

		System.out.print("Enter file path: ");
		FilePath = u.inputString();

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(FilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			str = str.concat(scanner.nextLine());
		}
		scanner.close();
		System.out.println(str);
		
		String firstName = "abc", phoneNumber;
		System.out.print("Enter Your Full Name: ");
		String fullName = u.inputString();

		// Taking name and checking the conditions
		boolean checkName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*", fullName);

		if (checkName) {
			String name[] = fullName.split(" ");
			firstName = name[0];
		} else {
			System.out.println("Format is Wrong\nPlease Enter 'Abc Xyz' Format");
			System.exit(0);
		}

		// Taking Phone number and checking the conditions
		System.out.print("Enter Mobile Number: ");
		phoneNumber = u.inputString();

		boolean checkNumber = Pattern.matches("[789]{1}\\d{9}", phoneNumber);

		if (!checkNumber) {
			System.out.println("Number is incorrect");
			System.exit(0);
		}

		// calculating current date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());

		str = str.replace("<<name>>", firstName);
		str = str.replace("<<full name>>", fullName);
		str = str.replace("xxxxxxxxxx", phoneNumber);
		str = str.replace("01/01/2016", date);

		System.out.println(str);

	}
}
