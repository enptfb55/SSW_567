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
	
	public String GetTypeOfTriangleAsString()
	{
		switch( GetTypeOfTriangle() )
		{
			case EQUILATERAL:
				return "Equilateral";
				
			case SCALENE:
				return "Scalene";
				
			case ISOSCELES:
				return "Isosceles";
				
			default:
				return "None";
		}
	}
	
	private void CalculateTriangleType()
	{
		
		if( (m_iSideA == m_iSideB) &&
			(m_iSideB == m_iSideC))
		{
			m_ttTriangleType = TriangleTypes.EQUILATERAL;
			return;
		}
		else if( ( m_iSideA == m_iSideB ) || 
				 ( m_iSideA == m_iSideC ) ||	
				 ( m_iSideB == m_iSideC ) )
		{
			m_ttTriangleType = TriangleTypes.ISOSCELES;
			return;
		}
		else
		{
			m_ttTriangleType = TriangleTypes.SCALENE;
		}
		
	}
	
	private void CalculateRightAngle()
	{
		double a_sqrt = Math.pow( m_iSideA, 2 );
		double b_sqrt = Math.pow( m_iSideB, 2 );
		double c_sqrt = Math.pow( m_iSideC, 2 );
		
		if( c_sqrt == ( a_sqrt + b_sqrt ) )
		{
			m_bIsRight = true;
		}
		else 
		{
			m_bIsRight =  false;
		}
	}
}
