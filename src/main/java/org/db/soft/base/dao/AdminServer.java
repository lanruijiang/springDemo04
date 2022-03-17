package org.db.soft.base.dao;

import lombok.Data;
import lombok.Setter;

@Setter
public class AdminServer {
    private UserDAO userDAO;

    public void adminOperation(){
        boolean b = userDAO.userLogin( "china" , "chinese" );
        if(b){
            System.out.println("login success");
        }else{
            System.out.println("login fail");
        }
    }
}
