package DOCgenerator;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

import Product.product;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

public class genDoc {
    public genDoc(String FURNIZOR,
                     String SEDIUL,
                         String JUD,
                             String BANCA1,
                                 String CUMPARATOR,
                                   String SEDIULprop,
                                     String JUDprop,
                                         String BANCAprop,
                                int C_I_F1,
                           String I_B_A_N,
                        int nrFACT,
                     int nrAVIZ,
                         int nrORDIN,
                             int C_I_F2P,
                                 String I_B_A_N_prop,
                                     double CapitalSOCIAL,
                                                ArrayList<product> listaProduse)
    {
          try{
                XWPFDocument doc = new XWPFDocument();
                FileOutputStream ff = new FileOutputStream(new File("Factura.docx"));
                XWPFParagraph serieNRp = doc.createParagraph();
                XWPFRun serieNRrun = serieNRp.createRun();
                serieNRp.setAlignment(ParagraphAlignment.RIGHT);
                serieNRrun.setText("Seria     nr       ");

                XWPFParagraph titlu = doc.createParagraph();
                XWPFRun titlurun = titlu.createRun();
                titlurun.setText("FACTURA");
                titlu.setAlignment(ParagraphAlignment.CENTER);
                titlurun.setFontSize(20);
                titlurun.addBreak();
                //MID
                XWPFParagraph nrFacturii = doc.createParagraph();
                XWPFRun nrFacturiiRun = nrFacturii.createRun();
                nrFacturii.setAlignment(ParagraphAlignment.CENTER);
                nrFacturiiRun.setText("nr.Facturii "+nrFACT);
                nrFacturiiRun.setFontSize(8);
                nrFacturiiRun.addBreak();

                XWPFParagraph data = doc.createParagraph();
                XWPFRun dataRun = data.createRun();
                data.setAlignment(ParagraphAlignment.CENTER);
                dataRun.setFontSize(8);
                dataRun.setText("Data "+String.valueOf(new Date()));
                dataRun.addBreak();

                XWPFParagraph nrAviz = doc.createParagraph();
                XWPFRun nrAvizRun = nrAviz.createRun();
                nrAviz.setAlignment(ParagraphAlignment.CENTER);
                nrAvizRun.setText("nr.Aviz "+nrAVIZ);
                nrAvizRun.setFontSize(8);
                nrAvizRun.addBreak();

                //rand1
                XWPFParagraph furnziorP  = doc.createParagraph();
                XWPFRun furnizorRun = furnziorP.createRun();
                furnziorP.setAlignment(ParagraphAlignment.LEFT);
                furnizorRun.setText("Furnizor-> "+FURNIZOR);
                furnizorRun.setFontSize(8);

                XWPFParagraph cumparatorP = doc.createParagraph();
                XWPFRun cumparatorRun = cumparatorP.createRun();
                cumparatorP.setAlignment(ParagraphAlignment.RIGHT);
                cumparatorRun.setText("Cumparator->"+CUMPARATOR);
                cumparatorRun.setFontSize(8);

                //rand2
                XWPFParagraph nrOrdP = doc.createParagraph();
                XWPFRun nrOrdRun = nrOrdP.createRun();
                nrOrdP.setAlignment(ParagraphAlignment.LEFT);
                nrOrdRun.setText("Nr.Ord.reg.com./an->"+nrORDIN);
                nrOrdRun.setFontSize(8);

                XWPFParagraph nrOrd2P = doc.createParagraph();
                XWPFRun nrOrd2Run = nrOrd2P.createRun();
                nrOrd2P.setAlignment(ParagraphAlignment.RIGHT);
                nrOrd2Run.setText("Nr.Ord.Registru->         .");
                nrOrd2Run.setFontSize(8);
                //rand 3
                XWPFParagraph CIFp1 = doc.createParagraph();
                XWPFRun CIFp1Run = CIFp1.createRun();
                CIFp1.setAlignment(ParagraphAlignment.LEFT);
                CIFp1Run.setText("C.I.F "+C_I_F1);
                CIFp1Run.setFontSize(8);

                XWPFParagraph CIFp2 = doc.createParagraph();
                XWPFRun CIFp2Run = CIFp2.createRun();
                CIFp2.setAlignment(ParagraphAlignment.RIGHT);
                CIFp2Run.setText("C.I.F "+C_I_F2P);
                CIFp2Run.setFontSize(8);
                //rand 4
                XWPFParagraph capitalSocP = doc.createParagraph();
                XWPFRun capitalSocRun = capitalSocP.createRun();
                capitalSocP.setAlignment(ParagraphAlignment.LEFT);
                capitalSocRun.setText("Capital social "+CapitalSOCIAL);
                capitalSocRun.setFontSize(8);
                capitalSocRun.addBreak();

                //rand5
                XWPFParagraph sediul1p = doc.createParagraph();
                XWPFRun sediul1Run = sediul1p.createRun();
                sediul1p.setAlignment(ParagraphAlignment.LEFT);
                sediul1Run.setText("Sediul "+SEDIUL);
                sediul1Run.setFontSize(8);

                XWPFParagraph sediul2p = doc.createParagraph();
                XWPFRun sediul2Run = sediul2p.createRun();
                sediul2p.setAlignment(ParagraphAlignment.RIGHT);
                sediul2Run.setFontSize(8);
                sediul2Run.setText("Sediul "+SEDIULprop);

                //rand6
                XWPFParagraph judetul1p = doc.createParagraph();
                XWPFRun judetul1Run = judetul1p.createRun();
                judetul1p.setAlignment(ParagraphAlignment.LEFT);
                judetul1Run.setText("Judetul "+JUD);
                judetul1Run.setFontSize(8);

                XWPFParagraph judetul2p = doc.createParagraph();
                XWPFRun judetul2Run = judetul2p.createRun();
                judetul2p.setAlignment(ParagraphAlignment.RIGHT);
                judetul2Run.setFontSize(8);
                judetul2Run.setText("Judetul "+JUDprop);

                //rand7
                XWPFParagraph IBAN1p = doc.createParagraph();
                XWPFRun IBAN1Run = IBAN1p.createRun();
                IBAN1p.setAlignment(ParagraphAlignment.LEFT);
                IBAN1Run.setFontSize(8);
                IBAN1Run.setText("I.B.A.N "+I_B_A_N);

                XWPFParagraph IBAN2p = doc.createParagraph();
                XWPFRun IBAN2Run = IBAN2p.createRun();
                IBAN2p.setAlignment(ParagraphAlignment.RIGHT);
                IBAN2Run.setText("I.B.A.N "+I_B_A_N_prop);
                IBAN2Run.setFontSize(8);

                //rand8
                XWPFParagraph banca1p = doc.createParagraph();
                XWPFRun banca1Run = banca1p.createRun();
                banca1p.setAlignment(ParagraphAlignment.LEFT);
                banca1Run.setText("Banca "+BANCA1);
                banca1Run.setFontSize(8);

                XWPFParagraph banca2p = doc.createParagraph();
                XWPFRun banca2Run = banca2p.createRun();
                banca2p.setAlignment(ParagraphAlignment.RIGHT);
                banca2Run.setFontSize(8);
                banca2Run.setText("Banca "+BANCAprop);
                banca2Run.addBreak();

                //table
                XWPFTable productTable = doc.createTable();
                XWPFTableRow firstRow = productTable.createRow();
                firstRow.addNewTableCell().setText("Nr.Crt");
                firstRow.addNewTableCell().setText("Denumirea Produselor\nsau a servicilor");
                firstRow.addNewTableCell().setText("U.M");
                firstRow.addNewTableCell().setText("Cantitate");
                firstRow.addNewTableCell().setText("Pretul Unitar\n-lei-");
                firstRow.addNewTableCell().setText("Valoare\n-lei-");
                for(int i=0;i<listaProduse.size();i++)
                {
                      XWPFTableRow newRow = productTable.createRow();
                      newRow.addNewTableCell().setText(String.valueOf(i+1));
                      newRow.addNewTableCell().setText(String.valueOf(listaProduse.get(i).denumireProdus));
                      newRow.addNewTableCell().setText(String.valueOf(listaProduse.get(i).UM));
                      newRow.addNewTableCell().setText(String.valueOf(listaProduse.get(i).cantitate));
                      newRow.addNewTableCell().setText(String.valueOf(listaProduse.get(i).pretUnitar));
                      newRow.addNewTableCell().setText(String.valueOf(listaProduse.get(i).valLei));
                }

                CTTbl table = productTable.getCTTbl();
                CTTblPr pr  = productTable.getCTTbl().getTblPr();
                CTTblWidth tblW = pr.getTblW();
                tblW.setW(BigInteger.valueOf(5000));
                tblW.setType(STTblWidth.PCT);
                pr.setTblW(tblW);
                table.setTblPr(pr);
                //antet


                doc.write(ff);
                ff.close();
          }catch (Exception e)
          {

          }
    }
}
