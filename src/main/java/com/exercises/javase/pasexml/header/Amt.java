package com.exercises.javase.pasexml.header;

public class Amt {
    private String Ccy;
    private Integer content;

    public Amt(String ccy, Integer content) {
        Ccy = ccy;
        this.content = content;
    }

    public Amt() {
    }

    public String getCcy() {
        return Ccy;
    }

    public void setCcy(String ccy) {
        Ccy = ccy;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Amt{");
        sb.append("Ccy='").append(Ccy).append('\'');
        sb.append(", content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
