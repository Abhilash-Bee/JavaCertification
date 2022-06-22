package com.java.Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel < 101)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount < 101 && tonerLevel + tonerAmount < 101) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else
            return -1;
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesPrinted += (pages / 2) + (pages % 2);
            return (pages / 2) + (pages % 2);
        } else {
            System.out.println("Printing in single mode");
            pagesPrinted += pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
