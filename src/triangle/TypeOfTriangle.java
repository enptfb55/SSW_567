package triangle;


public class TypeOfTriangle {
	
	public enum TriangleTypes
	{
		NONE,
		SCALENE,
		ISOSCELES,
		EQUILATERAL
	}
	
	private double m_dSideA = 0;
	private double m_dSideB = 0;
	private double m_dSideC = 0;
	
	private boolean m_bIsRight = false;
	
	private TriangleTypes m_ttTriangleType = TriangleTypes.NONE;
	
	public TypeOfTriangle( double a, double b, double c )
	{
		m_dSideA = a;
		m_dSideB = b;
		m_dSideC = c;
		
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
		
		if( ( m_dSideA <= 0 ) || 
				 ( m_dSideB <= 0 ) ||	
				 ( m_dSideC <= 0 ) )
		{
			m_ttTriangleType = TriangleTypes.NONE;
			return;
		}
		else if (m_dSideA <= (m_dSideB + m_dSideC) )
		{
			m_ttTriangleType = TriangleTypes.NONE;
			return;
		}
		else if( (m_dSideA == m_dSideB) &&
			(m_dSideB == m_dSideC))
		{
			m_ttTriangleType = TriangleTypes.EQUILATERAL;
			return;
		}
		else if( ( m_dSideA == m_dSideB ) || 
				 ( m_dSideA == m_dSideC ) ||	
				 ( m_dSideB == m_dSideC ) )
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
		double a_sqrt = Math.pow( m_dSideA, 2 );
		double b_sqrt = Math.pow( m_dSideB, 2 );
		double c_sqrt = Math.pow( m_dSideC, 2 );
		
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
