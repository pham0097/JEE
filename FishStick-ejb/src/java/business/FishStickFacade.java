/* File: FishStickFacade.java
 * Author:  Phuong Pham, Justin Richardson,Habibolawale Johnson
 * Date: April 2018 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.FishStick;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * Author: Phuong Pham, Justin Richardson,Habibolawale Johnson
 */
@Stateless
public class FishStickFacade extends AbstractFacade<FishStick> implements business.FishStickFacadeRemote {

    @PersistenceContext(unitName = "FishStick-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FishStickFacade() {
        super(FishStick.class);
    }
    
}
