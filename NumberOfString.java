import java.util.Scanner;

public class NumberOfString {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(findCount(n, 1, 2));
	}
	static int findCount(int count, int bStringOccurance, int cStringOccurance){
		if(bStringOccurance < 0 || cStringOccurance < 0) return 0;
		if ( count == 0 ) return 1;
		if(bStringOccurance == 0 && cStringOccurance == 0) return 1;
		int output = findCount(count -1, bStringOccurance, cStringOccurance);
		output += findCount(count - 1, bStringOccurance - 1, cStringOccurance);
		output += findCount(count - 1, bStringOccurance , cStringOccurance - 1);
		return output;
	}

}
