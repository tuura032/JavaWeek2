package week2;

public class Application {

	public static void main(String[] args) {
		// create boolean variables and choose what values are held
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		boolean likesSwimming = false;
		boolean awesomeDecWeather = true;
		
		//create non-boolean variables
		double costOfMilk = 2.99;
		double moneyInWallet = 45.26;
		int thirstLevel = 4;

		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = likesSwimming && !isWeekday;
		boolean isAGoodDay = awesomeDecWeather && !isWeekday && hasMoneyInPocket;
		boolean willBuyMilk = awesomeDecWeather && (thirstLevel > 3) && (moneyInWallet >= (costOfMilk*2));
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
		
	}

}
