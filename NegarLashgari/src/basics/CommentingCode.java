package basics;

public class CommentingCode {
    public static void main(String[] args) {
        // Comments are written to explain code in an easily
        // understandable way
        // Basically for single lines
        // anything after // is considered a comment
        System.out.println("Normal code is compiled and runs ...");
        System.out.println("Comments however ... ");// do not execute!

        // Comments can be on their own line
        System.out.println("..."); // or they can share like this

        // However if you put the // BEFORE a line of code
         System.out.println("Then it is considered a comment");
         System.out.println("and it won't execute!");

        /*
               This is an example of a multi-line comment, which is useful if
               you want to comment out multiple lines of code quickly.
               Console.WriteLine("Java ignores everything inside the comment markers.");
        */
    }
}
