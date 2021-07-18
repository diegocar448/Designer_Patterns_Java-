package br.com.hcode.designpattern.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{


    @Override
    public boolean check(String email, String password) {
        if(email.equals("master@code.com.br")){
            System.out.println("Bem vindo Administrador!");;
            return true;
        }

        System.out.println("Bem vindo!");;

        return checkNext(email, password);
    }
}
