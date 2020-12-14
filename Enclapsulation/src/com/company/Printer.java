package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else this.tonerLevel = -1;

        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }
        else {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            }
            else tonerLevel += tonerAmount;
        }
        return tonerLevel;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (Math.round((float) pages/2));
        }
        pagesPrinted += pagesToPrint;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
