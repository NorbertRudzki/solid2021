package pl.zzpj2021.solid.lsp.shape;

import lombok.Value;

@Value
public class Circle implements Shape{

    float r;

    @Override
    public float calculateCircumference() {
        return (float) (2F * Math.PI * r);
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * r * r);
    }
}
