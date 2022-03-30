package by.gbyzzz.task07webxmlparsing.dao;

public class DAOFactory {
private static final DAOFactory factory = new DAOFactory();
public static DAOFactory getInstance(){
    return factory;
}
private XMLParser domParser = new DOMParser();
private XMLParser saxParser = new SAXMLParser();
private XMLParser staxParser = new StAXParser();

    public XMLParser getDOMParser() {
        return domParser;
    }
    public XMLParser getSaxParser() {
        return saxParser;
    }
    public XMLParser getStaxParser() {
        return staxParser;
    }
}
