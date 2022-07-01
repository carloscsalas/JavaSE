package com.exercises.javase.pasexml.header;

public class Fr {
    private FIId FIId;

    public com.exercises.javase.pasexml.header.FIId getFIId() {
        return FIId;
    }

    public void setFIId(com.exercises.javase.pasexml.header.FIId FIId) {
        this.FIId = FIId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fr{");
        sb.append("FIId=").append(FIId);
        sb.append('}');
        return sb.toString();
    }
}
