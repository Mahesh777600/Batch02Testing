package Log4jProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Demo {

	static Logger log = Logger.getLogger(Demo.class.getName());

	public static void main(String[] args) throws IOException {

		// Layout ly=new XMLLayout();
//		
//		Appender ap=new FileAppender(ly, "D:\\Mahesh\\AdvanceSeleniumMavenProject\\src\\test\\resources\\Log4jInformation.txt");
//		//Appender ap=new ConsoleAppender(ly);
//		
//		log.addAppender(ap);

		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("error");
		log.fatal("Fatal");

		System.out.println("Success");
	}
}
