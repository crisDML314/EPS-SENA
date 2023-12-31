package Vistas;

import Class.RenderTable;
import Controller.MedicamentoController;
import Modelo.Medicamentos;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Admin_AgregarMedicamentos extends javax.swing.JFrame {

    public Admin_AgregarMedicamentos() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(getIconImage());
        showMedicamentos();
    }
// icono JFrame 

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/Logosena.png"));
        return retValue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnvolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicamentos = new javax.swing.JTable();
        btnCrearMedico = new javax.swing.JToggleButton();
        btnRefreshTable = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(218, 234, 247));
        jPanel2.setPreferredSize(new java.awt.Dimension(416, 227));

        jPanel3.setBackground(new java.awt.Color(45, 65, 115));
        jPanel3.setPreferredSize(new java.awt.Dimension(158, 97));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 234, 247));
        jLabel2.setText("EPS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 65, 115));
        jLabel1.setText("SENA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/UserBlanco.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setText("Admin");

        btnvolver.setBackground(new java.awt.Color(218, 234, 247));
        btnvolver.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnvolver.setText("atras");
        btnvolver.setToolTipText("");
        btnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnvolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnvolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 65, 115));
        jLabel5.setText("Ingreso de medicamentos ");

        jTableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medicamento", "Descripcion", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicamentos);
        if (jTableMedicamentos.getColumnModel().getColumnCount() > 0) {
            jTableMedicamentos.getColumnModel().getColumn(0).setResizable(false);
            jTableMedicamentos.getColumnModel().getColumn(1).setResizable(false);
            jTableMedicamentos.getColumnModel().getColumn(2).setResizable(false);
            jTableMedicamentos.getColumnModel().getColumn(3).setResizable(false);
            jTableMedicamentos.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCrearMedico.setBackground(new java.awt.Color(45, 65, 115));
        btnCrearMedico.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnCrearMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearMedico.setText("Crear Medicamento");
        btnCrearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMedicoActionPerformed(evt);
            }
        });

        btnRefreshTable.setBackground(new java.awt.Color(45, 65, 115));
        btnRefreshTable.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnRefreshTable.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTable.setText("refresh");
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCrearMedico)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshTable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        new PerfilAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void jTableMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicamentosMouseClicked
        int column = jTableMedicamentos.getColumnModel().getColumnIndexAtX(evt.getX());
        int rows = evt.getY() / jTableMedicamentos.getRowHeight();
        if (rows < jTableMedicamentos.getRowCount() && rows >= 0 && column < jTableMedicamentos.getColumnCount() && column >= 0) {
            Object value = jTableMedicamentos.getValueAt(rows, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton button = (JButton) value;
                if (button.getName().equals("modificar")) {
                    int data = jTableMedicamentos.getSelectedRow();
                    int Id = (int)jTableMedicamentos.getValueAt(data,0);
                    String Nombre = (String)jTableMedicamentos.getValueAt(data, 1);
                    String Descripcion = (String)jTableMedicamentos.getValueAt(data, 2);
                    Admin_ModificarMedicamentos modificar = new Admin_ModificarMedicamentos();
                    modificar.listarmedicamentos(String.valueOf(Id), Nombre, Descripcion);
                    modificar.setVisible(true);
                }
                if (button.getName().equals("eliminar")) {
                    int data = jTableMedicamentos.getSelectedRow();
                    int Id = (int)jTableMedicamentos.getValueAt(data, 0);
                    int option = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer eliminar este registro?"); 
                    
                    if(option == JOptionPane.YES_OPTION){
                        if(Id > 0){
                            MedicamentoController delet = new MedicamentoController();
                            delet.ValidarDeleteMedicamento(Id);
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Registro no eliminado");
                    }
                }
            }
        }

    }//GEN-LAST:event_jTableMedicamentosMouseClicked

    private void btnCrearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMedicoActionPerformed
        new Admin_CrearMedicamento().setVisible(true);
    }//GEN-LAST:event_btnCrearMedicoActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMedicamentos.getModel();
        int num = model.getRowCount();
        if (num == 0) {
            showMedicamentos();
        } else if (num > 0) {
            model.setRowCount(0);
            showMedicamentos();
        }
    }//GEN-LAST:event_btnRefreshTableActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_AgregarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_AgregarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_AgregarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_AgregarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_AgregarMedicamentos().setVisible(true);
            }
        });
    }
    
    public void showMedicamentos(){
        ArrayList<Medicamentos> list = listarMedicamentos();
        JButton BtnModificar = new JButton("Modificar");
        BtnModificar.setName("modificar");
        JButton BtnEliminar = new JButton("Eliminar");
        BtnEliminar.setName("eliminar");
        try{
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) jTableMedicamentos.getModel();
            Object[] medicametos = new Object[5];
            for(int i = 0; i < list.size();i++){
                medicametos[0] = list.get(i).getId();
                medicametos[1] = list.get(i).getNombre();
                medicametos[2] = list.get(i).getDescripcion();
                medicametos[3] = BtnModificar;
                medicametos[4] = BtnEliminar;
                model.addRow(medicametos);
            }
            jTableMedicamentos.setDefaultRenderer(Object.class, new RenderTable());
            jTableMedicamentos.setModel(model);
            jTableMedicamentos.setRowHeight(40);
            TableColumn columnModificar = jTableMedicamentos.getColumn("Modificar");
            TableColumn columnEliminar = jTableMedicamentos.getColumn("Eliminar");
            columnModificar.setPreferredWidth(50);
            columnEliminar.setPreferredWidth(50);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Medicamentos> listarMedicamentos() {
        ArrayList<Medicamentos> MedicamentosList = new ArrayList<>();
        try {
            MedicamentoController med = new MedicamentoController();
            ResultSet response = med.ListarMedicamento();
            Medicamentos medicamento;
            while (response.next()) {
                medicamento = new Medicamentos(response.getInt("Id"),response.getString("Nombre"),
                response.getString("Descripcion"));
                MedicamentosList.add(medicamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MedicamentosList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCrearMedico;
    private javax.swing.JToggleButton btnRefreshTable;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableMedicamentos;
    // End of variables declaration//GEN-END:variables
}
