import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestATM {
	
	@Test
	void testNegativeDeposit() throws Exception {
		ATM atm = new ATM(0, "USD");
		atm.deposit(-5);
		Assert.assertEquals(0, atm.checkBalance(), 0.01);
	}
	
	 @Test
	void testExchangeUSDToUSD() throws Exception {
		ATM atm = new ATM(100, "USD");
		atm.exchangeCurrency("USD");
		Assert.assertEquals(100, atm.checkBalance(), 0.01);
		Assert.assertEquals("USD", atm.checkCurrency());
	}
	/* Write your tests here */
	 
	 @Test
	 void testExchangeUSDToCAD() throws Exception {
		 ATM atm = new ATM(1000.43, "USD");
		 atm.exchangeCurrency("CAD");
		 Assert.assertEquals(1300.56, atm.checkBalance(), 0.001);
		 Assert.assertEquals("CAD", atm.checkCurrency());
		 
	 }
}
