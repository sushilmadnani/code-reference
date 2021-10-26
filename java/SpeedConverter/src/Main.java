public class Main {
	
	public static void main(String[] args) {
		double milesPerHour = SpeedConverter.toMilesPerHour(50);
		System.out.println(milesPerHour);
		
		SpeedConverter.printConversion(60);
	}
}
