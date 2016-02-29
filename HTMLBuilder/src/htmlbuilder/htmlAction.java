/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlbuilder;

/**
 *
 * @author Luc
 */
public class htmlAction {
    public String action = "";
    public String action_name = "";
    htmlAction()
    {
        action = "function linkClickEvent (element) {    console.log(\"My Parent is \" + document.getElementById(element.id).parentElement.getAttribute('id'));}";
        action_name = "linkClickEvent";
                
                
    }

    @Override
    public String toString()
    {
        return " onclick=\"" + action_name + "";
    }
    public String printAction()
    {
        return action;
    }
    
}
