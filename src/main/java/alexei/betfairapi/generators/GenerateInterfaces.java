package alexei.betfairapi.generators;

import java.io.InputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

public class GenerateInterfaces {
	
	private static final String DEFAULT_PACKAGE_OF_GENERATED_CLASSES = "alexei.betfairapi.entities";
	private static final String DEFAULT_GENERATED_CLASSES_LOCATION = "target/generated-sources/betfair-api/interfaces";
	
	public static void main(String[] args) throws Exception {
		
		InputStream xsl = GenerateInterfaces.class.getResourceAsStream("generate-interfaces.xsl");
		InputStream xml = GenerateInterfaces.class.getResourceAsStream("SportsAPING.xml");
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(xsl));
		Source source = new StreamSource(xml);
		
		XslGenerator generator = new XslGenerator(transformer, source, DEFAULT_GENERATED_CLASSES_LOCATION, DEFAULT_PACKAGE_OF_GENERATED_CLASSES);
		generator.generate();
		
		System.out.println("Generated Betfair API interfaces in "+DEFAULT_GENERATED_CLASSES_LOCATION);
		
	}
	
}
