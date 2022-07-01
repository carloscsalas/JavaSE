package com.exercises.javase.pasexml;

public class MainXmlList {

    public static void main(String[] args) {

        String xmlList = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.053.001.08\">\n" +
                "\t\t\t\t\t<BkToCstmrStmt>\n" +
                "\t\t\t\t\t\t<GrpHdr>\n" +
                "\t\t\t\t\t\t\t<MsgId>cmt053bizmsgidr-001</MsgId>\n" +
                "\t\t\t\t\t\t\t<CreDtTm>2020-08-06T10:00:47+09:00</CreDtTm>\n" +
                "\t\t\t\t\t\t</GrpHdr>\n" +
                "\t\t\t\t\t\t<Stmt>\n" +
                "\t\t\t\t\t\t\t<Id>100-01</Id>\n" +
                "\t\t\t\t\t\t\t<ElctrncSeqNb>1 </ElctrncSeqNb>\n" +
                "\t\t\t\t\t\t\t<StmtPgntn>\n" +
                "\t\t\t\t\t\t\t\t<PgNb>1</PgNb>\n" +
                "\t\t\t\t\t\t\t\t<LastPgInd>true</LastPgInd>\n" +
                "\t\t\t\t\t\t\t</StmtPgntn>\n" +
                "\t\t\t\t\t\t\t<Acct>\n" +
                "\t\t\t\t\t\t\t\t<Id>\n" +
                "\t\t\t\t\t\t\t\t\t<Othr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Id>DS654787ACT</Id>\n" +
                "\t\t\t\t\t\t\t\t\t</Othr>\n" +
                "\t\t\t\t\t\t\t\t</Id>\n" +
                "\t\t\t\t\t\t\t<Ccy>JPY</Ccy>\n" +
                "\t\t\t\t\t\t\t</Acct>\n" +
                "\t\t\t\t\t\t\t<Bal>\n" +
                "\t\t\t\t\t\t\t\t<Tp>\n" +
                "\t\t\t\t\t\t\t\t\t<CdOrPrtry>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Cd>OPBD</Cd>\n" +
                "\t\t\t\t\t\t\t\t\t</CdOrPrtry>\n" +
                "\t\t\t\t\t\t\t\t</Tp>\n" +
                "\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">5478456</Amt>\n" +
                "\t\t\t\t\t\t\t\t<CdtDbtInd>CRDT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t<Dt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</Dt>\n" +
                "\t\t\t\t\t\t\t</Bal>\n" +
                "\t\t\t\t\t\t\t<Bal>\n" +
                "\t\t\t\t\t\t\t\t<Tp>\n" +
                "\t\t\t\t\t\t\t\t\t<CdOrPrtry>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Cd>CLBD</Cd>\n" +
                "\t\t\t\t\t\t\t\t\t</CdOrPrtry>\n" +
                "\t\t\t\t\t\t\t\t\t<SubTp>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Cd>INTM</Cd>\n" +
                "\t\t\t\t\t\t\t\t\t</SubTp>\n" +
                "\t\t\t\t\t\t\t\t</Tp>\n" +
                "\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">5478456</Amt>\n" +
                "\t\t\t\t\t\t\t\t<CdtDbtInd>CRDT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t<Dt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</Dt>\n" +
                "\t\t\t\t\t\t\t</Bal>\n" +
                "\t\t\t\t\t\t\t<Ntry>\n" +
                "\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">1654886600</Amt>\n" +
                "\t\t\t\t\t\t\t\t<CdtDbtInd>DBIT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t<Sts>\n" +
                "\t\t\t\t\t\t\t\t\t<Cd>BOOK</Cd>\n" +
                "\t\t\t\t\t\t\t\t</Sts>\n" +
                "\t\t\t\t\t\t\t\t<BookgDt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</BookgDt>\n" +
                "\t\t\t\t\t\t\t\t<ValDt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</ValDt>\n" +
                "\t\t\t\t\t\t\t\t<AcctSvcrRef>HSBCREF-125646</AcctSvcrRef>\n" +
                "\t\t\t\t\t\t\t\t<BkTxCd>\n" +
                "\t\t\t\t\t\t\t\t\t<Prtry>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Cd>TXCD</Cd>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Issr>ABANK</Issr>\n" +
                "\t\t\t\t\t\t\t\t\t</Prtry>\n" +
                "\t\t\t\t\t\t\t\t</BkTxCd>\n" +
                "\t\t\t\t\t\t\t\t<NtryDtls>\n" +
                "\t\t\t\t\t\t\t\t\t<TxDtls>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Refs>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<AcctSvcrRef>HSBCREF-125646</AcctSvcrRef>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<EndToEndId>pacs008EndToEndId-001</EndToEndId>\n" +
                "\t\t\t\t\t\t\t\t\t\t</Refs>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">1654886600</Amt>\n" +
                "\t\t\t\t\t\t\t\t\t\t<CdtDbtInd>CRDT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t\t</TxDtls>\n" +
                "\t\t\t\t\t\t\t\t</NtryDtls>\n" +
                "\t\t\t\t\t\t\t</Ntry>\n" +
                "\t\t\t\t\t\t\t<Ntry>\n" +
                "\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">886600</Amt>\n" +
                "\t\t\t\t\t\t\t\t<CdtDbtInd>DBIT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t<Sts>\n" +
                "\t\t\t\t\t\t\t\t\t<Cd>BOOK</Cd>\n" +
                "\t\t\t\t\t\t\t\t</Sts>\n" +
                "\t\t\t\t\t\t\t\t<BookgDt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</BookgDt>\n" +
                "\t\t\t\t\t\t\t\t<ValDt>\n" +
                "\t\t\t\t\t\t\t\t\t<Dt>2020-08-06</Dt>\n" +
                "\t\t\t\t\t\t\t\t</ValDt>\n" +
                "\t\t\t\t\t\t\t\t<AcctSvcrRef>HSBCREF-125646</AcctSvcrRef>\n" +
                "\t\t\t\t\t\t\t\t<BkTxCd>\n" +
                "\t\t\t\t\t\t\t\t\t<Prtry>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Cd>TXCD</Cd>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Issr>ABANK</Issr>\n" +
                "\t\t\t\t\t\t\t\t\t</Prtry>\n" +
                "\t\t\t\t\t\t\t\t</BkTxCd>\n" +
                "\t\t\t\t\t\t\t\t<NtryDtls>\n" +
                "\t\t\t\t\t\t\t\t\t<TxDtls>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Refs>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<AcctSvcrRef>HSBCREF-125646</AcctSvcrRef>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<EndToEndId>pacs008-001</EndToEndId>\n" +
                "\t\t\t\t\t\t\t\t\t\t</Refs>\n" +
                "\t\t\t\t\t\t\t\t\t\t<Amt Ccy=\"JPY\">1654886600</Amt>\n" +
                "\t\t\t\t\t\t\t\t\t\t<CdtDbtInd>CRDT</CdtDbtInd>\n" +
                "\t\t\t\t\t\t\t\t\t</TxDtls>\n" +
                "\t\t\t\t\t\t\t\t</NtryDtls>\n" +
                "\t\t\t\t\t\t\t</Ntry>\n" +
                "\t\t\t\t\t\t</Stmt>\n" +
                "\t\t\t\t\t</BkToCstmrStmt>\n" +
                "\t\t\t\t</Document>";



    }
}
