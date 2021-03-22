package pl.zzpj2021.solid.lsp.shape;

import lombok.Value;

@Value
public class Square implements Shape{

    float a;

    @Override
    public float calculateCircumference() {
        return 4 * a;
    }

    @Override
    public float calculateArea() {
        return a * a;
    }
}
