package linkedList;

//Problem Statement :- You have a browser of one tab where you start on the homepage and you can visit another url, 
//get back in the history number of steps or move forward in the history number of steps.

public class Broswerhistory {

}

//Implement the BrowserHistory class:
//
//i). BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
//ii). void visit(string url) Visits url from the current page. It clears up all the forward history.
//iii). string back(int steps) Move steps back in history. If you can only return x steps in the history and 
//      steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
//iv). string forward(int steps) Move steps forward in history. If you can only forward x steps in the history 
//     and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.