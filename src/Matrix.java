import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

	int arr[][] = new int[5][5];
	
	public void makeMatrix(){
		for(int i=0; i<arr.length; i++){
			System.out.println();
			for(int j=0; j<arr.length; j++){
				int numb = ThreadLocalRandom.current().nextInt(0, 10 + 1);
				if(numb>8){numb=0;}
				arr[i][j]= numb;
				arr[j][i]= numb;
			}
		}
	}
	
	public void Print(){
		for(int i=0; i<arr.length; i++){
			System.out.println();
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[i][j]+"\t");
				}
			}
	}
	
}
