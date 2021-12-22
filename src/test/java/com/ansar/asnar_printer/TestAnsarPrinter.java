package com.ansar.asnar_printer;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import static org.junit.Assert.fail;

public class TestAnsarPrinter {

    @Test
    public void testPrinter() throws PrinterException {

        try {
            FarsiPrinter farsiPrinter = new FarsiPrinter(PrinterJob.lookupPrintServices()[4]);
            farsiPrinter.print(new FarsiPrintable(MediaSize.ISO.A4, OrientationRequested.PORTRAIT) {
                @Override
                public int print(FarsiGraphics2D graphics, int pageIndex) {
                    if (pageIndex < 2){
                        graphics.setFont(new Font("B Yekan", Font.PLAIN, 20));
                        graphics.drawFarsiString("به نام خدا", 100, 10);
                        graphics.drawFarsiString("سلام", 100, 30, Color.BLUE);
                        return PAGE_EXISTS;
                    }
                    return NO_SUCH_PAGE;
                }
            });
        }catch (Exception exception){
            fail();
        }

    }

}
