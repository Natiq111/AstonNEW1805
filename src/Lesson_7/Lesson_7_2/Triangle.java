package Lesson_7.Lesson_7_2;

public class Triangle extends Figure implements CalcParametrs
{
    int sideA;
    int sideB;
    int sideC;
    int footing;
    int height;
    public Triangle(String name, String colorFill, String colorBorder, int sideA, int sideB, int sideC, int footing, int height)
    {
        super(name, colorFill, colorBorder);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.footing = footing;
        this.height = height;
    }
    public double perimeterFigure()
    {
        return (sideA + sideB + sideC);
    }

    public double squareFigure()
    {
        return (footing* height) / 2;
    }

}