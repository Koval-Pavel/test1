package org.example;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

import static org.example.Group.allStudents;

public class XMLHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("student")) {
            String firstName = attributes.getValue("firstname");
            String lastName = attributes.getValue("lastname");
            String groupNumber = attributes.getValue("groupnumber");
            allStudents.add(new Student(firstName, lastName, groupNumber));
        }
        if (qName.equals("subject")) {
            String title = attributes.getValue("title");
            int mark = Integer.getInteger(attributes.getValue("mark"));
        }



    }


}

