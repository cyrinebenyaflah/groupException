package tn.esprit.Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AuctionSessions
 */
@Stateless
@LocalBean
public class AuctionSessions implements AuctionSessionsRemote, AuctionSessionsLocal {

    /**
     * Default constructor. 
     */
    public AuctionSessions() {
        // TODO Auto-generated constructor stub
    }

}
