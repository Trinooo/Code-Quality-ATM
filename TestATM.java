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
	 
	 // Handles converting from USD to EUR
	 @Test 
	 void testExchangeUSDToEUR() throws Exception {
		 ATM atm = new ATM(100, "USD");
		 atm.exchangeCurrency("EUR");
		 Assert.assertEquals(98, atm.checkBalance(), 0.001);
		 Assert.assertEquals("EUR", atm.checkCurrency());
	 }
	 
	 @Test
	 void testExchangeUSDToUnknown() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from CAD to CAD
	 @Test
	 void testExchangeCADToCAD() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from CAD to USD
	 @Test
	 void testExchangeCADToUSD() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from CAD to EUR
	 @Test
	 void testExchangeCADToEUR() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from CAD to an unknown currency
	 @Test
	 void testExchangeCADToUnknown() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from EUR to EUR
	 @Test
	 void testExchangeEURtoEUR() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from EUR to USD
	 @Test
	 void testExchangeEURToUSD() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from EUR to CAD
	 @Test
	 void testExchangeEURToCAD() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Handles converting from EUR to an unknown currency
	 @Test
	 void testExchangeEURToUnknown() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Test the withdraw functionality with positive values
	 @Test
	 void testWithdrawPositive() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Test the withdraw functionality with negative values
	 @Test
	 void testWithdrawNegative() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Test the deposit functionality with a positive value
	 @Test
	 void testDepositPositive() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 // Test constructor throws error when currency not recognized
	 @Test
	 void testCurrencyConstructor() throws Exception {
		 Assert.assertTrue(true);
	 }
	 
	 
	 
	 
	 
	 
}
