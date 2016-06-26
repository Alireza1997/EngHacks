import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SensorReader {
	
	double temperature;
	double light;
	boolean temp = true;
	
	String str;
	
	public void readTemperature(){
		try {//read temperature from .txt
			BufferedReader readFile = new BufferedReader (new FileReader("Temperature.txt"));
			
			//read temperature
			while((str=readFile.readLine())!=null && str.length()!=0){
				if (temp) {
					temperature = Double.parseDouble(str);
				}
				else {
					light = Double.parseDouble(str);
				}
				temp = !temp;
			}
			
			readFile.close();
		}catch (IOException e){
			System.out.println("Error reading Temperature.txt");
		}
	}

}
