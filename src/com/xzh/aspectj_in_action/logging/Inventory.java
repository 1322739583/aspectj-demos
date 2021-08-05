package com.xzh.aspectj_in_action.logging;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 清单类,这个清单是拿在手上的，只是一个想法，并不是商场里面的清单。
 */
public class Inventory {
    static Logger _logger=Logger.getLogger("trace");
    private List _items=new Vector();
    public void addItem(Item item){
     //   _logger.logp(Level.INFO,"Inventory","addItem","Entering");
        _items.add(item);
    }
    public void removeItem(Item item){
     //   _logger.logp(Level.INFO,"Inventory","removeItem","Entering");
        _items.remove(item);
    }
}
