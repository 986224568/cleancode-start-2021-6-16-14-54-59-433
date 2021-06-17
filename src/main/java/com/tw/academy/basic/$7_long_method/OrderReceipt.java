package com.tw.academy.basic.$7_long_method;

import java.util.List;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private static final String HEADER = "======Printing Orders======\n";
    private static final char TAB = '\t';
    private static final char NEW_LINE = '\n';
    private static final double RATE = 0.1;
    private static final String SALES_TAX = "Sales Tax";
    private static final String TOTAL_AMOUNT = "Total Amount";
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        output.append(HEADER);
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
        Amount amount = new Amount(0d, 0d);
        output.append(printAllLineItemInfos(order.getLineItems(), amount));
        output.append(printMoney(amount));
        return output.toString();
    }

    private String printMoney(Amount amount) {
        return SALES_TAX + TAB + amount.getTotalSalesTax() + TOTAL_AMOUNT + TAB + amount.getTotalAmount();
    }

    private double calculateSalesTax(LineItem lineItem) {
        return lineItem.totalAmount() * RATE;
    }

    private double calculateSingleItemTotalAmount(LineItem lineItem, double salesTax) {
        return lineItem.totalAmount() + salesTax;
    }

    private String printAllLineItemInfos(List<LineItem> lineItems, Amount amount) {
        StringBuilder lineItemInfoBuilder = new StringBuilder();
        for (LineItem lineItem : lineItems) {
            lineItemInfoBuilder.append(printLineItem(lineItem));

            double salesTax = calculateSalesTax(lineItem);
            amount.addSalesTax(salesTax);
            amount.addAmount(calculateSingleItemTotalAmount(lineItem, salesTax));
        }
        return lineItemInfoBuilder.toString();
    }


    private String printLineItem(LineItem lineItem) {
        return lineItem.getDescription() +
                TAB +
                lineItem.getPrice() +
                TAB +
                lineItem.getQuantity() +
                TAB +
                lineItem.totalAmount() +
                NEW_LINE;
    }
}