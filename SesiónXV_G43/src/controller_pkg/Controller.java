/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model_pkg.*;
import view_pkg.Principal;

/**
 *
 * @author apmejiar
 */
public class Controller implements ActionListener{

    private final Principal view;
    
    public final void events(){
        view.cb_clients.addActionListener(this);
    }

    public Controller(Principal view) {
        this.view = view;
        getClients();
        Item item = (Item)view.cb_clients.getSelectedItem();
        getProducts(item.getId());
        events();
    }
    
    public final void getClients(){
        ArrayList<DatosDB> list;
        ModelDatosDB model= new ModelDatosDB();
        list = model.getClients();
        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                int idClient = list.get(i).getIdClient();
                String name = list.get(i).getName();
                view.cb_clients.addItem(new Item(idClient, name));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public final void getProducts(int id){
        ArrayList<DatosDB> list;
        ModelDatosDB model= new ModelDatosDB();
        list = model.getProducts(id);
        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                DefaultTableModel modelTable = (DefaultTableModel)view.tbProducts.getModel();
                Object[] fila = new Object[4];
                fila[0] = list.get(i).getIdProduct();
                fila[1] = list.get(i).getProduct();
                fila[2] = list.get(i).getPrecio();
                fila[3] = list.get(i).getDescription();
                
                modelTable.addRow(fila);
                view.tbProducts.setModel(modelTable);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron productos asociados al usuario consultado","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarCeldas(){
        DefaultTableModel model = (DefaultTableModel)view.tbProducts.getModel();
        while(view.tbProducts.getRowCount()>0){
            model.removeRow(0);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if(evt.equals(view.cb_clients)){
            eliminarCeldas();
            Item item = (Item)view.cb_clients.getSelectedItem();
            getProducts(item.getId());
        }
    }
    
}
