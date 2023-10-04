package iterator;

import java.util.Iterator;
import java.util.Stack;
/*
 * @Author Ellie Maynard
 * StackIterator allows the stacks to be iterated through and for information to be put in 
 * uses a Stack items which holds the items in the document
 * uses int position to track the position of each item in the stack
 */
public class StackIterator implements Iterator <String> {
   protected Stack<String> items;
   protected int position = 0;
   /*
    * @param Stack items holds the items in the document
    */
   public StackIterator(Stack<String> items) {
    this.items = items;
   }
   /*
    * @return item returns the next item in the stack
    * string item is equal to items at position
    */
   public String next() {
    String item = items.get(position);
    position = position +1;
    return item;
   }
   /*
    * @return false if position is greater than the size of the stack
    * @return true if there are still items to iterate through
    */
   public boolean hasNext() {
    if(position >= items.size() || items.get(position) == null) {
        return false;
    } else {
        return true;
    }
   }
}
