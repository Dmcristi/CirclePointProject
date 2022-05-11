package com.project.circlepoint;

import com.project.circlepoint.exceptions.InvalidValuesException;
import com.project.circlepoint.exceptions.NotInPlainException;
import com.project.circlepoint.movableImpl.MovableCircle;

public class MovableTest {
    public static void main(String[] args) {

//        try {
//            MovablePoint point = new MovablePoint(-1000, 0, 0, 0);
//            System.out.println(point);
//            point.moveRight(2001);
//            System.out.println(point);
//        } catch (InvalidValuesException e) {
//            e.printStackTrace();
//        } catch (ExceedingPlainException e) {
//            e.printStackTrace();
//        }

        try {
            MovableCircle circle = new MovableCircle(-10,-2,0,0,995);
            System.out.println(circle);
           // circle.setRadius(994);
            System.out.println(circle);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        } catch (NotInPlainException e) {
            e.printStackTrace();
        }


    }
}
