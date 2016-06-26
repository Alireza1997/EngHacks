import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LightReader {
	
	Double lightIntensity;
	String str;
	
	public void readLight(){
		try {//read light intensity from .txt
			BufferedReader readFile = new BufferedReader (new FileReader("Light.txt"));
			
			//read light intensity
			while((str=readFile.readLine())!=null && str.length()!=0){
				lightIntensity = Double.parseDouble(str);
			}
			
			readFile.close();
		}catch (IOException e){
			System.out.println("Error reading Light.txt");
		}
	}

}
