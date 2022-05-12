package com.project.circlepoint;

import com.project.circlepoint.exceptions.ExceedingPlainException;
import com.project.circlepoint.exceptions.InvalidValuesException;
import com.project.circlepoint.exceptions.NotInPlainException;
import com.project.circlepoint.movableImpl.MovableCircle;
import com.project.circlepoint.movableImpl.MovablePoint;

public class MovableTest {
    public static void main(String[] args) {

//        try {
//            MovablePoint point = new MovablePoint(-1000, 0, 0, 0);
//            System.out.println(point);
//            point.moveRight(2000);
//            System.out.println(point);
//        } catch (InvalidValuesException e) {
//            e.printStackTrace();
//        } catch (ExceedingPlainException e) {
//            e.printStackTrace();
//        }

        try {
            MovableCircle circle = new MovableCircle(0,0,0,0,1);
            System.out.println(circle);
            circle.moveRight(999);
            System.out.println(circle);
        } catch (InvalidValuesException | NotInPlainException | ExceedingPlainException e) {
            e.printStackTrace();
        }
    }
}
