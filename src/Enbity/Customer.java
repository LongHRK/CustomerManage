/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enbity;

/**
 *
 * @author LongNguyen
 */
public class Customer {
    private String id,typeid,name,phone,email;

    public Customer() {
    }

    public Customer(String id, String typeid, String name, String phone, String email) {
        this.id = id;
        this.typeid = typeid;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
