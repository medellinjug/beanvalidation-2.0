
package org.medellinjug.bvalidation2;

//import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 *Created by Patricia on 15/07/17.
 * MedellinJUG.org
 */

//@Named
@ManagedBean
@SessionScoped
public class BasicFormBean {
    
    private NewAnnotations newAnnotations;
    
    
    public String goUserAction(){
        
        this.newAnnotations =new NewAnnotations();
        
        return "basicForm";
    }
    
    public String addUserAction(){
        
         try{
       
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Submit OK: " + this.newAnnotations, "Submit OK " + this.newAnnotations));
            
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage()));
        }
        
         return "index";
    }
    
    
    

    public NewAnnotations getNewAnnotations() {
        return newAnnotations;
    }

    public void setNewAnnotations(NewAnnotations newAnnotations) {
        this.newAnnotations = newAnnotations;
    }
    
    
    
}
