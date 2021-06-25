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
public class CustomerType {

    @Override
    public String toString() {
        return nametype;
    }
    private String typeid,nametype;

    public CustomerType() {
    }

    public CustomerType(String typeid, String nametype) {
        this.typeid = typeid;
        this.nametype = nametype;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getNametype() {
        return nametype;
    }

    public void setNametype(String nametype) {
        this.nametype = nametype;
    }

    public Object getTypeid(String typeid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
