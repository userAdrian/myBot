package org.telegramlibs.types;

public class Invoice implements java.io.Serializable {
    private String title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_parameter() {
        return start_parameter;
    }

    public void setStart_parameter(String start_parameter) {
        this.start_parameter = start_parameter;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    private String description;
    private String start_parameter;
    private String currency;
    private Integer total_amount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
