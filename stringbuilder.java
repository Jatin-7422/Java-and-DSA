class stringbuilder {
 public static void main(String[] args) {
    // //  Declaration 
    // StringBuilder sb = new StringBuilder("Tony");

    // System.out.println(sb);
    
    
    // // System.out.println(sb.charAt(0));
    
    // // set char at index  
    // sb.setCharAt(0, 'P');
    // System.out.println(sb);

    // //  Insert  a new character at a particular position 
    // sb.insert(0,'S');
    // System.out.println(sb);
    // sb.insert(3,'n');
    // System.out.println(sb);
    
    // // Delete a part from the string from between starting and deleting index
    // sb.delete(0,2);
    // System.out.println(sb);
   StringBuilder name = new StringBuilder("Hello");
   
   // Reversing a string 
   for (int i = 0; i < name.length() / 2; i++) {

      //  set two pointers and take its position
      int front = i; // front element => "h"
      int back = name.length() - i - 1; // last element => "o" --> 5-0-1

      // Take that character at index 
      char Frontchar = name.charAt(front);
      char Backchar = name.charAt(back);

      name.setCharAt(front, Backchar);
      name.setCharAt(back, Frontchar);
   }
   System.out.println(name);
    
 }   
}
