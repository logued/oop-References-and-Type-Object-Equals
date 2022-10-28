package org.example;

/**
 * Demonstration of:
 * Reference Types
 * References of type Object (Object super-class)
 * Methods that can be called depend on the reference type (not the actual object)
 * Changing the type of a reference by using a CAST  ("Casting" a reference)
 * Using the "instanceof" operator to find out the type of an object.
 * Use of Object reference and casting in the equals() method.
 *
 * "A reference can be used to refer to an object of its own type
 * OR to any object that is a subclass of the reference type."
 *
 */

public class AppMain {
    public static void main(String[] args) {
        AppMain app = new AppMain();
        app.start();
    }

    public void start() {
        System.out.println("***** References and Type - Object and Point *****");

        Object objRef = new Object();
        // Type "objRef." to see the methods that are available to call using this reference.
        // Creating an instance of class Object is not really of much practical use to us
        // -  usually, we use Object type references to point at objects of some other type.
        //     - often, to give flexibility to allow us to refer to any type of object

        Point p1 = new Point(10, 20);   // new object
        Point p2 = new Point(10, 20);   // new object
        Point p3 = p1;  // p3 refers to an existing object (object is shared by p1 and p3)
        p1=null;
        p2=null;
        // TODO:  draw diagrams of the above references and objects
        //        & discuss the consequences of the statements

        // TODO: type in "p1." and auto-complete will show a list of methods that can be called on this Point object

        // In the list, note the methods defined in Point AND the methods defined in Object

        // String str1 = new Point(33,44); // error - as type mismatch - str1 is a reference to String type
        // str1 = p1; // error

        Object obj1 = new Point(33, 44);  // this is allowed - why?
        // Note: All classes inherit from the Object superclass.
        // Therefor, all objects are of type Object.
        // The Point class inherits from Object, and therefor it can be accessed
        // using a Point type reference OR by an Object type reference.
        // Point "is-an" Object. (by virtue of inheritance relationship).
        // Thus, we can use a reference of type Object to point at the Point object.
        //  A Point object is both a Point type object and an Object type object!

        // However, obj1 can not be used to call the methods of the Point class.
        // Try typing "obj1." and the autocomplete shows only methods defined in Object superclass -
        // but no Point methods. The type of the reference determines the methods that
        // can be called on the object (here, only the methods defined in Object can be called)

        //obj1

        // However, we know that th ereference "obj1" is actually pointing at a Point type object,
        // so, we can CAST the type of that reference to a Point type, and used that converted
        // reference to invoke methods of the Point class.
        // Note that the CAST changes the type of the reference (not the type of the object).
        // You can NOT change the type of an object by casting.

        int x = ( (Point)obj1 ).getX();     // cast Object type reference to Point type reference.
                                            // Brackets are necessary

        //Point p4 = obj1; // error - reference obj1 is not a Point reference

        Point p5 = (Point) obj1;    // cast the reference to type Point before assigning it to p5
        // We know that obj1 refers to a Point object, so we can safely cast the reference
        // to a Point type reference

        // Can we check the type of the object referenced by obj1?  Yes we can !

        Point p6;
        if (obj1 instanceof Point) {    // "if obj1 refers to an instance of type Point"
            p6 = (Point) obj1;
            System.out.println("p6.getX() = " + p6.getX());
        } else
            System.out.println("Incompatible - obj1 does not refer to a Point object");

        // The above material is relevant to understanding how the equals() method
        // must be implemented in a class. See the equals() method in the Point class
        // and notice the use of an Object reference parameter and casting.

        Point p8 = new Point(77,88);
        Point p9 = new Point(77,88);

        if( p8.equals(p9) )
            System.out.println("p8 is equal to p9");
        else
            System.out.println("p8 is NOT equal to p9");

        //TODO
        // Define a new class called Point3D to represent a point in 3D space (x,y,z).
        // Point3D should extend the Point class.
        // It should have one extra field called "z", a relevant constructor and getter methods.
        // Implement an equals method in the Point3D class and test it out.

    }
}