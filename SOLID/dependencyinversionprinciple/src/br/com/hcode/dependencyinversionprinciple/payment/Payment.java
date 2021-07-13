package br.com.hcode.dependencyinversionprinciple.payment;

import br.com.hcode.dependencyinversionprinciple.factory.DbProductFactory;
import br.com.hcode.dependencyinversionprinciple.model.Db;
import br.com.hcode.dependencyinversionprinciple.model.IDbProduct;
import br.com.hcode.dependencyinversionprinciple.model.MySQLProduct;

public class Payment {

    public void pay(String productID){
        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);

        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
