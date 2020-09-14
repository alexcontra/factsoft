package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class implementGUI implements ActionListener {
    protected JFrame mainFrame = new JFrame();
    protected JPanel mainPanel = new JPanel();
    public implementGUI()
    {
            mainFrame.setSize(540,650);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.add(mainPanel);
            mainPanel.setLayout(null);
    }
    public void addDataParteSUS()
    {
        JTextField furnizor = new JTextField();
        JTextField CIF = new JTextField();
        JTextField capitalSocial = new JTextField();
        JTextField sediul = new JTextField();
        JTextField judetul = new JTextField();
        JTextField IBAN = new JTextField();
        JTextField banca = new JTextField();
        JTextField nrFacturii = new JTextField();
        //data , se va genera mereu data curenta si ora la emiterea facturii
        JTextField nrAviz =  new JTextField();
        JTextField cumparator = new JTextField();
        JTextField nrOrdin = new JTextField();
        JTextField CIFproprietar = new JTextField();
        JTextField Sediul = new JTextField();
        JTextField Judetul = new JTextField();
        JTextField IBANfirma = new JTextField();
        JTextField bancaApr = new JTextField();
        JButton continua = new JButton("Continua");

        JLabel furnizorLB = new JLabel("Furnizor");
        JLabel CIFLB = new JLabel("C.I.F");
        JLabel capitalSocialLB = new JLabel("Capital Social");
        JLabel sediulLB = new JLabel("Sediu");
        JLabel judetulLB = new JLabel("Judeul");
        JLabel IBANLB = new JLabel("IBAN");
        JLabel bancaLB = new JLabel("Banca");
        JLabel nrFacturiiLB = new JLabel("Nr.Fact");
        //data , se va genera mereu data curenta si ora la emiterea facturii
        JLabel nrAvizLB =  new JLabel("Nr.Aviz");
        JLabel cumparatorLB = new JLabel("Cumparator");
        JLabel nrOrdinLB = new JLabel("Nr.ord");
        JLabel CIFproprietarLB = new JLabel("C.I.F");
        JLabel SediulLB = new JLabel("Sediu");
        JLabel JudetulLB = new JLabel("Judetul");
        JLabel IBANfirmaLB = new JLabel("IBAN");
        JLabel bancaAprLB = new JLabel("Banca");

        //col stanga**
        furnizorLB.setBounds(20,20,120,30);
        furnizor.setBounds(20,45,170,30);
        mainPanel.add(furnizorLB);
        mainPanel.add(furnizor);

        CIFLB.setBounds(20,85,120,30);
        CIF.setBounds(20,110,170,30);
        mainPanel.add(CIF);
        mainPanel.add(CIFLB);

        capitalSocialLB.setBounds(20,150,120,30);
        capitalSocial.setBounds(20,175,170,30);
        mainPanel.add(capitalSocial);
        mainPanel.add(capitalSocialLB);

        sediulLB.setBounds(20,210,120,30);
        sediul.setBounds(20,235,170,30);
        mainPanel.add(sediulLB);
        mainPanel.add(sediul);

        judetulLB.setBounds(20,270,120,30);
        judetul.setBounds(20,295,170,30);
        mainPanel.add(judetulLB);
        mainPanel.add(judetul);

        IBANLB.setBounds(20,330,120,30);
        IBAN.setBounds(20,355,170,30);
        mainPanel.add(IBANLB);
        mainPanel.add(IBAN);

        bancaLB.setBounds(20,390,120,30);
        banca.setBounds(20,415,170,30);
        mainPanel.add(bancaLB);
        mainPanel.add(banca);

        nrFacturiiLB.setBounds(20,450,120,30);
        nrFacturii.setBounds(20,475,170,30);
        mainPanel.add(nrFacturii);
        mainPanel.add(nrFacturiiLB);
        //col stanga***

        //col dreapta**
        //data
        nrAvizLB.setBounds(350,20,120,30);
        nrAviz.setBounds(350,45,170,30);
        mainPanel.add(nrAvizLB);
        mainPanel.add(nrAviz);

        nrOrdinLB.setBounds(350,85,120,30);
        nrOrdin.setBounds(350,110,170,30);
        mainPanel.add(nrOrdinLB);
        mainPanel.add(nrOrdin);

        CIFproprietarLB.setBounds(350,150,120,30);
        CIFproprietar.setBounds(350,175,170,30);
        mainPanel.add(CIFproprietarLB);
        mainPanel.add(CIFproprietar);

        SediulLB.setBounds(350,210,120,30);
        Sediul.setBounds(350,235,170,30);
        mainPanel.add(Sediul);
        mainPanel.add(SediulLB);

        JudetulLB.setBounds(350,270,120,30);
        Judetul.setBounds(350,295,170,30);
        mainPanel.add(Judetul);
        mainPanel.add(JudetulLB);

        IBANfirmaLB.setBounds(350,330,120,30);
        IBANfirma.setBounds(350,355,170,30);
        mainPanel.add(IBANfirmaLB);
        mainPanel.add(IBANfirma);

        cumparatorLB.setBounds(350,390,120,30);
        cumparator.setBounds(350,415,170,30);
        mainPanel.add(cumparatorLB);
        mainPanel.add(cumparator);

        bancaAprLB.setBounds(350,450,120,30);
        bancaApr.setBounds(350,475,170,30);
        mainPanel.add(bancaAprLB);
        mainPanel.add(bancaApr);
        //col dreapta***

        continua.setBounds(209,570,120,30);
        continua.addActionListener(this);
        mainPanel.add(continua);
    }
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
