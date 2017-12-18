package projetobcdd;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_consultar = new javax.swing.JButton();
        bt_pdoador = new javax.swing.JButton();
        bt_ppaciente = new javax.swing.JButton();
        bt_atualizar = new javax.swing.JButton();
        bt_deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.pink);
        setPreferredSize(new java.awt.Dimension(652, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu");

        bt_consultar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_consultar.setText("Consultar Dados");
        bt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarActionPerformed(evt);
            }
        });

        bt_pdoador.setBackground(new java.awt.Color(255, 204, 204));
        bt_pdoador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_pdoador.setText("Portal do Doador");
        bt_pdoador.setPreferredSize(new java.awt.Dimension(114, 60));
        bt_pdoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pdoadorActionPerformed(evt);
            }
        });

        bt_ppaciente.setBackground(new java.awt.Color(255, 204, 204));
        bt_ppaciente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_ppaciente.setText("Portal do Paciente");
        bt_ppaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ppacienteActionPerformed(evt);
            }
        });

        bt_atualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_atualizar.setText("Atualizar Dados");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });

        bt_deletar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_deletar.setText("Deletar Conta");
        bt_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_ppaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_pdoador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_pdoador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_ppaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarActionPerformed
        // inserir conexão com o banco de dados aqui.
        //consultar e retornar todos os dados na janela Consulta.
        new Consulta().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_consultarActionPerformed

    private void bt_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deletarActionPerformed
        // inserir conexao com o banco de dados aqui.
        //deletar dados da pessoa do banco de dados.
        
        try{
            //deletar dados
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
            new Inicio().setVisible(true);
            dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao deletar sua conta!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_deletarActionPerformed

    private void bt_pdoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pdoadorActionPerformed
        //colocar um if para consultar no banco de dados.
        //se o usuário for um doador, abrir o portal (try) se não, dar erro (catch)
        try{
            new Portal_Doador().setVisible(true);
            dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Você precisa ser um doador para acessar o Portal do Doador!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_pdoadorActionPerformed

    private void bt_ppacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ppacienteActionPerformed
        // inserir aqui a conexão com o banco de dados.
        //se o usuário for um paciente, abrir o portal (try) se não, dar erro (catch)
        try{
            new Portal_Paciente().setVisible(true);
            dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Você precisa ser um paciente para acessar o Portal do Paciente!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_ppacienteActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        // Inserir aqui a conexao com o banco de dados.
        //ir para a tela de cadastro para atualizar os dados
        new Cadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_atualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_consultar;
    private javax.swing.JButton bt_deletar;
    private javax.swing.JButton bt_pdoador;
    private javax.swing.JButton bt_ppaciente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}