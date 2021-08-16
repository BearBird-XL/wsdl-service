package xyz.xionglei.wsdl.main;

import xyz.xionglei.wsdl.pojo.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class JaxbText {

    public static void myMarshaller() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(new Book(29L, "IU", 99.99), System.out);

    }

    public static void unMyMarshaller() throws JAXBException {
        String xmlString = "<book>\n" +
                "    <bookName>IU</bookName>\n" +
                "    <id>29</id>\n" +
                "    <price>99.99</price>\n" +
                "</book>";
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Book book = (Book) unmarshaller.unmarshal(new StringReader(xmlString));
        System.out.println(book);
    }

    public static void main(String[] args) throws JAXBException {
        myMarshaller();
        unMyMarshaller();
    }
}
