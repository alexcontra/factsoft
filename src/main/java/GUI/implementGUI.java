package GUI;
import DOCgenerator.genDoc;
import Product.product;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class implementGUI implements ActionListener {
         JFrame mainFrame = new JFrame();
         JPanel mainPanel = new JPanel();
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
    //partejos
     JTextField denumireProdus = new JTextField();
     JTextField UM = new JTextField();//unitati materiale
     JTextField cantitate = new JTextField();
     JTextField pretulUnitar = new JTextField();
    JTextField valoareLei = new JTextField();
    //label cu denumirea nr crt , denumirea produselor , um ,cantitate ,pret unitar , valoare lei
     int totalWaccize = 0;
    int nrCrt=0;
    JButton adaugaProdus = new JButton("Adauga");
     JButton generateFACT = new JButton("Genereaza");
     JFrame secondFrame = new JFrame();
     JPanel secondPanel = new JPanel();
    JButton backButton = new JButton("Back");
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
        JLabel CIFproprietarLB = new JLabel("C.I.F (*Cumparator*)");
        JLabel SediulLB = new JLabel("Sediu (*Cumparator*)");
        JLabel JudetulLB = new JLabel("Judetul (*Cumparator*)");
        JLabel IBANfirmaLB = new JLabel("IBAN (*Cumparator*)");
        JLabel bancaAprLB = new JLabel("Banca (*Cumparator*)");
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
    public void resetPS()
    {
        furnizor.setText(null);
        sediul.setText(null);
        judetul.setText(null);
        banca.setText(null);
        CIF.setText(null);
        nrFacturii.setText(null);
        nrAviz.setText(null);
        CIFproprietar.setText(null);
        IBANfirma.setText(null);
        capitalSocial.setText(null);
        Judetul.setText(null);
        Sediul.setText(null);
        bancaApr.setText(null);
        IBAN.setText(null);
        cumparator.setText(null);
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

        adaugaProdus.setBounds(115,330,115,30);
        adaugaProdus.addActionListener(this);
        secondPanel.add(adaugaProdus);

        generateFACT.setBounds(260,330,115,30);
        generateFACT.addActionListener(this);
        secondPanel.add(generateFACT);

        backButton.setBounds(180,380,135,30);
        backButton.addActionListener(this);
        secondPanel.add(backButton);
    }
    public void reset()
    {
        denumireProdus.setText(null);
        UM.setText(null);
        cantitate.setText(null);
        pretulUnitar.setText(null);
        valoareLei.setText(null);
    }
     String FURNIZOR ="",SEDIUL="",JUD="",BANCA1="",CUMPARATOR="",SEDIULprop="",JUDprop="",BANCAprop="",I_B_A_N="",I_B_A_N_prop="";
     int C_I_F1=0,nrFACT=0,nrAVIZ=0,nrORDIN=0,C_I_F2P=0, adunapret=0;;
     double CapitalSOCIAL=0.0;
     ArrayList<product> listaProduse = new ArrayList<product>();
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==continua)
        {
            FURNIZOR=furnizor.getText();
            SEDIUL=sediul.getText();
            JUD=judetul.getText();
            BANCA1=banca.getText();
            CUMPARATOR=cumparator.getText();
            SEDIULprop=Sediul.getText();
            JUDprop=Judetul.getText();
            BANCAprop=bancaApr.getText();
            C_I_F1=Integer.parseInt(CIF.getText());
            I_B_A_N=IBAN.getText();
            nrFACT=Integer.parseInt(nrFacturii.getText());
            nrAVIZ=Integer.parseInt(nrAviz.getText());
            nrORDIN=Integer.parseInt(nrOrdin.getText());
            C_I_F2P=Integer.parseInt(CIFproprietar.getText());
            I_B_A_N_prop=IBANfirma.getText();
            CapitalSOCIAL=Double.parseDouble(capitalSocial.getText());
            createSecondFP();
        }
        if(actionEvent.getSource()==adaugaProdus)
        {
            product objNew= new product(denumireProdus.getText(),Integer.parseInt(UM.getText())
                    ,Integer.parseInt(cantitate.getText())
                    ,Double.parseDouble(pretulUnitar.getText()),
                    Double.parseDouble(valoareLei.getText())
                    );
            listaProduse.add(objNew);
            nrCrt=listaProduse.size();
            Iterator<product> ii = listaProduse.iterator();
            while(ii.hasNext())
            {
                product p = ii.next();
                if(!ii.hasNext())
                {
                    adunapret+=p.valLei;
                }
            }
            reset();
            //add restul in BD
        }
        if(actionEvent.getSource()==generateFACT)
        {
            genDoc newfact = new genDoc(FURNIZOR,SEDIUL,JUD,BANCA1,CUMPARATOR,SEDIULprop,JUDprop,BANCAprop,C_I_F1,I_B_A_N,nrFACT,nrAVIZ,nrORDIN,C_I_F2P,I_B_A_N_prop,CapitalSOCIAL);
            reset();
            resetPS();
        }
        if(actionEvent.getSource()==backButton)
        {
            mainFrame.setVisible(true);
            secondFrame.setVisible(false);
        }
    }
}
