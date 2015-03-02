package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import triangle.TypeOfTriangle;
import triangle.TypeOfTriangle.TriangleTypes;

public class TestTypeOfTriangle {

	@Test //Assignment 2 Test
	public void TestSideEquals0()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 0);

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	    
	    assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}

	@Test //Assignment 2 Test
	public void TestNegativeValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, -5);

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	    
	    assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
	
	@Test //Assignment 2 Test
	public void TestNoValue()
	{
		// this will not compile
		// TypeOfTriangle triangle = new TypeOfTriangle(3, 4, );
		
		// assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}
	
	@Test //Assignment 2 Test
	public void TestLargeValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, ( 2147483647 + 1 ) );

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	    
	    assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
	
	@Test
	public void TestIsosceles()
	{
		TypeOfTriangle triangle = new TypeOfTriangle( 4.7, 4.7, 4 );
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.ISOSCELES, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Isosceles", triangle.GetTypeOfTriangleAsString() );
		
	}
	
	@Test
	public void TestRightIsosceles()
	{
		TypeOfTriangle triangle = new TypeOfTriangle( 5.656, 4, 4 );
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.ISOSCELES, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Isosceles", triangle.GetTypeOfTriangleAsString() );
	}

	@Test
	public void TestEquilateral()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(4, 4, 4);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.EQUILATERAL, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Equilateral", triangle.GetTypeOfTriangleAsString() );
		
	}
	
	@Test
	public void TestScalene()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 4.5);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Scalene", triangle.GetTypeOfTriangleAsString() );
		
	}

	@Test
	public void TestRightScalene()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Scalene", triangle.GetTypeOfTriangleAsString() );
		
	}
	
	@Test
	public void TestRightAngle()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
	}
	
	//Group 1 Tests
	
	@Test
	public void Test1()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(5, 6, 6);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.ISOSCELES, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Isosceles", triangle.GetTypeOfTriangleAsString() );
		
	}
	
	@Test
	public void Test2()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Scalene", triangle.GetTypeOfTriangleAsString() );
		
	}
	
	@Test
	public void Test3()
	{
		// technically this is valid 
		// http://www.asciitable.com/
		// 'A' has an integer value of 65
		TypeOfTriangle triangle = new TypeOfTriangle(5, 6, 'A');

		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
		
		assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
	
	@Test
	public void Test4()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(1, 2, 3);
		
		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
		
		assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
	
	//Team 5 Tests
	
	@Test
	public void TestHES1()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(0, 1, 1);
		
		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
		
		assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
	
	@Test
	public void TestHES2() //Same as Group2
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
		assertEquals( "Scalene", triangle.GetTypeOfTriangleAsString() );
	}
	
	@Test
	public void TestHES3()
	{
		// again technically this is valid 
		// http://www.asciitable.com/
		// 'a' has an integer value of 97
		// '$' has an integer value of 36
		TypeOfTriangle triangle = new TypeOfTriangle('a', 4, '$');
		
		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
		
		assertEquals( "None", triangle.GetTypeOfTriangleAsString() );
	}
}
