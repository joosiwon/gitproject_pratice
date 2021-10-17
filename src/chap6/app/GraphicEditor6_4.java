package chap6.app;

import chap6.base.Shape6_4;
import chap6.derived.Circle6_4;

public class GraphicEditor6_4
{
    public static void main(String[] args) {
        Shape6_4 shape = new Circle6_4();
        shape.draw();
    }
}