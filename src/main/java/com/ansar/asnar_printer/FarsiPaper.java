package com.ansar.asnar_printer;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

public abstract class FarsiPaper implements Printable {

    private static final HashPrintRequestAttributeSet HASH_PRINT_REQUEST_ATTRIBUTE_SET = new HashPrintRequestAttributeSet();

    FarsiPaper(MediaSize mediaSize) {
        HASH_PRINT_REQUEST_ATTRIBUTE_SET.add(
                new MediaPrintableArea(0, 0,
                Math.round(mediaSize.getX(Size2DSyntax.MM)),
                Math.round(mediaSize.getY(Size2DSyntax.MM)),
                MediaPrintableArea.MM)
        );
    }

    protected HashPrintRequestAttributeSet hashPrintRequestAttributeSet(){
        return HASH_PRINT_REQUEST_ATTRIBUTE_SET;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex){
        if (pageIndex < NO_SUCH_PAGE){
            return print((Graphics2D) graphics, pageFormat, pageIndex);
        }
        return NO_SUCH_PAGE;
    }

    public abstract int print(Graphics2D graphics2D, PageFormat pageFormat, int pageIndex);
}
