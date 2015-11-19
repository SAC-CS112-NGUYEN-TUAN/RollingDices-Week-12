public class Dice {
		
	private double avg = 0.0;
	
	public double Throw(int dices) {
		double randomnum;
		
		for ( int i = 0; i < dices;i++){
			
			avg += 1 + (int) (Math.random()*6);
		}
		randomnum = avg;
		return randomnum;
	}
	
	public int Throw(int dices, int bounces){
		
		int randomnum = 0;
		for ( int e = 0; e < dices;e++){
		
			for ( int i = 0; i < bounces;i++){
			randomnum += 1 + (int) (Math.random()*6);
			}
		}
		return randomnum;
	}
}