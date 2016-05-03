
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaR {
	
	public static String connectToR(String input) throws IOException{
		Process process = null;

		try {
			process = new ProcessBuilder("D:\\BigData_Program\\R-3.2.5\\bin\\Rscript.exe","D:\\BigData_Document\\Java_Doc\\Dramaker\\DramakerNEWR8\\Rscript\\MyScript.R",input).start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		System.out.println(result);
		return result;
	} 
	public static String getRecommendation(String input) throws IOException{
		Process process = null;

		try {
			process = new ProcessBuilder("D:\\BigData_Program\\R-3.2.5\\bin\\Rscript.exe","D:\\BigData_Document\\Java_Doc\\Dramaker\\DramakerNEWR8\\Rscript\\MyMovie.R",input).start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String recommended = br.readLine();
		System.out.println(recommended);
		return recommended;
	} 
}