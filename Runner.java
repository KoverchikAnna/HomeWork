package Circle;

public class Runner {
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
