package hari.edu.ejb.component.interfaces;

import javax.ejb.Remote;

@Remote
public interface HelloStatelessBeanRemote {

    void printHelloMessage(String message);
}
