package numbers;
import java.util.Random;

public class SmallestRandomNumber {

	public static void main(String[] args) {
		SmallestRandomNumber srn=new SmallestRandomNumber();
		int[] randArray=srn.generateRandomNumbers(500);
		int smallestNum=srn.getSmallestNumber(randArray);
		System.out.print("SMALLEST RANDOM NUMBER IN THIS ARRAY IS : "+smallestNum);
	}
	
	//Generate Random numbers of length n
	private int[] generateRandomNumbers(int number)
	{
		int[] randArray = new int[number];
		Random rand = new Random();
		for(int x=0;x<number;x++)
		{
		randArray[x]=rand.nextInt(10000);
		}
		return randArray;
	}
	
	//Sort Array
	private int getSmallestNumber(int[] randArray)
	{
		int temp; 
		int arrlength=randArray.length;
		for (int i = 0; i < arrlength; i++)   
        {  
            for (int j = i + 1; j < arrlength; j++)   
            {  
                if (randArray[i] > randArray[j])   
                {  
                    temp = randArray[i];  
                    randArray[i] = randArray[j];  
                    randArray[j] = temp;  
                }  
            }  
        }  
       return randArray[0];
	}
	
	

}
