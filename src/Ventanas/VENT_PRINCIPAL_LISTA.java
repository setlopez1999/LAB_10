package Ventanas;

import Entidades.ELECTRODOMESTICOS;
import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author SetLopez1999
 */
public class VENT_PRINCIPAL_LISTA extends javax.swing.JFrame {

    List<ELECTRODOMESTICOS> electrodomesticosLista = new ArrayList<>();
    DefaultListModel modelo = new DefaultListModel();
    
    public VENT_PRINCIPAL_LISTA() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }

    public void agregar(ELECTRODOMESTICOS aparato){
        electrodomesticosLista.add(aparato);
    }
    public void quitar(){
        if(lstArtefactos.getSelectedIndex() != -1){
            electrodomesticosLista.remove(lstArtefactos.getSelectedIndex());
            actualizarmodelo();
        }
    }
    public void actualizarmodelo(){
        this.modelo = new DefaultListModel();
        for(int i = 0;i< electrodomesticosLista.size();i++){
            String artefacto = electrodomesticosLista.get(i).NombreDelRegistro();
            modelo.addElement(artefacto);
        }
        lstArtefactos.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAPlancha = new javax.swing.JButton();
        btnALicuadora = new javax.swing.JButton();
        btnAWaflera = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArtefactos = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAPlancha.setBackground(new java.awt.Color(0, 204, 102));
        btnAPlancha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAPlancha.setForeground(new java.awt.Color(255, 255, 255));
        btnAPlancha.setText("Agregar Plancha");
        btnAPlancha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAPlanchaMouseClicked(evt);
            }
        });

        btnALicuadora.setBackground(new java.awt.Color(255, 204, 0));
        btnALicuadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnALicuadora.setForeground(new java.awt.Color(255, 255, 255));
        btnALicuadora.setText("Agregar Licuadora");
        btnALicuadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALicuadoraMouseClicked(evt);
            }
        });

        btnAWaflera.setBackground(new java.awt.Color(0, 204, 204));
        btnAWaflera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAWaflera.setForeground(new java.awt.Color(255, 255, 255));
        btnAWaflera.setText("Agregar Wafflera");
        btnAWaflera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAWafleraMouseClicked(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        lstArtefactos.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstArtefactos);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELECTRODOMESTICOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 370, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 260, 60));

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("by Set Carlos Lopez Quispe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAPlancha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnALicuadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAWaflera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAPlancha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnALicuadora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAWaflera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAPlanchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAPlanchaMouseClicked
        // Abrimos la ventana
        VENT_PLANCHA vent = new VENT_PLANCHA(this);
        this.dispose();
    }//GEN-LAST:event_btnAPlanchaMouseClicked

    private void btnALicuadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALicuadoraMouseClicked
        // TODO add your handling code here:
        VENT_LICUADORA vent = new VENT_LICUADORA(this);
        this.dispose();
    }//GEN-LAST:event_btnALicuadoraMouseClicked

    private void btnAWafleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAWafleraMouseClicked
        // TODO add your handling code here:
        VENT_WAFLERA vent = new VENT_WAFLERA(this);
        this.dispose();
    }//GEN-LAST:event_btnAWafleraMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        quitar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALicuadora;
    private javax.swing.JButton btnAPlancha;
    private javax.swing.JButton btnAWaflera;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstArtefactos;
    // End of variables declaration//GEN-END:variables
}
