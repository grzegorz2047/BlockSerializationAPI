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

    @Override
    public void addBlock(Block b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Block getBlock(Location l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Block> getBlocks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBlocks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //id to unikalny klucz do pobierania odpowiednich danych danego pluginu
    //Jeszcze musze przemyslec gdzie bedzie kod od serializacji i deserializacji blokow

    
}
