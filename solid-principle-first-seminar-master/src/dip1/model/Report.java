package dip1.model;

import dip1.model.util.PrinterPerorter;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<ReportItem> items;    // report data

    // calculate report data
    public void calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
        items.add(new ReportItem("Second", (float) 7));
        items.add(new ReportItem("Second", (float) 8));
        items.add(new ReportItem("Second", (float) 9));
        items.add(new ReportItem("Second", (float) 9));
        items.add(new ReportItem("Second", (float) 9));
        items.add(new ReportItem("Second", (float) 9));
        items.add(new ReportItem("Second", (float) 9));
    }

    public List<ReportItem> getItems() {
        return items;
    }
}
