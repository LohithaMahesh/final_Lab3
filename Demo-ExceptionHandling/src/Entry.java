import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Entry {

	
	public static void main(String[] args) {
		
/*		int ans;
		
		int a = 89, b =0;
		
		ans = 0;
		
		if(b != 0)
			ans = a/b;
		
		System.out.println("Answer: "+ ans);
*/		

		FileInputStream fIn;
		
		String fileName = "test.txt";
		
		try{
			fIn = new FileInputStream(fileName);
			
			while(true){
				int b = fIn.read();
				if(b == -1)
					break;
				
				System.out.print((char)b);
			}
		}catch(FileNotFoundException e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("end of main()....");
		
		
		
		
		
		
	}
	
	
	
}
