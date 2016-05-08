public class TruncateNumbers {
		
	private double formattedNumber;
	
	public TruncateNumbers(double x) {
		formattedNumber = x;
		formattedNumber *= 100;
		formattedNumber = Math.floor(formattedNumber);
		formattedNumber /= 100;
		
		System.out.println(formattedNumber);
		}
	

	
	public static void main(String[] args) {
		
		TruncateNumbers demo = new TruncateNumbers(100.239);
				
		}
	
	}
