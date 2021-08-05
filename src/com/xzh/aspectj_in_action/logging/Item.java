package com.xzh.aspectj_in_action.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Item {
    private String _id;
    private float _price;
    static Logger _logger=Logger.getLogger("abcabc");

    public Item(String _id, float _price) {
        this._id = _id;
        this._price = _price;
    }

    public String get_id() {
      // _logger.logp(Level.INFO,"Item","getID","Entering");
        return _id;
    }



    public float get_price() {
     //   _logger.logp(Level.INFO,"Item","getPrice","Entering");
        return _price;
    }

    @Override
    public String toString() {
        _logger.logp(Level.INFO,"Item","toString","Entering");
        return "Item{" +
                "_id='" + _id + '\'' +
                '}';
    }
}
