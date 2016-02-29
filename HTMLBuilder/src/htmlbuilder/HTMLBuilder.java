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

    /**
     * @param args the command line arguments
     */
    public static divNode makeDivGroup(int count)
    {
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
        htmlPage htmlPage1 = new htmlPage();
        divNode root = new divNode();
        
        htmlAction tempAction = new htmlAction();
        htmlPage1.addNewAction(tempAction);
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
        htmlPage1.addNewElement(root);
        System.out.println(htmlPage1.printElement());
    }
    
}
