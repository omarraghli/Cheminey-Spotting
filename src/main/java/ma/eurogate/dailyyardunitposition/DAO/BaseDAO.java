/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.eurogate.dailyyardunitposition.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import ma.eurogate.dailyyardunitposition.XML.XMLReader;
import org.xml.sax.SAXException;

/**
 *
 * @author Omar
 * Email:omar.raghli@gmail.com
 */
public abstract class  BaseDAO{
    private final XMLReader XMLr;
    private final  HashMap <String,String> ServerCood;
    protected Connection cnx;
    protected Statement statement;
    protected PreparedStatement preparedStatement;
    protected String username;
    protected String password;
    private final String url;
    protected ResultSet resultSet ;
    

    public BaseDAO() throws SQLException, ParserConfigurationException, SAXException, IOException {
        this.XMLr=new XMLReader();
        this.ServerCood= XMLr.GetXmlTextElements();
        this.url=ServerCood.get("url");
        this.username=ServerCood.get("username");
        this.password=ServerCood.get("password");
        this.cnx = DriverManager.getConnection(url,username,password);
    }
	    
}
