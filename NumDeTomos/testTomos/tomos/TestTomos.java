package tomos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTomos {

	String [] string = {"MONOS", "LEONES", "CEBRAS", "GATOS"};
	Tomo t1 = new Tomo();
	
	@Test
	void numeraBienLosTomos(){
		
		Assert.assertEquals("MONOS-01", t1.numeracionDeTomos(1, string));
		Assert.assertEquals("MONOS-47", t1.numeracionDeTomos(47, string));
		Assert.assertEquals("MONOS-99", t1.numeracionDeTomos(99, string));
		Assert.assertEquals("LEONES-01", t1.numeracionDeTomos(100, string));
		Assert.assertEquals("LEONES-33", t1.numeracionDeTomos(132, string));
		Assert.assertEquals("LEONES-99", t1.numeracionDeTomos(198, string));
		Assert.assertEquals("CEBRAS-01", t1.numeracionDeTomos(199, string));
		Assert.assertEquals("CEBRAS-56", t1.numeracionDeTomos(254, string));
		Assert.assertEquals("CEBRAS-99", t1.numeracionDeTomos(297, string));
		Assert.assertEquals("GATOS-01", t1.numeracionDeTomos(298, string));
		Assert.assertEquals("GATOS-14", t1.numeracionDeTomos(311, string));
		Assert.assertEquals("GATOS-99", t1.numeracionDeTomos(396, string));
		
	}
	
	@Test 
	void calculaBienInteger() {
		
		Assert.assertEquals(1,  132/99);
	}
	
}
