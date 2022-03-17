package org.db.soft.base;

import org.db.soft.base.dao.AdminServer;
import org.db.soft.base.dao.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("configuration.xml");

        Server server = app.getBean( "server" , Server.class );
        server.operation();

        AdminServer adminServer = app.getBean( "adminServer" , AdminServer.class );
        adminServer.adminOperation();

    }
}
