package io.hexlet;

import io.hexlet.geometry.Quadrate;

public class App {
    public static Quadrate enlargeQuadrate(Quadrate quadrate) {
        var side = quadrate.getSide() * 2;
        return new Quadrate(side);
    }
}
