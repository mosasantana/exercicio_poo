package triangulo;

public class CalcTriangulo {
    private int base;
    private int altura;

    public CalcTriangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int area (int area){
       return (this.base = base * altura /2);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int perimetro() {
        return (this.base *= 3);
    }
}

