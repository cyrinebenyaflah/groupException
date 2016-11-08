package tn.esprit.Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class UserServices
 */
@Stateful
@LocalBean
public class UserServices implements UserServicesRemote, UserServicesLocal {

    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

}
