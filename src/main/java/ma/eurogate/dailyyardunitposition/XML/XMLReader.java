/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.eurogate.dailyyardunitposition.XML;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Omar
 * Email:omar.raghli@gmail.com
 */
public class XMLReader {
    private static final String FILEPATH = "C:\\cood_serv.xml";
    private final DocumentBuilderFactory dbf;
    private final DocumentBuilder db;
    private final Document doc;
    private final NodeList list;
    private Node node;
    private Element element;

    public XMLReader() throws ParserConfigurationException, SAXException, IOException {
        this.dbf = DocumentBuilderFactory.newInstance();
        this.dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        this.db = dbf.newDocumentBuilder();
        this.doc = db.parse(new File(FILEPATH));
        this.doc.getDocumentElement().normalize();
        this.list =  (NodeList) doc.getElementsByTagName("coodserv");
    }
    public HashMap GetXmlTextElements(){
        HashMap <String, String> CoodServ = new HashMap <>();
              this.node = list.item(0);
              if (node.getNodeType() == Node.ELEMENT_NODE) {
                  this.element = (Element) node;
                  String url = element.getElementsByTagName("url").item(0).getTextContent();
                  String username = element.getElementsByTagName("username").item(0).getTextContent();
                  String password = element.getElementsByTagName("password").item(0).getTextContent();
                  CoodServ.put("url", url);
                  CoodServ.put("username", username);
                  CoodServ.put("password", password);
              }
          
        return CoodServ;
    }
    
    
    
}
