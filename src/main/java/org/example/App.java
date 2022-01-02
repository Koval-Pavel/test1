package org.example;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

import static org.example.Group.allStudents;

public class App 
{
    public static void main( String[] args ) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("src/main/resources/group.xml"), handler);

        System.out.println(allStudents.get(0).getFirstName());
        System.out.println("-----------------");
        System.out.println("-----------------");
    }
}
