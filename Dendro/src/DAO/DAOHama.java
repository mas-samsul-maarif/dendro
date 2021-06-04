/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDH;
import Model.ModHama;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EMMANUEL
 */
public class DAOHama implements ImplementHama {
    
    Connection connection;
    final String insert = "INSERT INTO hama(hama, solusi) VALUES (?, ?)";
    final String delete = "DELETE FROM hama WHERE no=?";
    final String update = "UPDATE hama set hama=?, solusi=? WHERE no=?";
    final String select = "SELECT * FROM hama";
    final String cariHama = "SELECT * FROM hama WHERE hama like ?";

    public DAOHama() {
        connection = KoneksiDH.connection();
    }
    
    

    @Override
    public void insert(ModHama mh) {
        
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, mh.getHama());
            statement.setString(2, mh.getSolusi());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mh.setNo(rs.getInt(1));
                
            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void delete(int no) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
    
    @Override
    public void update(ModHama mh) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, mh.getHama());
            statement.setString(2, mh.getSolusi());
            statement.setInt(3, mh.getNo());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<ModHama> getAll() {
        List<ModHama> lmh = null;
        
        try {
            lmh = new ArrayList<ModHama>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModHama mh = new ModHama();
                mh.setNo(rs.getInt("no"));
                mh.setHama(rs.getString("hama"));
                mh.setSolusi(rs.getString("solusi"));
                lmh.add(mh);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return lmh;
    }

    @Override
    public List<ModHama> getCariHama(String hama) {
        List<ModHama> lmh = null;
        try{
            lmh = new ArrayList<ModHama>();
            
            PreparedStatement st = connection.prepareStatement(cariHama);
            st.setString(1, "%" + hama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ModHama mh = new ModHama();
                mh.setNo(rs.getInt("no"));
                mh.setHama(rs.getString("hama"));
                mh.setSolusi(rs.getString("solusi"));
                lmh.add(mh);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lmh;
    }
    
    
}
