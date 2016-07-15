package com.rometools.fetcher.samples;

import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.util.IteratorIterable;

public class JdomTest {

	private static String xmlSource = "https://www.youtube.com/feeds/videos.xml?channel_id=UC78PMQprrZTbU0IlMDsYZPw";

	public static void main(String[] args) throws JDOMException, IOException {

		System.setProperty("http.proxyHost", "168.219.61.252");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("https.proxyHost", "168.219.61.252");
		System.setProperty("https.proxyPort", "8080");

		// the SAXBuilder is the easiest way to create the JDOM2 objects.
		SAXBuilder jdomBuilder = new SAXBuilder();

		// jdomDocument is the JDOM2 Object
		Document jdomDocument = jdomBuilder.build(xmlSource);

		// The root element is the root of the document. we print its name
		System.out.println("name : "+jdomDocument.getRootElement().getName()); // prints
		// "rss"
		System.out.println("--------------------------------------------------------");
		Element rss = jdomDocument.getRootElement();
		System.out.println("***");
		
		
		rss = rss.getChild("entry", Namespace.getNamespace("http://www.w3.org/2005/Atom"));
		rss = rss.getChild("group", Namespace.getNamespace("media","http://search.yahoo.com/mrss/"));
		rss = rss.getChild("thumbnail", Namespace.getNamespace("media","http://search.yahoo.com/mrss/"));
		

		String img = rss.getAttribute("url").getValue();
		System.out.println("image : "+img);
		
		//		System.out.println();
		System.out.println("***");
//		printElement(rss,"");
		System.out.println("!!!!!!!!!!!!!");
	}
	
	private static void printElement(Element element, String prefix){
		
		if(element == null || prefix == null){
			return;
		}
		
		System.out.println(prefix+element.getName() + " => "+element.getNamespace());
		for(Attribute att : element.getAttributes()){
			System.out.println(prefix+"-attr : "+att.getName()+" -> "+att.getValue());
		}
		
		for(Element e : element.getChildren()){
			if(e.getChildren() != null){
				printElement(e, prefix+"	");
			}
		}
	}



}
