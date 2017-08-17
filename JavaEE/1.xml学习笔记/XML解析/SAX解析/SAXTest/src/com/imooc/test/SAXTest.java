
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.imooc.handler.SAXParserHandler;

public class SAXTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SAXParserHandler handler = new SAXParserHandler();
		
		parser.parse("books.xml", handler);
	}

}
