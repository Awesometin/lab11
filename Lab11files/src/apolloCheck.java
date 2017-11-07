import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class apolloCheck {

	public static void main (String[] args) throws IOException
	{
		Path p1 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_1of10.txt");
		Path p2 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_2of10.txt");
		Path p3 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_3of10.txt");
		Path p4 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_4of10.txt");
		Path p5 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_5of10.txt");
		Path p6 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_6of10.txt");
		Path p7 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_7of10.txt");
		Path p8 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_8of10.txt");
		Path p9 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_9of10.txt");
		Path p10 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_10of10.txt");
		Path pm = Paths.get("C:\\Backup");
		
		
		Path del = Paths.get("C:\\Backup\\SPEED\\idontknowwhyiamhere");
		Path del2 = Paths.get("C:\\Backup\\SPEED\\speeding");
		
		
	if (Files.isReadable(p1)&Files.isExecutable(p1)&Files.isRegularFile(p1))
	
		System.out.println("Works.");
		else
			System.out.println("Invalid file path.");
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:s*.txt*");
		
		Path filename = p1.getFileName();
		if (matcher.matches(filename))
			System.out.println(filename);
		else
			System.out.println("There is no match.");
		
		Files.deleteIfExists(del);
		Files.deleteIfExists(del2);
		
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
	System.out.println(p6);
	System.out.println(p7);
	System.out.println(p8);
	System.out.println(p9);
	System.out.println(p10);
	
	
	
	
	}
}
