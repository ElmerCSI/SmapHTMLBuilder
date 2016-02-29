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
        start= "<button ";//type=\"button\"
        softEnd= ">";
        end= "</button>";
        Action = action.toString();
    } 
    public void setAction(htmlAction temp) {
        Action = temp.toString();
    }

    @Override
    public String printElement() {
        String allHtml = start + htmlID + Action + "(this)\" " + softEnd + "" + end + "\n     ";
        

        return allHtml;
    }

    
}
