/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.eurogate.dailyyardunitposition.DAO;
import java.io.IOException;
import ma.eurogate.dailyyardunitposition.Entities.YardPositions;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import ma.eurogate.dailyyardunitposition.Exceptions.NoLogIdsChemineesFoundException;
import org.xml.sax.SAXException;

/**
 *
 * @author Omar
 * Email:omar.raghli@gmail.com
 */
public class DailyYardUnitPositionDAO extends BaseDAO{

    public DailyYardUnitPositionDAO() throws SQLException, ParserConfigurationException, SAXException, IOException {
        super();
    }
    
    public ArrayList getCheminees(String RequiredDateTime)throws SQLException, NoLogIdsChemineesFoundException{
        ArrayList Cheminees = new ArrayList() ;
            String re = "SELECT l.* FROM DailyYardUnitPosition l INNER JOIN ( SELECT hdhand, MAX(ShiftDate) AS maxDate FROM DailyYardUnitPosition where ShiftDate BETWEEN '"+RequiredDateTime.substring(0,8)+" 00:00:00' AND '"+RequiredDateTime+"' AND tier >=3 GROUP BY hdhand ) groupel ON l.hdhand = groupel.hdhand AND l.ShiftDate = groupel.maxDate " ;
            this.statement = this.cnx.createStatement();
            this.resultSet = this.statement.executeQuery(re);
            if(!this.resultSet.next()){
            throw new NoLogIdsChemineesFoundException("Pas de cheminé trouvé");
            }
            else{
                do {
                Cheminees.add(new YardPositions(
                    this.resultSet.getFloat(1),
                    this.resultSet.getTimestamp(2).toLocalDateTime(),
                    this.resultSet.getFloat(3),
                    this.resultSet.getTimestamp(4).toLocalDateTime(),
                    this.resultSet.getFloat(5),
                    this.resultSet.getString(6),
                    this.resultSet.getString(7),
                    this.resultSet.getString(8),
                    this.resultSet.getString(9),
                    this.resultSet.getString(10),
                    this.resultSet.getFloat(11),
                    this.resultSet.getString(12),
                    this.resultSet.getString(13),
                    this.resultSet.getString(14),
                    this.resultSet.getString(15),
                    this.resultSet.getString(16)));
            }while (this.resultSet.next());
            }
            
        return Cheminees;
    }  
    
    public ArrayList getTodayCheminees()throws SQLException, NoLogIdsChemineesFoundException{
        ArrayList Cheminees = new ArrayList() ;
            String re = "SELECT l.* FROM DailyYardUnitPosition l INNER JOIN ( SELECT hdhand, MAX(ShiftDate) AS maxDate FROM DailyYardUnitPosition where ShiftDate BETWEEN  CAST( CONVERT(date, getdate()) AS DATETIME) + CAST('00:00:00' AS DATETIME) AND getdate() AND tier >=3 GROUP BY hdhand ) groupel ON l.hdhand = groupel.hdhand AND l.ShiftDate = groupel.maxDate" ;
            this.statement = this.cnx.createStatement();
            this.resultSet = this.statement.executeQuery(re);
            if(!this.resultSet.next()){
            throw new NoLogIdsChemineesFoundException("Pas de cheminé trouvé");
            }
            else{
                do {
                Cheminees.add(new YardPositions(
                    this.resultSet.getFloat(1),
                    this.resultSet.getTimestamp(2).toLocalDateTime(),
                    this.resultSet.getFloat(3),
                    this.resultSet.getTimestamp(4).toLocalDateTime(),
                    this.resultSet.getFloat(5),
                    this.resultSet.getString(6),
                    this.resultSet.getString(7),
                    this.resultSet.getString(8),
                    this.resultSet.getString(9),
                    this.resultSet.getString(10),
                    this.resultSet.getFloat(11),
                    this.resultSet.getString(12),
                    this.resultSet.getString(13),
                    this.resultSet.getString(14),
                    this.resultSet.getString(15),
                    this.resultSet.getString(16)));
            }while (this.resultSet.next());
            }
            
        return Cheminees;
    }  
}