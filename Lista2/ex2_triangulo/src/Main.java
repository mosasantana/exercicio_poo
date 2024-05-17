import triangulo.CalcTriangulo;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalcTriangulo calcTriangulo = new CalcTriangulo(3, 3);

        System.out.println(calcTriangulo.area(3));
        System.out.println(calcTriangulo.perimetro());


    }

}