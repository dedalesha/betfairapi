package alexei.betfairapi.generators;

import java.io.InputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

public class GenerateEnums {
	
	private static final String DEFAULT_PACKAGE_OF_GENERATED_CLASSES = "alexei.betfairapi.entities";
	private static final String DEFAULT_GENERATED_CLASSES_LOCATION = "target/generated-classes/betfair-api/enums";
	
	public static void main(String[] args) throws Exception {
		
		InputStream xsl = GenerateEnums.class.getResourceAsStream("generate-enums.xsl");
		InputStream xml = GenerateEnums.class.getResourceAsStream("SportsAPING.xml");
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(xsl));
		Source source = new StreamSource(xml);
		
		XslGenerator generator = new XslGenerator(transformer, source, DEFAULT_GENERATED_CLASSES_LOCATION, DEFAULT_PACKAGE_OF_GENERATED_CLASSES);
		generator.generate();
		
		System.out.println("Generated Betfair API enumerations in "+DEFAULT_GENERATED_CLASSES_LOCATION);
		
	}
	
}
