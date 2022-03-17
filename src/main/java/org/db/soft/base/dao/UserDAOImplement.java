package org.db.soft.base.dao;

public class UserDAOImplement implements  UserDAO{
    @Override
    public boolean userLogin(String username, String password) {
        boolean b = false;
        if(username.equalsIgnoreCase( "china" )){
            if(password.equalsIgnoreCase( "chinese" )){
                b = true;
            }
        }
        return b;
    }
}
