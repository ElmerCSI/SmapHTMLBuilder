/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlbuilder;

import java.util.ArrayList;

/**
 *
 * @author Luc
 */
public class divNode extends htmlNode 
{
    ArrayList<htmlNode> contents = new ArrayList<htmlNode>();
    
    
    divNode()
    {
        Type = "div";
        htmlID = makeID(Type);
        start= "<div ";
        softEnd= ">";
        end= "</div>";
    }
    public void addNewElement(htmlNode temp)
    {
        contents.add(temp);
    }
    

    @Override
    public String printElement() {
        //This makes a div
        String allHtml = start + htmlID + softEnd + "";
        //then adds all its elements to the conents of the html text
        for(htmlNode in : contents )
        {
            allHtml += "\n" + in.printElement();
        }
   
        allHtml = allHtml.replaceAll("\n", "\n     "); //adds a level of indenting 
        allHtml += "\n" + end;
        
        return allHtml;
    }

    
    
}
