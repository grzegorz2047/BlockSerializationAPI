/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.grzegorz2047.blockserializationapi;

import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;

/**
 *
 * @author Grzegorz
 */
public class IMPLBSAPI implements BSAPI{
    //id to unikalny klucz do pobierania odpowiednich danych danego pluginu
    //Jeszcze musze przemyslec gdzie bedzie kod od serializacji i deserializacji blokow
    public void addBlock(String id, Block b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Block getBlock(String id, Location l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Block> getBlocks(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeBlocks(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
