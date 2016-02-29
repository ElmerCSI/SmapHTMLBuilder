/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlbuilder;

import java.util.UUID;

/**
 *
 * @author Luc
 */
public class htmlNode {
    public String htmlID ="";
    public String Type = "";
    public String printElement(){return "";};
    public String start = "";
    public String softEnd = "";
    public String end = "";
    public final  String makeID(String type)
    {
        return " id=\"" + type + UUID.randomUUID().toString().replaceAll("-", "") + "\"";
    }
    
}
