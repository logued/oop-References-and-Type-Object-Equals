package org.example;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }


//  DETAILED EXPLANATION of the above equals() method
    //
//    @Override
    // means that this method overrides the equals() method that is defined in the Object superclass
    //
//    public boolean equals(Object o) {
    // in the Object superclass, the equals() method is defined to accept an Object type argument
    // - in other words, it is written so that it can be used with any type of object.
    // We cannot change the type of the parameter (Object o) in our override method,
    // as otherwise it would have a different signature and would not override the equals()
    // method defined in Object superclass.
    // Signature of a method is : name of method + number and types of parameters
    // To override a method, the overriding method must match exactly the signature
    // of the method being overridden.
    //
//        if (this == o) return true;
    // if the object passed in the argument is in fact this object
    // then they are obviously equal, so return true
    //
//        if (o == null || getClass() != o.getClass()) return false;
    // if the argument is null, or if the argument is not the same type of
    // object as this object, then they are not equal
    //
//        Point point = (Point) o;
    // Cast the argument reference o from type Object to type Point
    // We must do this so that we have a reference "point" that can
    // be used to access the fields belonging to the Point class.
    // A reference of type Object can NOT be used to access the X and Y fields
    // belonging to the Point object.
    //
//        return x == point.x && y == point.y;
    // if the value of x in this object is equal to the value of x in the argument
    // AND, the values of y are equal, then return true to indicate that the objects are considered equal.
    //
//    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
