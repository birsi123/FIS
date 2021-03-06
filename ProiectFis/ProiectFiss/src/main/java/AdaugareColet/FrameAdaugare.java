/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaugareColet;
import RidicareSiRetur.RidicareSiRetur;
import java.sql.*;
import javax.swing.JOptionPane;
import CalculRuta.RutaMinima.*;
/**
 *
 * @author Andrei
 */

class Clienti
{
  private int nrColet;
  private String NumeExped;
  private String TelefonExped;
  private String AdresaExped;
  private String NumeDest;
  private String TelefonDest;
  private String AdresaDest;
  public Clienti(int nrColet,String NumeExped,String TelefonExped,String AdresaExped,String NumeDest,String TelefonDest,String AdresaDest)
  {
      this.nrColet=nrColet;
      this.NumeExped=NumeExped;
      this.TelefonExped=TelefonExped;
      this.AdresaExped=AdresaExped;
      this.NumeDest=NumeDest;
      this.TelefonDest=TelefonDest;
      this.AdresaDest=AdresaDest;
  }
  public int getnrColet()
  {
      return nrColet;
  }
  public String getNumeExped()
  {
      return NumeExped;
  }
  public String getTelefonExped()
  {
      return TelefonExped;
  }
  public String getAdresaExped()
  {
      return AdresaExped;
  }
  public String getNumeDest()
  {
      return NumeDest;
  }
  public String getAdresaDest()
  {
      return AdresaDest;
  }
  public String getTelefonDesst()
  {
      return TelefonDest;
  }
    public void setnrColet(int n)
  {
      nrColet=n;
  }
  public void setNumeExped(String s)
  {
      NumeExped=s;
  }
  public void setTelefonExped(String s)
  {
      TelefonExped=s;
  }
  public void setAdresaExped(String s)
  {
      AdresaExped=s;
  }
  public void setNumeDest(String s)
  {
      NumeDest=s;
  }
  public void setAdresaDest(String s)
  {
      AdresaDest=s;
  }
  public void setTelefonDesst(String s)
  {
      TelefonDest=s;
  }
  
}
class Comenzi
{
    private int NrColet;
    private String Sursa;
    private String Destinatie;
    private String Categorie;
    private String Status;
    private float pret;
    private int greutate;
    public Comenzi(int NrColet,String Sursa,String Destinatie,String Categorie,String Status,float pret,int greutate)
    {
        this.NrColet=NrColet;
        this.Sursa=Sursa;
        this.Destinatie=Destinatie;
        this.Categorie=Categorie;
        this.Status=Status;
        this.pret=pret;
        this.greutate=greutate;
    }
     public int getnrColet()
  {
      return NrColet;
  }
  public String getSursa()
  {
      return Sursa;
  }
  public String getDestinatie()
  {
      return Destinatie;
  }
  public String getCategorie()
  {
      return Categorie;
  }
  public String getStatus()
  {
      return Status;
  }
  public float getpret()
  {
      return pret;
  }
  public int getGreutate()
  {
      return greutate;
  }
    public void setnrColet(int n)
  {
      NrColet=n;
  }
  public void getSursa(String s)
  {
      Sursa=s;
  }
  public void getDestinatie(String s)
  {
      Destinatie=s;
  }
  public void getCategorie(String s)
  {
      Categorie=s;
  }
  public void getStatus(String s)
  {
      Status=s;
  }
  public void getPret(float p)
  {
      pret=p;
  }
  public void getGreutate(int g)
  {
      greutate=g;
  }
    
}
public class FrameAdaugare extends javax.swing.JFrame {
    
/*public String getSursa()
        {    
        return Sursa.getText();
        }
public String getDestinatie()
{
    return Destinatie.getText();
}
public String getGreutate()
{
    return Greutate.getText();
}
public int getTip()
{
    return TipColet.getSelectedIndex();
}*/
public void clearData(){
    NumeExp.setText("");
    NumeDest.setText("");
    Sursa.setText("");
    Destinatie.setText("");
    Greutate.setText("");
    Pret.setText("");
    TelefonExp.setText("");
    TelefonDest.setText("");
    AdresaExp.setText("");
    AdresaDest.setText("");
    TelefonExp.setText("");
    TelefonDest.setText("");
    NrColet.setText("");
    TipColet.setSelectedIndex(0);
    DistantaE.setText("");
    
}
    /**
     * Creates new form FrameAdaugare
     */
    public FrameAdaugare() {
        initComponents();
        jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeExp = new javax.swing.JTextField();
        AdresaExp = new javax.swing.JTextField();
        TelefonExp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Greutate = new javax.swing.JTextField();
        Pret = new javax.swing.JTextField();
        TipColet = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NumeDest = new javax.swing.JTextField();
        AdresaDest = new javax.swing.JTextField();
        TelefonDest = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Sursa = new javax.swing.JTextField();
        Destinatie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lala = new javax.swing.JLabel();
        NrColet = new javax.swing.JTextField();
        SchimbareModul = new javax.swing.JButton();
        DistantaE = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Informatii Expeditor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nume Expeditor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Adresa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefon");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Informatii Colet");

        jLabel6.setText("Greutate");

        jLabel7.setText("Pret");

        TipColet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fara Conditii/Fragil", "Pretios", "Periculos" }));

        jLabel8.setText("Tip Colet");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("InformatiI Destinatar");

        NumeDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeDestActionPerformed(evt);
            }
        });

        AdresaDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdresaDestActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nume Destinatar");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Adresa ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Telefon");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Adaugare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculare pret si distanta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Sursa");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Destinatie");

        lala.setText("Numar Colet");

        SchimbareModul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SchimbareModul.setText("Modul Ridicare/Retur");
        SchimbareModul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchimbareModulActionPerformed(evt);
            }
        });

        jLabel16.setText("Distanta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lala)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Greutate, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(Pret, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(NrColet, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(DistantaE))
                                            .addComponent(TipColet, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AdresaExp)
                            .addComponent(TelefonExp)
                            .addComponent(NumeExp)
                            .addComponent(Sursa, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AdresaDest, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(NumeDest, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Destinatie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(TelefonDest, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(117, 117, 117))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SchimbareModul))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(NumeDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdresaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Sursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(AdresaDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destinatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TipColet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Greutate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Pret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistantaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lala, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NrColet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(SchimbareModul))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeDestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeDestActionPerformed

    private void AdresaDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdresaDestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdresaDestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         int input = JOptionPane.showConfirmDialog(null,"Informatii comanda: \n" +"Pret: "+ Pret.getText()+ "\n" + "Distanta: "+ DistantaE.getText()+ "\n" + "Sunteti sigur ca vreti sa faceti aceasta comanda?");
         //0-da,1-nu,2-cancel
         if(input==0)
         {
        try{
           
        String url = "jdbc:mysql://localhost:3306/proiectfis";
	PreparedStatement sql;
        PreparedStatement sql1;
        PreparedStatement sql2;
	ResultSet rs;
        String query="INSERT INTO comenzi values(?,?,?,?,?,?,?)";
        String query1="INSERT INTO clienti values (?,?,?,?,?,?,?)";
	Connection con1 = DriverManager.getConnection(url, "root", "Analyst123");
        
	sql = con1.prepareStatement(query);
        sql.setString(1, NrColet.getText());
        sql.setString(2, Sursa.getText());
        sql.setString(3, Destinatie.getText());
        sql.setString(4,  TipColet.getSelectedItem().toString());
        sql.setString(5, "In tranzit");
        sql.setString(6, Pret.getText());
        sql.setString(7, Greutate.getText());
        Comenzi co=new Comenzi(Integer.parseInt(NrColet.getText()),Sursa.getText(),Destinatie.getText(),TipColet.getSelectedItem().toString(),"In tranzit",Float.parseFloat(Pret.getText()),Integer.parseInt(Greutate.getText()));
        
        sql1= con1.prepareStatement(query1);
        sql1.setString(1,NrColet.getText());
        sql1.setString(2,NumeExp.getText());
        sql1.setString(3,TelefonExp.getText());
        sql1.setString(4,AdresaExp.getText());
        sql1.setString(5,NumeDest.getText());
        sql1.setString(6,TelefonDest.getText());
        sql1.setString(7,AdresaDest.getText());  
       Clienti c=new Clienti(Integer.parseInt(NrColet.getText()),NumeExp.getText(),TelefonExp.getText(),AdresaExp.getText(),NumeDest.getText(),TelefonDest.getText(),AdresaDest.getText());
        
        sql.executeUpdate();
        sql1.executeUpdate();
        clearData();
        }
     catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null, ex);
     }
     }
       else
         {
             clearData();
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   /*     float min1=500000;
        String distanta="";
try
{
        String url = "jdbc:mysql://localhost:3306/proiectfis";
        String conditii="";
	Statement sql;
	ResultSet rs;
	Connection con1 = DriverManager.getConnection(url, "root", "Analyst123");
	sql = (Statement) con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	rs = sql.executeQuery("select * from rute");
        rs.next();
        int ok=0;
		do {
                    if(rs.isLast())
                        ok=1;
			if (Sursa.getText().equals(rs.getString("OrasSursa")) && Destinatie.getText().equals(rs.getString("OrasDestinatie"))&& rs.getString("ConditiiTransport").contains(TipColet.getSelectedItem().toString())) {
                            if(Integer.parseInt(rs.getString("Distanta"))<min1)
                                {
                                    min1=Integer.parseInt(rs.getString("Distanta"));
                                    distanta=rs.getString("Distanta");
                                }
                        }
                            rs.next();
                            
                    } while (ok==0);
           if(min1==500000)JOptionPane.showMessageDialog(null,"Nu exista ruta care sa indeplineasca conditiile coletului");
           else
           {
               min1= (float) (min1*0.1);
                if(Integer.parseInt(Greutate.getText())>5)min1=min1+2;
                    else if(Integer.parseInt(Greutate.getText())>10)min1=min1+4;
                if(TipColet.getSelectedIndex()==1)min1=min1+5;
                    else if(TipColet.getSelectedIndex()==2)min1=min1+10;
                    else if(TipColet.getSelectedIndex()==3)min1=min1+15;
           }    
         
    }
    catch(SQLException ex)
    {
         JOptionPane.showMessageDialog(null, ex);
    }
        Pret.setText(String.valueOf(min1));
        DistantaE.setText(distanta);
       
      */
   String[][] mat = new String[20][20];
   String or1;
   String or2;
   String cond;
    CalculRuta.RutaMinima Calculator=new CalculRuta.RutaMinima();
    int dist, poz1 = 0, poz2 = 0;
    int m=7;// numar orase
    int n=8;// numar rute
    String[] orase=new String[]{"Deva","Timisoara","Oradea","Arad","Bucuresti","Cluj","Brasov","test"};
   try{
    String url = "jdbc:mysql://localhost:3306/proiectfis";
    String conditii="";
    Statement sql;
    ResultSet rs;
    Connection con1 = DriverManager.getConnection(url, "root", "Analyst123");
    sql = (Statement) con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    rs = sql.executeQuery("select * from rute");
    rs.next();
        int ok=0;
		do {
                    if(rs.isLast())
                        ok=1;
                    or1=rs.getString("OrasSursa");
                    or2=rs.getString("OrasDestinatie");
                    dist=Integer.parseInt(rs.getString("Distanta"));
                    cond=rs.getString("ConditiiTransport");
                    for(int j=0;j<orase.length;j++) {
                        if(orase[j].contains(or1))poz1 = j;
                        if(orase[j].contains(or2))poz2 = j;
                    }
                    if(cond.contains("Pretios")) {
                       mat[poz1][poz2]= ( "*" + Integer.toString(dist));
                       mat[poz2][poz1]= ("*"+Integer.toString(dist));				
                    }
                    else if(cond.contains("Periculos")) {
                        mat[poz1][poz2]= ("#"+Integer.toString(dist));
                        mat[poz2][poz1]= ("#"+Integer.toString(dist));
                    }
                    else {
                        mat[poz1][poz2]= Integer.toString(dist);
                        mat[poz2][poz1]= Integer.toString(dist);
                    }
                            rs.next();
                    } while (ok==0);
   }
   catch(SQLException ex)
    {
         JOptionPane.showMessageDialog(null, ex);
    }

//or1 = oras1

//or2 = oras2
//dist = dist
//cond = cond
 

    

//String srs = srs din textbox
//String dest = dest din textbox
//conditie = din combobox
    String srs=Sursa.getText();
    String dest=Destinatie.getText();
    int conditie=TipColet.getSelectedIndex();
    int srsp=0;
    int destp=0;
    for(int i=0;i<n;i++) {
            if(srs.equals(orase[i])) srsp=i;
            if(dest.equals(orase[i])) destp = i;  
    }
   Calculator.initializare(n);
   DistantaE.setText(Integer.toString(Calculator.findRoute(mat, m, srsp, destp, conditie)));
   int min1=Integer.parseInt(DistantaE.getText());
   if(min1==50000)JOptionPane.showMessageDialog(null,"Nu exista ruta care sa indeplineasca conditiile coletului");
           else
           {
               min1= (int) (float) (min1*0.1);
                if(Integer.parseInt(Greutate.getText())>5)min1=min1+2;
                    else if(Integer.parseInt(Greutate.getText())>10)min1=min1+4;
                if(TipColet.getSelectedIndex()==1)min1=min1+5;
                    else if(TipColet.getSelectedIndex()==2)min1=min1+10;
           }
    Pret.setText(Integer.toString(min1));
    jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SchimbareModulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchimbareModulActionPerformed
        dispose();
        RidicareSiRetur e=new RidicareSiRetur();
        e.setVisible(true);
    }//GEN-LAST:event_SchimbareModulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAdaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdaugare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdresaDest;
    private javax.swing.JTextField AdresaExp;
    private javax.swing.JTextField Destinatie;
    private javax.swing.JTextField DistantaE;
    private javax.swing.JTextField Greutate;
    private javax.swing.JTextField NrColet;
    private javax.swing.JTextField NumeDest;
    private javax.swing.JTextField NumeExp;
    private javax.swing.JTextField Pret;
    private javax.swing.JButton SchimbareModul;
    private javax.swing.JTextField Sursa;
    private javax.swing.JTextField TelefonDest;
    private javax.swing.JTextField TelefonExp;
    private javax.swing.JComboBox<String> TipColet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lala;
    // End of variables declaration//GEN-END:variables
}
