package com.exercises.javase.pasexml.header;

public class To {
    private FIId FIId;

    public FIId getFIId() {
        return FIId;
    }

    public void setFIId(FIId FIId) {
        this.FIId = FIId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("To{");
        sb.append("FIId=").append(FIId);
        sb.append('}');
        return sb.toString();
    }
}
