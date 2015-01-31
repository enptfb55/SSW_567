package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import triangle.TypeOfTriangle;
import triangle.TypeOfTriangle.TriangleTypes;

public class TestTypeOfTriangle {

	@Test
	public void TestIsosceles()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(1, 1, 2);
		
		assertFalse( triangle.IsRight() );
		
		assertEquals( TriangleTypes.ISOSCELES, triangle.GetTypeOfTriangle() );
		
	}
	
	@Test
	public void TestRightAngle()
	{
		TypeOfTriangle triangle = new TypeOfTriangle(3, 4, 5);
		
		assertTrue( triangle.IsRight() );
		
	}
}
