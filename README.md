# Ansar_Printer
Farsi printer API for ansar project
 
### usage
<code>

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


</code>
