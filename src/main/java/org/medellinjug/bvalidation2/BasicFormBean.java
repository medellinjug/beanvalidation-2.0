
package org.medellinjug.bvalidation2;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 *Created by Patricia on 15/07/17.
 * MedellinJUG.org
 */


@ManagedBean
@SessionScoped
public class BasicFormBean {
    
    private User user;
    
    
    public String goUserAction(){
        
        this.user=new User();
        
        return "basicForm";
    }
    
    public String addUserAction(){
        
         try{
       
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Submit OK: " + this.user , "Submit OK " + this.user));
            
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage()));
        }
        
         return "index";
    }
    
    
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
