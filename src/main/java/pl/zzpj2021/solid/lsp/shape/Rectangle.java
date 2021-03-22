package pl.zzpj2021.solid.lsp.shape;

import lombok.Value;

@Value
public class Rectangle implements Shape{

    float a;
    float b;

    @Override
    public float calculateCircumference() {
        return 2 * (a + b);
    }

    @Override
    public float calculateArea() {
        return a * b;
    }
}
