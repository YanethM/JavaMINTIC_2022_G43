/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author apmejiar
 */
public class Pool {
    private final String DB ="products_db";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB;
    private final String USER = "root";
    private final String PASS = "";
    
    public DataSource initializeDataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASS);
        basicDataSource.setUrl(URL);
        basicDataSource.setMaxActive(50);
        return basicDataSource;
    }
}
