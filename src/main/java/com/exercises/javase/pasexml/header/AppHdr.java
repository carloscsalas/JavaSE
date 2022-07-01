package com.exercises.javase.pasexml.header;

public class AppHdr {

    private String Prty;
    private String xmlns;
    private String CreDt;
    private String MsgDefIdr;
    private String BizMsgIdr;
    private Amt Amt;
    private To To;
    private Fr Fr;
    private String BizSvc;

    public AppHdr() {
    }

    public String getPrty() {
        return Prty;
    }

    public void setPrty(String prty) {
        Prty = prty;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getCreDt() {
        return CreDt;
    }

    public void setCreDt(String creDt) {
        CreDt = creDt;
    }

    public String getMsgDefIdr() {
        return MsgDefIdr;
    }

    public void setMsgDefIdr(String msgDefIdr) {
        MsgDefIdr = msgDefIdr;
    }

    public String getBizMsgIdr() {
        return BizMsgIdr;
    }

    public void setBizMsgIdr(String bizMsgIdr) {
        BizMsgIdr = bizMsgIdr;
    }

    public com.exercises.javase.pasexml.header.Amt getAmt() {
        return Amt;
    }

    public void setAmt(com.exercises.javase.pasexml.header.Amt amt) {
        Amt = amt;
    }

    public com.exercises.javase.pasexml.header.To getTo() {
        return To;
    }

    public void setTo(com.exercises.javase.pasexml.header.To to) {
        To = to;
    }

    public com.exercises.javase.pasexml.header.Fr getFr() {
        return Fr;
    }

    public void setFr(com.exercises.javase.pasexml.header.Fr fr) {
        Fr = fr;
    }

    public String getBizSvc() {
        return BizSvc;
    }

    public void setBizSvc(String bizSvc) {
        BizSvc = bizSvc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppHdr{");
        sb.append("Prty='").append(Prty).append('\'');
        sb.append(", xmlns='").append(xmlns).append('\'');
        sb.append(", CreDt='").append(CreDt).append('\'');
        sb.append(", MsgDefIdr='").append(MsgDefIdr).append('\'');
        sb.append(", BizMsgIdr='").append(BizMsgIdr).append('\'');
        sb.append(", Amt=").append(Amt);
        sb.append(", To=").append(To);
        sb.append(", Fr=").append(Fr);
        sb.append(", BizSvc='").append(BizSvc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
