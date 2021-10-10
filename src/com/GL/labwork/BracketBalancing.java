package com.GL.labwork;
import java.util.Scanner;
import java.util.Stack;

public class BracketBalancing {
	public static boolean checkBalance(String br) {
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<br.length(); i++) {
			char chr = br.charAt(i);
			if (chr =='(' || chr=='{' || chr =='[') {
				stack.push(chr);
			}
			else
			{
				if(stack.empty())
					return false;
				else
				{
					char charpop;
					switch(chr) {
					case '}':
						charpop = stack.pop();
						if(charpop=='['|| charpop=='(')
							return false;
						break;
					case ']':
						charpop = stack.pop();
						if(charpop=='('||charpop == '{')
							return false;
						break;
					case ')':
						charpop = stack.pop();
						if(charpop=='{' || charpop == '[')
							return false;
						break;	
					}
				}
			}
			
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bracket string to check if it is balanced ");
		String bracket = sc.next();
		Boolean result = checkBalance(bracket);
		if (result)
			System.out.println("The string has balanced brackets");
		else
			System.out.println("The string has unbalanced brackets");
		sc.close();
	}

}
