/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author apmejiar
 */
public class ModelDatosDB {
    
    
    public ArrayList<DatosDB>getProducts(int idUsuario){
        Pool conexion = new Pool();
        Connection connect = null;
        PreparedStatement pst;
        ResultSet rs;
        DatosDB datosDB;
        ArrayList list = new ArrayList();
        try{
            connect = conexion.initializeDataSource().getConnection();
            if(connect != null){
                System.out.println("Conectados con la DB");
                String sql = "SELECT tb_products.id, tb_products.name, tb_products.description, tb_products.precio FROM tb_products_clients INNER JOIN tb_products ON (tb_products_clients.id_product = tb_products.id) INNER JOIN tb_clients ON (tb_products_clients.id_client = tb_clients.id) WHERE tb_clients.id =?";
                pst = connect.prepareStatement(sql);
                pst.setInt(1, idUsuario);
                rs = pst.executeQuery();
                while(rs.next()){
                    datosDB = new DatosDB();
                    datosDB.setIdProduct(rs.getInt("id"));
                    datosDB.setProduct(rs.getString("name"));
                    datosDB.setDescription(rs.getString("description"));
                    datosDB.setPrecio(rs.getInt("precio"));
                    list.add(datosDB);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la consulta","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e, "Error en la conexión", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                connect.close();
            }catch(SQLException ex){
                System.out.println("Error" + ex);
            }
        }
        return list;
    }
    
    
    public ArrayList<DatosDB> getClients(){
        Pool conexion = new Pool();
        Connection connect = null;
        PreparedStatement pst;
        ResultSet rs;
        DatosDB datosDB;
        ArrayList list = new ArrayList();
        
        try{
            connect = conexion.initializeDataSource().getConnection();
            if(connect != null){
                String sql = "SELECT id, name, email FROM tb_clients WHERE 1";
                pst = connect.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    datosDB = new DatosDB();
                    datosDB.setIdClient(rs.getInt("id"));
                    datosDB.setName(rs.getString("name"));
                    datosDB.setEmail(rs.getString("email"));
                    list.add(datosDB);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la consulta","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e, "Error en la conexión", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                connect.close();
            }catch(SQLException ex){
                System.out.println("Error" + ex);
            }
        }
        return list;
    }
      
}
