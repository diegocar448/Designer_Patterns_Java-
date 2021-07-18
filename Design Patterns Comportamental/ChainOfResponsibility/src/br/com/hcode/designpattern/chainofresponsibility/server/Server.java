package br.com.hcode.designpattern.chainofresponsibility.server;

import br.com.hcode.designpattern.chainofresponsibility.middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String email, String password){
        if (middleware.check(email, password)){
            System.out.println("Usuario autenticado com sucesso!");
            System.out.println("Seja Bem vindo!");
            return true;
        }

        return false;
    }

    public void registerUser(String email, String password){
        users.put(email, password);

    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValuePassword(String email, String password){
        return users.get(email).equals(password);
    }
}
