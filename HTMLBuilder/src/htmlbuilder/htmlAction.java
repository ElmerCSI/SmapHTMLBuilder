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
        //what the code behind the function really is
        //currently any action you make will be this action
        //this action reports the elements parent to the browser's console. 
        action = "function linkClickEvent (element) {    console.log(\"My Parent is \" + document.getElementById(element.id).parentElement.getAttribute('id'));}";
        //name of the function that will be called. 
        action_name = "linkClickEvent";
                
                
    }

    @Override
    public String toString()
    {
        //returns the name of the funciton. 
        //This is called whenever you need to give an action listener an action. 
        return " onclick=\"" + action_name + "";
    }
    public String printAction()
    {
        //this is called when you want to give the code to the page it self. 
        //We pass it to the Page to avoid duplicating. 
        return action;
    }
    
}
