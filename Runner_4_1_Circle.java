package Circle;
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

public class Runner_4_1_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle();
//        System.out.println(circle.getXCoordinateCenterCircle() + " " + circle.getYCoordinateCenterCircle() + " " + circle2.getXCoordinateCenterCircle() + " " + circle2.getYCoordinateCenterCircle());
        circle.touchCircles();
        System.out.println("Растояние между центрами окружности равно "+circle.lengthCentersTwoCircle(circle.getXCoordinateCenterCircle(), circle.getYCoordinateCenterCircle(),
                circle2.getXCoordinateCenterCircle(), circle2.getYCoordinateCenterCircle()));

        System.out.println("Центр окружности после смещения "+circle.xMoveRandomCenterCircle()+" "+circle.yMoveRandomCenterCircle());
        System.out.println("Длина окружности равна " + circle.lengthCircle(circle.radiusCircle));

    }
}
