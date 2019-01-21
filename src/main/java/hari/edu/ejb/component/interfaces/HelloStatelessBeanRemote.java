package hari.edu.ejb.component.interfaces;

import javax.ejb.Remote;

@Remote
public interface HelloStatelessBeanRemote {

    int add(int a , int b);
}
