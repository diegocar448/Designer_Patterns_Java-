package br.com.hcode.dependencyinversionprinciple.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String productID){
        return "MySql: Exibindo dados do Produto "+ productID;
    }
}
