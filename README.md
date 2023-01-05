# Ansar_Printer
Farsi printer API for ansar project
 
### usage

First you have to install printer on your OS

``` sudo apt-get install cups-pdf ```

Using java

```java

FarsiPrinter farsiPrinter = new FarsiPrinter(PrinterJob.lookupPrintServices()[0]);
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


```

### output


