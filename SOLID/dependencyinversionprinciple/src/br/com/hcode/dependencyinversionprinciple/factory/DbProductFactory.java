package br.com.hcode.dependencyinversionprinciple.factory;

import br.com.hcode.dependencyinversionprinciple.model.Db;
import br.com.hcode.dependencyinversionprinciple.model.IDbProduct;
import br.com.hcode.dependencyinversionprinciple.model.MongoDBProduct;
import br.com.hcode.dependencyinversionprinciple.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type){
        if(type == Db.MYSQL){
            return new MySQLProduct();
        }else{
            return new MongoDBProduct();
        }

    }
}
