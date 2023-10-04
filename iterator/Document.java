package iterator;

import java.util.Stack;
/*
 * @Author Ellie Maynard
 * creates the document and uses stacks to edit the document
 */
public class Document {
   protected String title;
   protected Stack<String> undoStack = new Stack<String>();
   protected Stack<String> redoStack = new Stack<String>();
   /*
    * a title is given to the document
    * @param tite is a string that the user writes for the name of the document
    */
   public Document(String title) {
    title = this.title;
   }
   /*
    * @param change is a string that the user enters which will be edited within the document\
    * @return undoStack.push(change) is the stack with the current edits and changes are pushed to it
    */
   public String makeChange(String change) {
      return "Making change: " + undoStack.push(change);
   }
   /*
    * this method initializes a change and pops the change from the undo list and pushes it to th redo list
    * @return change is the change user made
    */
   public String undoChange() {
      String change = null;
      if(!undoStack.isEmpty()) {
         change = undoStack.pop();
         change = redoStack.push(change);
      }
      return change;
   }
   /*
    * @return true is whether or not there is anything for the user to undo
    * checks if undo stack is empty
    */
   public boolean canUndo() {
      if(undoStack.isEmpty()) {
         return false;
      }
      return true;
   }
   /*
    * String change is popped from redo list and pushed to undo list when the user wants to redo a change
    * @return change is the user's change
    */
   public String redoChange() {
      String change = null;
      if(!redoStack.isEmpty()) {
         change = redoStack.pop();
         change = undoStack.push(change);
      }
      return change;
   }
   /*
    * check's if the redo stack is empty 
    * @return true is whether or not there is anything for the user to redo
    */
   public boolean canRedo() {
      if(redoStack.isEmpty()) {
         return false;
         }
      return true;
   }
   /*
    * @return new StackIterator(undoStack) gets the undoStack for the user to add to
    */
   public StackIterator getUndoIterator() {
      return new StackIterator(undoStack);
   }
   /*
    * @return new StackIterator(redoStack) gets the redoStack for the users changes to get pushed to
    */
   public StackIterator getRedoIterator() {
      return new StackIterator(redoStack);
   }
}
