package edu.jspiders.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Intial Value");
		int intialVal = sc.nextInt();
		int res = 0;
		System.out.println("Enter Operation sequence");
		String input = sc.next();

		HashMap<Character, Integer> inputValues = new HashMap<Character, Integer>();

		for(int i = 0; i < input.length(); i++)
		{
			inputValues.put(input.charAt(i), 1);
		}

		Set<Character> keys = inputValues.keySet();
		Iterator<Character> itr = keys.iterator();
		while (itr.hasNext()) 
		{
			Character character = (Character) itr.next();
			System.out.println("Enetr the value of "+(char)(character+32));
			inputValues.put(character, sc.nextInt());
		}
		System.out.println(inputValues);

		res= intialVal;
		for(int i = 0; i < input.length(); i++)
		{
			char ch = (char) (input.charAt(i)+32);
			if(ch == 'a')
			{
				res = res + inputValues.get(input.charAt(i));
			}
			else if(ch == 's')
			{
				res -= inputValues.get(input.charAt(i));
			}
			else if(ch == 'm')
			{
				res *= inputValues.get(input.charAt(i));
			}
			else if(ch == 'd')
			{
				res /= inputValues.get(input.charAt(i));
			}
		}
		System.out.println(res);
	}

}
