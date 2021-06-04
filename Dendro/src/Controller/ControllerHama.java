/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOHama;
import DAO.ImplementHama;
import Model.ModHama;
import Model.ModTblHama;
import View.FormDendro;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EMMANUEL
 */
public class ControllerHama {
    FormDendro frame;
    ImplementHama implHama;
    List<ModHama> lmh;

    public ControllerHama(FormDendro frame) {
        this.frame = frame;
        implHama = new DAOHama();
        lmh =implHama.getAll();
    }
    
    public void reset(){
        frame.getTf_no().setText("");
        frame.getTf_hama().setText("");
        frame.getTf_solusi().setText("");
        
    }
    
    public void isiTable(){
        lmh = implHama.getAll();
        ModTblHama mth = new ModTblHama(lmh);
        frame.getTbl_hama().setModel(mth);
        
    }
    
    public void isiField(int row){
        frame.getTf_no().setText(String.valueOf(lmh.get(row).getNo()));
        frame.getTf_hama().setText(lmh.get(row).getHama());
        frame.getTf_solusi().setText(String.valueOf(lmh.get(row).getSolusi()));
    }
    
    public void insert(){
        if(!frame.getTf_hama().getText().trim().isEmpty() & !frame.getTf_hama().getText().trim().isEmpty()){
            ModHama mh = new ModHama();
            
            mh.setHama(frame.getTf_hama().getText());
            mh.setSolusi(String.valueOf(frame.getTf_solusi().getText()));
            
            implHama.insert(mh);
            JOptionPane.showMessageDialog(null, "Data diSimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal diSimpan");
        }
    }
    
    public void delete(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_no().getText());
            implHama.delete(no);
            JOptionPane.showMessageDialog(null, "Data diHapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diHapus");
        }
    }
    
    public void update(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            
            ModHama mh = new ModHama();
            
            mh.setHama(frame.getTf_hama().getText());
            mh.setSolusi(String.valueOf(frame.getTf_solusi().getText()));
            mh.setNo(Integer.valueOf(frame.getTf_no().getText()));
            
            implHama.update(mh);
            JOptionPane.showMessageDialog(null, "Data diPerbarui");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diPerbarui");
        }
    }
    
    public void isiTableCariHama(){
        lmh = implHama.getCariHama(frame.getTf_cari().getText());
        ModTblHama mth = new ModTblHama(lmh);
        frame.getTbl_hama().setModel(mth);
    }
    
    public void CariHama(){
        if(!frame.getTf_cari().getText().trim().isEmpty()){
            implHama.getCariHama(frame.getTf_cari().getText());
            isiTableCariHama();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan masukkan hama");
        }
    }
}
