package main;

import java.util.Scanner;

import triangle.TypeOfTriangle;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ( "Enter first side of your triangle:" );
		
		String sSideA = scan.next();
		
		System.out.println ( "Enter second side of your triangle:" );
		
		String sSideB = scan.next();
		
		System.out.println ( "Enter third side of your triangle:" );
		
		String sSideC = scan.next();
		
		int iSideA = Integer.parseInt( sSideA );
		int iSideB = Integer.parseInt( sSideB );
		int iSideC = Integer.parseInt( sSideC );
		
		TypeOfTriangle triangle = new TypeOfTriangle( iSideA, iSideB, iSideC );
		
		System.out.println( "Your triangle is " + 
							( triangle.IsRight() ? "" : "not" ) + 
							"a right angle triangle and is " + 
							triangle.GetTypeOfTriangleAsString() );	
		
		
	}

}
