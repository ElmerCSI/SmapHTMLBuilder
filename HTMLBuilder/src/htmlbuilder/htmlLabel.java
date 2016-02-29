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
public class htmlLabel extends htmlNode{
    
    public String Text = "";//text the label will display
    htmlLabel(String text) {
        Type = "label";
        htmlID = makeID(Type);
        start= "<label ";
        softEnd= ">";
        end= "</label>";
        Text =text;
    } 
    public void setText(String temp) {
        Text = temp;
    }

    @Override
    public String printElement() {
        //prints out an html string making  a lebel
        String allHtml = start + htmlID + softEnd + " " + Text + "" + end + "\n     ";
        

        return allHtml;
    }
    
}
