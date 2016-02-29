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
public class htmlPage extends htmlNode{
    ArrayList<htmlAction> Actions = new ArrayList<htmlAction>();//This keeps track of the funcitons on the page
    ArrayList<htmlNode> contents = new ArrayList<htmlNode>();//this keeps track of the elements on the page. 
    public void addNewElement(htmlNode temp)
    {
        contents.add(temp);
    }
    public void addNewAction(htmlAction temp)
    {
        Actions.add(temp);
    }
    htmlPage()
    {
        Type = "html";
        htmlID = makeID(Type);
        start= "<HTML>";
        softEnd= ">";
        end= "</HTML>";
    }
    
    @Override
    public String printElement()//Prints and HTML page
    {
        String allHtml = start + "";
        for(htmlNode in : contents )
        {
            allHtml += "\n" + in.printElement();
        }
   
        allHtml = allHtml.replaceAll("\n", "\n     "); //adds a level of indenting to all the elments before. This makes things pretty
        
        allHtml += "\n     <script>";
        for(htmlAction in : Actions )
        {
            allHtml += "\n          " + in.printAction();
        }
        allHtml += "\n     </script>\n";
        
        allHtml += "\n" + end;
        
        return allHtml;
    }
}

/*
<html>
02
<body>
03
  <h1>Counting rabbits</h1>
04
 
05
  <script>
06
    for(var i=1; i<=3; i++) {
07
      alert("Rabbit "+i+" out of the hat!")
08
    }
09
  </script>
10
 
11
  <h1>...Finished counting</h1>
12
 
13
</body>
14
</html>

*/
