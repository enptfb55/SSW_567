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
	}

	@Test //Assignment 2 Test
	public void TestNegativeValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, -5);

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}
	
	@Test //Assignment 2 Test
	public void TestNoValue()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4);
		//Code Needed
	}
	
	@Test //Assignment 2 Test
	public void TestLargeValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 2147483647);

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}
	
	@Test
	public void TestIsosceles()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(1, 1, 2);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.ISOSCELES, triangle.GetTypeOfTriangle() );
		
	}

	@Test
	public void TestEquilateral()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(4, 4, 4);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.EQUILATERAL, triangle.GetTypeOfTriangle() );
		
	}

	@Test
	public void TestScalene()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
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
		
	}
	
	@Test
	public void Test2()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
		
	}
	
	@Test
	public void Test3()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(5, 6, A);
		//Code Needed
	}
	
	@Test
	public void Test4()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(1, 2, 3);
		
		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}
	
	//Team 5 Tests
	
	@Test
	public void TestHES1()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(0, 1, 1);
		
		assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}
	
	@Test
	public void TestHES2() //Same as Group2
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
		assertEquals( TriangleTypes.SCALENE, triangle.GetTypeOfTriangle() );
	}
	
	@Test
	public void TestHES3()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(a, 4, $);
		
		//Code Needed
	}
}
