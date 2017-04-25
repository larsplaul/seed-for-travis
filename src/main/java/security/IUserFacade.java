/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import entity.User;
import java.util.List;

public interface IUserFacade {

   /*
    Return the Roles if users could be authenticated, otherwise null
     */
    List<String> authenticateUser(String userName, String password);

    /**
     * Get a user by id (userName)
     * @param id The username
     * @return the user or null if not found
     */
    IUser getUserByUserId(String id);
    
    /**
     * Add a new user, given userName and passwor
     * @param userName 
     * @param password
     * @return The new user, with the hashed password
     */
    IUser addUser(String userName, String password);
    
}
