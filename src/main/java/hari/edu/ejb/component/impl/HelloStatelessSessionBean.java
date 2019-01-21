package hari.edu.ejb.component.impl;

import hari.edu.ejb.component.interfaces.HelloStatelessBeanRemote;

@javax.ejb.Stateless(name = "HelloStatelessSessionEJB")
public class HelloStatelessSessionBean implements HelloStatelessBeanRemote {

    public HelloStatelessSessionBean() {
    }

    public int add(int a, int b) {
        return a+b;
    }
}
