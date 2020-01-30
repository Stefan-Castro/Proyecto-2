/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.awt.event.KeyEvent;

/**
 *
 * @author mac
 */
public class Validaciones {

    public boolean solo_letras(Character ch){
        boolean res = true;
        
        if (!Character.isLetter(ch) && ch!=KeyEvent.VK_BACK_SPACE && ch!=KeyEvent.VK_SPACE && ch!=KeyEvent.VK_DELETE && ch!=KeyEvent.VK_ENTER ){
            res = false;
        }
        return res;
         
    }
    
    
}
