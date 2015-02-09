package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import triangle.TypeOfTriangle;



public class Main {
	
	final static Scanner m_scanner = new Scanner(System.in);
	final static Pattern m_pattern = Pattern.compile("^[0-9.]+$");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sSideA = GetPrompt( "Enter first side of your triangle:" );
		
		String sSideB = GetPrompt( "Enter second side of your triangle:" );
		
		String sSideC = GetPrompt( "Enter third side of your triangle:" );
		
		double dSideA = Double.parseDouble( sSideA );
		double dSideB = Double.parseDouble( sSideB );
		double dSideC = Double.parseDouble( sSideC );
		
		TypeOfTriangle triangle = new TypeOfTriangle( dSideA, dSideB, dSideC );
		
		System.out.println( "Your triangle is " + 
							( triangle.IsRight() ? "" : "not " ) + 
							"a right angle triangle and is " + 
							triangle.GetTypeOfTriangleAsString() );	
		
		
	}

	
	private static String GetPrompt( String prompt )
	{
		String response = "";
		
		while( true )
		{
			System.out.println ( prompt );
			
			response = m_scanner.next();
			
			Matcher match = m_pattern.matcher( response );
			
			if ( match.find() )
			{
				break;
			}
			
			System.out.println( response + " is not a valid response. Please try again.");
		}
		
		return response;
	}
}
