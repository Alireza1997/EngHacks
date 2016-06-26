import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureReader {
	
	int temperature;
	
	public void readTemperature(){
		try {//read temperature from .txt
			BufferedReader readFile = new BufferedReader (new FileReader("Temperature.txt"));
			
			//read temperature
			temperature = Integer.parseInt(readFile.readLine());
			
			readFile.close();
		}catch (IOException e){
			System.out.println("Error reading Temperature.txt");
		}
	}

}
