package com.exercises.javase.pasexml.header;

public class FinInstnId {
    private String BICFI;

    public String getBICFI() {
        return BICFI;
    }

    public void setBICFI(String BICFI) {
        this.BICFI = BICFI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinInstnId{");
        sb.append("BICFI='").append(BICFI).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
