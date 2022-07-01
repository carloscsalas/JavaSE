package com.exercises.javase.pasexml.header;

public class FIId {
    private FinInstnId FinInstnId;

    public FinInstnId getFinInstnId() {
        return FinInstnId;
    }

    public void setFinInstnId(FinInstnId finInstnId) {
        FinInstnId = finInstnId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FIId{");
        sb.append("FinInstnId=").append(FinInstnId);
        sb.append('}');
        return sb.toString();
    }
}
