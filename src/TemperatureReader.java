import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureReader {
	
	Double temperature;
	String str;
	
	public void readTemperature(){
		try {//read temperature from .txt
			BufferedReader readFile = new BufferedReader (new FileReader("Temperature.txt"));
			
			//read temperature
			while((str=readFile.readLine())!=null && str.length()!=0){
				temperature = Double.parseDouble(str);
			}
			
			readFile.close();
		}catch (IOException e){
			System.out.println("Error reading Temperature.txt");
		}
	}

}
