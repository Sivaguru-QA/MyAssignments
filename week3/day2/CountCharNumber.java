package week3.day2;

public class CountCharNumber {

	public static void main(String[] args) {
		
		String name ="Sivagurunathan";
		int count=0;
		
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)=='a') {
				
				count++;
			}
			
		}
		System.out.println("Num of 'a' occurences:"+count);
				
	}

}
