/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.grzegorz2047.blockserializationapi;

import java.util.List;
import javax.annotation.Nonnull;
import org.bukkit.Location;
import org.bukkit.block.Block;

/**
 *
 * @author Grzegorz
 */
public interface BSAPI {
    
    /**
     *
     * @param id
     * @param b
     */
    @Nonnull void addBlock(String id,Block b);
    
    /**
     *
     * @param id
     * @param l
     * @return
     */
    @Nonnull Block getBlock(String id,Location l);
    
    /**
     *
     * @param id
     * @return
     */
    @Nonnull List<Block> getBlocks(String id);
    
    /**
     *
     * @param id
     */
    @Nonnull void removeBlocks(String id);
    
    
    
    
}
