package MoveablePoint;

public class Init {
    public static void main(String[] args) {
        MoveablePoint move = new MoveablePoint(10,10,5,2);
        move.move();
        move.move();
        move.move();
        System.out.println(move.toString());
    }
}
