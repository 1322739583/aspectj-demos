package com.xzh.dao;

public class ProductDao {
    public void save(){
        System.out.println("保存商品");
    }
    public void update(){
        System.out.println("更新商品");
    }
    public String delete(){
        System.out.println("删除商品");
        return "id=1";
    }

    public void findOne(int value,String name){
        System.out.println("查找一个商品");
      //  return "id=1";
    }

}
