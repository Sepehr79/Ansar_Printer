package com.ansar.asnar_printer;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;

public class FarsiGraphics2D extends DebugGraphics {

    private final PageFormat pageFormat;

    private final Graphics actualGraphics;


    public FarsiGraphics2D(Graphics graphics, PageFormat pageFormat) {
        super(graphics);
        this.pageFormat = pageFormat;
        this.actualGraphics = graphics;
    }

    public void drawFarsiString(String text, int x, int y){
        int width = (int) (pageFormat.getWidth() - (x + actualGraphics.getFontMetrics().stringWidth(text)));
        super.drawString(text, width, y);
    }

}
