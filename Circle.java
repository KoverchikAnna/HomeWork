package Circle;

import java.util.Random;
import java.util.Scanner;

public class Circle {
    //1. Создайте в классе Circle метод, вычисляющий длину окружности.
//	a. Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата
//координатной плоскости с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что
//требуется создать обычный метод, применимый к уже существующему объекту, а не
//конструктор создающий новый объект.
//	b. Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта
//с его помощью, координаты центра и радиус окружности пользователь вводил с
//клавиатуры.
//	c. Создайте в классе Circle метод, вычисляющий расстояние между центрами двух
//окружностей.
//	d. Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке.
//Учтите, что возможен вариант, когда одна окружность содержится внутри другой и при
//этом всё равно возможно касание в одной точке.


    public int radiusCircle;
    public int xCoordinateCenterCircle;
    public int yCoordinateCenterCircle;
    public int radius1Circle;
    public int x1CoordinateCenterCircle;
    public int y1CoordinateCenterCircle;

    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты центра окружности и радиус");
        this.xCoordinateCenterCircle = scanner.nextInt();
        this.yCoordinateCenterCircle = scanner.nextInt();
        this.radiusCircle = scanner.nextInt();
        scanner.close();
        return;
    }

    public int xMoveRandomCenterCircle() {
        Random random = new Random();
        xCoordinateCenterCircle = random.nextInt(198)-99;
        return xCoordinateCenterCircle;
    }

    public int yMoveRandomCenterCircle() {
        Random random = new Random();
        yCoordinateCenterCircle = random.nextInt(198)-99;
        return yCoordinateCenterCircle;
    }


    public double lengthCircle(double radiusCircle) {
        double lengthCircle = (int)2 * Math.PI * radiusCircle;
        return lengthCircle;
    }

    public int getXCoordinateCenterCircle() {
        return xCoordinateCenterCircle;
    }

    public int getYCoordinateCenterCircle() {
        return yCoordinateCenterCircle;
    }

    public int getRadiusCircle() {
        return radiusCircle;
    }

    public int lengthCentersTwoCircle(int xCoordinateCenterCircle, int yCoordinateCenterCircle, int x1CoordinateCenterCircle, int y1CoordinateCenterCircle) {
        int lengthCentersTwoCircle = (int)Math.sqrt(Math.pow((xCoordinateCenterCircle - x1CoordinateCenterCircle), 2) + Math.pow((yCoordinateCenterCircle - y1CoordinateCenterCircle), 2));
        return lengthCentersTwoCircle;
    }

    public void touchCircles() {
        if ((lengthCentersTwoCircle(xCoordinateCenterCircle, yCoordinateCenterCircle,
                x1CoordinateCenterCircle, y1CoordinateCenterCircle) == (radiusCircle + radius1Circle)) ||
                (lengthCentersTwoCircle(xCoordinateCenterCircle, yCoordinateCenterCircle,
                        x1CoordinateCenterCircle, y1CoordinateCenterCircle) == (radiusCircle - radius1Circle))) {
            System.out.println("Окружности касаются");
        }
        else {
            System.out.println("Окружности не касаются");
        }
    }

}
