public class TestRatings {
    public static void main(String[] args) {
        Ratings r = new Ratings();
        r.set(1, 2, 8);
        r.set(0, 3, 7);
        r.set(1, 4, 9);
        r.set(3, 2, 7);
        r.set(3, 0, 8);
        r.set(3, 3, 7);
        r.set(5, 4, 9);
        r.set(7, 2, 8);
        r.set(7, 3, 7);
        r.set(8, 4, 9);
        r.display();

        System.out.println(r.get(7,3) +" || Expected = 7");
        System.out.println(r.countAbove(7) + " || Expected = 6");
    }
}
