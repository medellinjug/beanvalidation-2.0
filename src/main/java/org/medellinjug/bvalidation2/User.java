
package org.medellinjug.bvalidation2;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * Created by Patricia on 15/07/17.
 * MedellinJUG.org
 */
public class User {
    
    @NotNull
    @Size (min=10, max=50)
    private String name;
    
    @NotNull
    @Email
    private String email;
    
   // private Date dateOfBirth;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
