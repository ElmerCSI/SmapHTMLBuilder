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
public class buttonNode extends htmlNode{
    public String Action = "";
    buttonNode(htmlAction action) {
        Type = "button";
        htmlID = makeID(Type);
        start= "<button ";
        softEnd= ">";
        end= "</button>";
        Action = action.toString();//this assing the action you want the button to preform on click
    } 
    public void setAction(htmlAction temp) {
        Action = temp.toString();
    }

    @Override
    public String printElement() {
        //Returns a button formatted in html
        //Currently the buttons will not have any text attached
        //they also ALWAYS pass themselvs to any action they call
        String allHtml = start + htmlID + Action + "(this)\" " + softEnd + "" + end + "\n     ";
        

        return allHtml;
    }

    
}
