/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class UserAccountDirectory {
    
    private ArrayList <UserAccount> userAccountDirectory;
    
    public UserAccountDirectory()
    {
        this.userAccountDirectory = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
        public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountDirectory)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
        
    
    public UserAccount addUserAccount(String username, String password, Employee employee, Role role)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setEmployee(employee);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setUserName(username);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public void addUserAccount(UserAccount ua){
        userAccountDirectory.add(ua);
    }
    
    public void delUserccount(UserAccount ua) {
        userAccountDirectory.remove(ua);
    }
    
}
