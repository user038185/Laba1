public class MyClass {
    private int A;
    private String B;
    private double C;

    public MyClass(int A, String B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }
    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public void printMyClass() {
        System.out.println("A: " + A + ", B: " + B + ", C: " + C);
    }
}