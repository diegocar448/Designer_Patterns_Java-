package br.com.hcode.designpattern.chainofresponsibility.middlewares;

public abstract class Middleware {

    private Middleware next;

    public void linkWith(Middleware next){
        this.next = next;
    }

    public abstract boolean check(String email, String password);

    protected  boolean checkNext(String email, String password){
        if (next == null){
            return true;
        }

        return next.check(email, password);
    }
}
