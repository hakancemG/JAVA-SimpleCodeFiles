package hakancemgercek.metinfrekans;

public class MetinFrekans extends javax.swing.JFrame {

    /**
     * Creates new form MetinFrekans
     */
    public MetinFrekans() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        kelimeSayisi_label = new javax.swing.JLabel();
        KarakterVeKelimeSayisi_button = new javax.swing.JButton();
        karakterSayisi_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metin_TextArea = new javax.swing.JTextArea();
        ozelKarakter_label = new javax.swing.JLabel();
        ozelKarakter_TextField = new javax.swing.JTextField();
        ozelKelime_label = new javax.swing.JLabel();
        ozelKelime_TextField = new javax.swing.JTextField();
        ozelKarakterSayisi_button = new javax.swing.JButton();
        ozelKelimeSayisi_button = new javax.swing.JButton();
        harfSayisi_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metin Frekans");

        kelimeSayisi_label.setText("Kelime sayısı ");

        KarakterVeKelimeSayisi_button.setText("Göster");
        KarakterVeKelimeSayisi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KarakterVeKelimeSayisi_buttonActionPerformed(evt);
            }
        });

        karakterSayisi_label.setText("Karakter sayısı");

        metin_TextArea.setColumns(20);
        metin_TextArea.setRows(5);
        jScrollPane1.setViewportView(metin_TextArea);

        ozelKarakter_label.setText("Sayısını bulmak istediğiniz özel karakter:");

        ozelKelime_label.setText("Sayısını bulmak istediğiniz özel kelime:");

        ozelKarakterSayisi_button.setText("Göster");
        ozelKarakterSayisi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ozelKarakterSayisi_buttonActionPerformed(evt);
            }
        });

        ozelKelimeSayisi_button.setText("Göster");
        ozelKelimeSayisi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ozelKelimeSayisi_buttonActionPerformed(evt);
            }
        });

        harfSayisi_label.setText("Harf sayısı");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karakterSayisi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KarakterVeKelimeSayisi_button)
                    .addComponent(ozelKarakter_label)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ozelKarakter_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ozelKarakterSayisi_button))
                    .addComponent(ozelKelime_label)
                    .addComponent(ozelKelime_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ozelKelimeSayisi_button)
                    .addComponent(kelimeSayisi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harfSayisi_label))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(kelimeSayisi_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(karakterSayisi_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(harfSayisi_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KarakterVeKelimeSayisi_button)
                        .addGap(10, 10, 10)
                        .addComponent(ozelKarakter_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ozelKarakter_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ozelKarakterSayisi_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ozelKelime_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ozelKelime_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ozelKelimeSayisi_button)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void KarakterVeKelimeSayisi_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
        String metin;
        int kelimeSayisi=0;
        int karakterSayisi=0;
        String metin2;
        String[] metin2_dizi;
        int harfSayisi=0;
                
        metin = metin_TextArea.getText();
        metin2 = metin_TextArea.getText();
        metin2_dizi = metin2.split("[ [,+].+!+?+\"+'+0-9;+\\-+\\++/+*+(+)+^+$+&+{+}+\\[+\\]+=+_+`+>+<+|+:+\\n+@+]");
        for(String metin2_dizi2 : metin2_dizi){
            for(int j=0; j<metin2_dizi2.length(); j++){
                harfSayisi++;
            }
        }
        harfSayisi_label.setText("Harf sayısı: "+harfSayisi);
        for(int i=0; i<metin.length(); i++){
                        
            if(metin.charAt(i) != ' ' && metin.charAt(i) != '\n'){
                karakterSayisi++;
            }
        }
        if(metin.isEmpty()){
            kelimeSayisi_label.setText("Kelime sayısı: 0");
        }
        else{
            String[] kelime_dizi = metin.split("[ [\n][0-9]]");
            for(String kelime_dizi2 : kelime_dizi){
                if(!kelime_dizi2.matches(".*\\d.*||\\w")){
                    kelimeSayisi++;
                }
                //kelimeSayisi++;
            }
            kelimeSayisi_label.setText(String.valueOf("Kelime sayısı: "+kelimeSayisi));
        }
        
        
        karakterSayisi_label.setText(String.valueOf("Karakter sayısı: "+karakterSayisi));
    }                                                             

    private void ozelKarakterSayisi_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        String metin;
        int sayac=0;
        metin = metin_TextArea.getText();
        char ozelKarakter;
        try{
            ozelKarakter = ozelKarakter_TextField.getText().charAt(0);
            for(int i=0; i<metin.length(); i++){
                if(metin.charAt(i)==ozelKarakter){
                    sayac++;
                }
            }
            ozelKarakter_label.setText("Metindeki "+"["+ozelKarakter+"]"+" sayısı: "+sayac);
        }
        catch(StringIndexOutOfBoundsException e){
            ozelKarakter_label.setText("Sayısını bulmak istediğiniz özel karakter:");
        }
        
    }                                                         

    private void ozelKelimeSayisi_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
        String metin;
        String ozelKelime;
        int sayac=0;
        metin = metin_TextArea.getText();
        ozelKelime = ozelKelime_TextField.getText();
        
        if(metin.isEmpty()){
            ozelKelime_label.setText("Sayısını bulmak istediğiniz özel kelime:");
        }
        else{
            String[] ozelKelime_dizi = metin.split("[ [\n]]");
            for(String ozelKelime_dizi2 : ozelKelime_dizi){
                
                if(ozelKelime_dizi2.equals(ozelKelime) || ozelKelime_dizi2.contains(ozelKelime)){
                    sayac++;
                }
                ozelKelime_label.setText("Metindeki "+"["+ozelKelime+"]"+" sayısı: "+sayac);
            }
            
        }
    }                                                       

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
            java.util.logging.Logger.getLogger(MetinFrekans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetinFrekans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetinFrekans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetinFrekans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetinFrekans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton KarakterVeKelimeSayisi_button;
    private javax.swing.JLabel harfSayisi_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel karakterSayisi_label;
    private javax.swing.JLabel kelimeSayisi_label;
    private javax.swing.JTextArea metin_TextArea;
    private javax.swing.JButton ozelKarakterSayisi_button;
    private javax.swing.JTextField ozelKarakter_TextField;
    private javax.swing.JLabel ozelKarakter_label;
    private javax.swing.JButton ozelKelimeSayisi_button;
    private javax.swing.JTextField ozelKelime_TextField;
    private javax.swing.JLabel ozelKelime_label;
    // End of variables declaration                   
}
