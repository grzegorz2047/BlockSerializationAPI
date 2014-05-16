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
     * @param b
     */
    @Nonnull void addBlock(@Nonnull Block b);
    
    /**
     *
     * @param l
     * @return
     */
    @Nonnull Block getBlock(@Nonnull Location l);
    
    /**
     *
     * @return
     */
    @Nonnull List<Block> getBlocks();
    

    @Nonnull void removeBlocks();
    
    
    
    
}
