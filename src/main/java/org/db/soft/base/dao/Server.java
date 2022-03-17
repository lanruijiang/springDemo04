package org.db.soft.base.dao;

import lombok.Setter;

@Setter
public class Server {
    private UserDAO userDAO;

    public void operation(){
        boolean b = userDAO.userLogin( "china" , "chinese" );
        if(b){
            System.out.println("login success");
        }else{
            System.out.println("login fail");
        }
    }
}
