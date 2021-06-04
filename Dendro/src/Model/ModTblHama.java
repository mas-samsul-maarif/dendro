/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EMMANUEL
 */
public class ModTblHama extends AbstractTableModel {
    
    List<ModHama> lmh;

    public ModTblHama(List<ModHama> lmh) {
        this.lmh = lmh;
    }
    
    

    @Override
    public int getRowCount() {
        return lmh.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        
        switch(column){
            case 0:
                return lmh.get(row).getNo();
            case 1:
                return lmh.get(row).getHama();
            case 2:
                return lmh.get(row).getSolusi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Hama";
            case 2:
                return "Solusi";
            default:
                return null;
        }
    }
    
}
