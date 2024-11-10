public class LinearEquation {
    private int x1, y1, x2, y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
}
double distance() {
    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
}
double slope() {
    return (double) (y2 - y1) / (x2 - x1);
}
double yIntercept() {
    return roundedToHundredth(y1 - slope() * x1);
}
String equation() {
    if (x1 == x2) {
        return "Enter a new value, please.";
    } else if (y1 == y2) {
        return ("y = " + yIntercept());
    }
    return ("y = " + roundedToHundredth(y2 - y1) + "/"  + roundedToHundredth(x2 - x1) + " " + "x + " + yIntercept());
}
private double roundedToHundredth(double rounded) {
    return Math.round(rounded * 100) / 100.0;
}
String coordinateForX(double x) {
    double ansY = roundedToHundredth(slope() * x + yIntercept());
    return (" " + x + ", " + ansY + " ");
}
String LineInfo() {
    return ("The two points are: " + "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")" + "\n" +
            "  The equation of the line between these points is: " + equation() + "\n" +
            "  The y-intercept of this line is: " + yIntercept() + "\n" +
            "  The slope of this line is: " + roundedToHundredth(slope()) + "\n" +
            "  The distance between these points is: " + roundedToHundredth(distance()));
}
}

