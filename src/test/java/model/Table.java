package model;

import java.math.BigDecimal;

public class Table {
    private String type;
    private String material;
    private String color;
    private String form;
    private double size;
    private String legsTable;
    private BigDecimal price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLegsTable() {
        return legsTable;
    }

    public void setLegsTable(String legsTable) {
        this.legsTable = legsTable;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
