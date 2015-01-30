package triangle;


public class TypeOfTriangle {
	
	public enum TriangleTypes
	{
		NONE,
		SCALENE,
		ISOSCELES,
		EQUILATERAL
	}
	
	private int m_iSideA = 0;
	private int m_iSideB = 0;
	private int m_iSideC = 0;
	
	private boolean m_bIsRight = false;
	
	private TriangleTypes m_ttTriangleType = TriangleTypes.NONE;
	
	public TypeOfTriangle( int a, int b, int c )
	{
		m_iSideA = a;
		m_iSideB = b;
		m_iSideC = c;
		
		CalculateTriangleType();
		CalculateRightAngle();
	}
	
	public boolean IsRight()
	{
		return m_bIsRight;
	}
	
	public TriangleTypes GetTypeOfTriangle()
	{
		return m_ttTriangleType;
	}
	
	private void CalculateTriangleType()
	{
		
		if( ( m_iSideA == m_iSideB ) || 
			( m_iSideA == m_iSideC ) ||	
			( m_iSideB == m_iSideC ) )
		{
			m_ttTriangleType = TriangleTypes.ISOSCELES;
			return;
		}
		else
		{
			
		}
		
	}
	
	private void CalculateRightAngle()
	{
		double a_sqrt = Math.sqrt( m_iSideA );
		double b_sqrt = Math.sqrt( m_iSideB );
		double c_sqrt = Math.sqrt( m_iSideC );
		
		if( c_sqrt == ( a_sqrt + b_sqrt ) )
		{
			m_bIsRight = true;
		}
		
		m_bIsRight =  false;
	}
}