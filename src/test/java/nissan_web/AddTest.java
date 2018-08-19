package nissan_web;

//import org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTest {

	
	private add a;
	@Before
	public void setup() {
		a = new add() ;
	}
	

	@Test
	public void intreturnint() {
		Assert.assertEquals("13", a.addn("6","7")) ;
	}
	
	
	@Test
	public void floatreturnfloat() {
		Assert.assertEquals( "16.9", a.addn("8.5","8.4") ) ;
	}
	
	@Test
	public void intandfloatreturnfloat() {
		Assert.assertEquals( "26.4089", a.addn("8","18.4089") ) ;
	}
	
	
	
	@Test
	public void illegalvalue() {
		Assert.assertEquals( "Invalid Input", a.addn("--","65.4089") ) ;
	}
	
	@Test
	public void emptynotallowed() {
		Assert.assertEquals( "Invalid Input", a.addn(" ","9") ) ;
	}
	
	@Test
	public void nullnotallowed() {
		Assert.assertEquals( "Invalid Input", a.addn("","") ) ;
	}
	
	


}
