package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class implementGUI implements ActionListener {
    protected JFrame mainFrame = new JFrame();
    protected JPanel mainPanel = new JPanel();
    protected JTextField furnizor = new JTextField();
    protected JTextField CIF = new JTextField();
    protected JTextField capitalSocial = new JTextField();
    protected JTextField sediul = new JTextField();
    protected JTextField judetul = new JTextField();
    protected JTextField IBAN = new JTextField();
    protected JTextField banca = new JTextField();
    protected JTextField nrFacturii = new JTextField();
    //data , se va genera mereu data curenta si ora la emiterea facturii
    protected JTextField nrAviz =  new JTextField();
    protected JTextField cumparator = new JTextField();
    protected JTextField nrOrdin = new JTextField();
    protected JTextField CIFproprietar = new JTextField();
    protected JTextField Sediul = new JTextField();
    protected JTextField Judetul = new JTextField();
    protected JTextField IBANfirma = new JTextField();
    protected JTextField bancaApr = new JTextField();
    protected JButton continua = new JButton("Continua");

    //partejos

    protected JTextField denumireProdus = new JTextField();
    protected JTextField UM = new JTextField();
    protected JTextField cantitate = new JTextField();
    protected JTextField pretulUnitar = new JTextField();
    protected JTextField valoareLei = new JTextField();
    //label cu denumirea nr crt , denumirea produselor , um ,cantitate ,pret unitar , valoare lei
    protected int totalWaccize = 0;
    protected int nrCrt=0;
    protected JButton adaugaProdus = new JButton("Adauga");
    protected JButton generateFACT = new JButton("Genereaza");
    protected JFrame secondFrame = new JFrame();
    protected JPanel secondPanel = new JPanel();
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
    public void createSecondFP()
    {
        mainFrame.setVisible(false);
        secondFrame.setSize(500,500);
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setLocationRelativeTo(null);
        secondPanel.setLayout(null);
        secondFrame.setVisible(true);
        secondFrame.add(secondPanel);
        //
        JLabel denumireProdusLB = new JLabel("Denumire Produs");
        JLabel UMLB = new JLabel("U.M");
        JLabel cantitateLB = new JLabel("Cantitate");
        JLabel pretulUnitarLB = new JLabel("Pretul Unitar");
        JLabel valoareLeiLB = new JLabel("Valoare Lei");
        //
        denumireProdusLB.setBounds(170,20,170,30);
        denumireProdus.setBounds(170,45,170,30);
        secondPanel.add(denumireProdusLB);
        secondPanel.add(denumireProdus);

        UMLB.setBounds(170,80,120,30);
        UM.setBounds(170,105,170,30);
        secondPanel.add(UMLB);
        secondPanel.add(UM);

        cantitateLB.setBounds(170,135,120,30);
        cantitate.setBounds(170,165,170,30);
        secondPanel.add(cantitateLB);
        secondPanel.add(cantitate);

        pretulUnitarLB.setBounds(170,195,120,30);
        pretulUnitar.setBounds(170,225,170,30);
        secondPanel.add(pretulUnitarLB);
        secondPanel.add(pretulUnitar);

        valoareLeiLB.setBounds(170,255,170,30);
        valoareLei.setBounds(170,290,170,30);
        secondPanel.add(valoareLeiLB);
        secondPanel.add(valoareLei);

        adaugaProdus.setBounds(130,330,100,30);
        adaugaProdus.addActionListener(this);
        secondPanel.add(adaugaProdus);

        generateFACT.setBounds(260,330,115,30);
        generateFACT.addActionListener(this);
        secondPanel.add(generateFACT);
    }
    public void reset()
    {
        denumireProdus.setText(null);
        UM.setText(null);
        cantitate.setText(null);
        pretulUnitar.setText(null);
        valoareLei.setText(null);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==continua)
        {
            createSecondFP();
        }
        if(actionEvent.getSource()==adaugaProdus)
        {
            reset();
            //add restul in BD
        }
    }
}
