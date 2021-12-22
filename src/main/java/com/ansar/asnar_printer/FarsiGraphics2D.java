package com.ansar.asnar_printer;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;

public class FarsiGraphics2D extends DebugGraphics {

    private static final Color DEFAULT_COLOR = Color.black;

    private final PageFormat pageFormat;

    private final Graphics actualGraphics;


    public FarsiGraphics2D(Graphics graphics, PageFormat pageFormat) {
        super(graphics);
        this.pageFormat = pageFormat;
        this.actualGraphics = graphics;
    }

    public void drawFarsiString(String text, int x, int y){
        int xPosition = (int) (pageFormat.getWidth() - (x + actualGraphics.getFontMetrics().stringWidth(text)));
        super.drawString(text, xPosition, y);
    }

    public void drawFarsiString(String text, int x, int y, Color color){
        super.setColor(color);
        drawFarsiString(text, x, y);
        super.setColor(DEFAULT_COLOR);
    }

}
