package test.Java;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\MeghaSikarwar\\eclipse-workspace\\FST-MS-Java\\Activity14.txt");
		System.out.println(file.createNewFile());
		File fileUtil = FileUtils.getFile("C:\\Users\\MeghaSikarwar\\eclipse-workspace\\FST-MS-Java\\Activity14.txt");
		System.out.println("Reading data from file 1 :" + FileUtils.readFileToString(fileUtil,"UTF8"));
		String text = FileUtils.readFileToString(file,"UTF8");
        System.out.println("Reading data from file 2 :" + text);
		 
		File destinationDir = new File("\\FST-MS-Java\\src\\main\\java\\test.resources");
		FileUtils.copyFileToDirectory(file,destinationDir);
		System.out.println("File moved successfully");
		
		File newFile = FileUtils.getFile(destinationDir, "Activity14.txt");
		
		String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		System.out.println("Reading data from file 3 :" + newFileData);
		 
	}

}
