package ru.netology.graphics.image;

public class ColorShema implements TextColorSchema {
    private char[] chars;


    public ColorShema(char[] chars) {
        this.chars = chars;

    }

    @Override
    public char convert(int color) {
        return chars[color * chars.length / 256];
    }
}
