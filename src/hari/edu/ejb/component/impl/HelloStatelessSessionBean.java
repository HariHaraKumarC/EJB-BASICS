package hari.edu.ejb.component.impl;

import hari.edu.ejb.component.interfaces.HelloStatelessBeanRemote;

@javax.ejb.Stateless(name = "HelloStatelessSessionEJB")
public class HelloStatelessSessionBean implements HelloStatelessBeanRemote {

    public HelloStatelessSessionBean() {
    }

    public void printHelloMessage(String message) {
        System.out.println("Hello Stateless Session Bean Print Message: " + message);
    }
}
