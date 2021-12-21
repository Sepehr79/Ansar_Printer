package com.ansar.asnar_printer;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class TestAnsarPrinter {

    @Test
    public void testPrinter() throws PrinterException {

        FarsiPrinter farsiPrinter = new FarsiPrinter(PrinterJob.lookupPrintServices()[4]);
        farsiPrinter.print(new FarsiPaper(MediaSize.ISO.A4) {
            @Override
            public int print(Graphics2D graphics, PageFormat pageFormat, int pageIndex) {
                graphics.setFont(new Font("B Yekan", Font.PLAIN, 20));
                graphics.drawString("سلام", 100, 100);
                return PAGE_EXISTS;
            }
        });

    }

}
