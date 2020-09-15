/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fees_management_system;

/**
 *
 * @author HP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class User {
    private String id;
    private String name;
    public User(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
}

