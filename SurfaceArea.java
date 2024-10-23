public class SurfaceArea {
    static float rectangle(float a, float b) {
        return a*b;
    }

    static double circle (float radius) {
        return (Math.PI * radius * radius);
    }

    static float triangle (float base, float height) {
        return (float)((base * height)/2);
    }
}