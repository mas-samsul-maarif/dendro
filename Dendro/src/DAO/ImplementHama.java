/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModHama;
import java.util.List;

/**
 *
 * @author EMMANUEL
 */
public interface ImplementHama {
    
    public void insert(ModHama mh);
    public void delete(int no);
    public void update(ModHama mh);
    public List<ModHama> getAll();
    public List<ModHama> getCariHama(String hama);
}
