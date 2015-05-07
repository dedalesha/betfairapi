package alexei.betfairapi.generators;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;

public class Generator {

	private Transformer transformer;
	private Source source;

	public Generator(Transformer transformer, Source source, String outputFolder, String packageName)  {
		transformer.setParameter("outputFolder", outputFolder);
		transformer.setParameter("packageName", packageName);
		this.transformer = transformer;
		this.source = source;
	}

	public void generate() throws TransformerException  {
		transformer.transform(source, new StreamResult(System.out));
	}

}
