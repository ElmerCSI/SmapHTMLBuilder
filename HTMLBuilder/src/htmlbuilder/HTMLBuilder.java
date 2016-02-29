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
public class HTMLBuilder {

    public static divNode makeDivGroup(int count)
    {
        //make a bunch of new divs
        divNode root = new divNode();
        for(int x = 0; x<count;x++)
        {
           divNode newDiv = new divNode();
           root.addNewElement(newDiv);
        }
        return root;
    }
    public static buttonNode newButtonWithAction()
    {
        htmlAction tempAction = new htmlAction();
        buttonNode tempBtn = new buttonNode(tempAction);
        return tempBtn;
    }
    public static void main(String[] args) {
        //make the page
        //we could easily make a list of pages
        htmlPage htmlPage1 = new htmlPage();
        
        //we are makng a div
        divNode root = new divNode();
        //then we make a new action
        htmlAction tempAction = new htmlAction();
        //then we add the action to the page. Otherwise we cant exectue the action when an actionListener calls it. 
        htmlPage1.addNewAction(tempAction);
        //add so data
        for(int x = 1; x<=5; x++)
        {
            divNode newDiv = new divNode();
            divNode temp = makeDivGroup(x);
            newDiv.addNewElement(temp);
            if(x%2 == 1)
            {
               newDiv.addNewElement( new buttonNode(tempAction));
            }
            else 
                newDiv.addNewElement(new htmlLabel("I am a label for the " + x + " Div"));
            root.addNewElement(newDiv);
        }
        //add the new div to the page.
        //we could add more elements if we wanted
        htmlPage1.addNewElement(root);
        //print the html to the consol
        //This would be better to print to a file. 
        System.out.println(htmlPage1.printElement());
    }
    
}
