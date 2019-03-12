import java.io.*;
public class gagaga {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Yura\\Desktop\\ya-ya-ya");
		try{
			dir.mkdir();
			int i = 0;
			boolean check = true;
			while (i < 30000) {
				i++;
				File file1 = new File("C:\\Users\\Yura\\Desktop\\ya-ya-ya", i+".docx");
				file1.createNewFile();
				DataOutputStream ste = new DataOutputStream(new FileOutputStream("C:\\Users\\Yura\\Desktop\\ya-ya-ya\\"+i+".docx"));
				ste.writeUTF("");
		}}
		catch (Exception r) {
			
		}
		
	}

}
