package com.ansar.asnar_printer;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class TestAnsarPrinter {

    @Test
    public void testPrinter() throws PrinterException {

        FarsiPrinter farsiPrinter = new FarsiPrinter(PrinterJob.lookupPrintServices()[4]);
        farsiPrinter.print(new FarsiPaper(MediaSize.ISO.A4, OrientationRequested.PORTRAIT) {
            @Override
            public int print(FarsiGraphics2D graphics, int pageIndex) {
                if (pageIndex < 2){
                    graphics.setFont(new Font("B Yekan", Font.PLAIN, 20));
                    graphics.drawFarsiString("سلام", 100, 100);
                    return PAGE_EXISTS;
                }
                return NO_SUCH_PAGE;
            }
        });

    }

}
