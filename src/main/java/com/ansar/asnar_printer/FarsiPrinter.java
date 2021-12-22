package com.ansar.asnar_printer;

import javax.print.PrintService;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class FarsiPrinter {

    private static final PrinterJob PRINTER_JOB = PrinterJob.getPrinterJob();

    public FarsiPrinter(PrintService printService) throws PrinterException {
        PRINTER_JOB.setPrintService(printService);
    }

    public void print(FarsiPrintable farsiPrintable) throws PrinterException {
        PRINTER_JOB.setPrintable(farsiPrintable);
        PRINTER_JOB.print(farsiPrintable.hashPrintRequestAttributeSet());
    }


}
