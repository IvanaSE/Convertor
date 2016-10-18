import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class ConvertorTest {
		Convertor convertor = new Convertor();
		Random random = new Random();
		
	@Test
	public void testConvertToRadians() {
		double degrees = random.nextDouble()*360;
		double radians = Math.toRadians(degrees);
		assertEquals(radians, convertor.convertToRadians(degrees),0.000001);	
	}
	
	@Test
	public void testConvertToDegrees() {
		double radians = random.nextDouble()*2*Math.PI;
		double degrees = Math.toDegrees(radians);
		assertEquals(degrees, convertor.convertToDegrees(radians),0.000001);	
	}
	

}
