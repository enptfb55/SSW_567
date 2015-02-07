package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import triangle.TypeOfTriangle;
import triangle.TypeOfTriangle.TriangleTypes;

public class TestTypeOfTriangle {

	@Test
	public void TestZeroValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 0);

	    assertEquals( TriangleTypes.NONE, triangle.GetTypeOfTriangle());
	}

	@Test
	public void TestNegativeValue()
	{
	    TypeOfTriangle triangle = new TypeOfTriangle(3, 4, -5);

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
}
