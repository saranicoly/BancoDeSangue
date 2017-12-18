package projetobcdd;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        bg_tiposang = new javax.swing.ButtonGroup();
        bg_usuario = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dgt_nome = new javax.swing.JTextField();
        dgt_cpf = new javax.swing.JTextField();
        dgt_nascimento = new javax.swing.JTextField();
        dgt_peso = new javax.swing.JTextField();
        bt_a = new javax.swing.JRadioButton();
        bt_an = new javax.swing.JRadioButton();
        bt_b = new javax.swing.JRadioButton();
        bt_bn = new javax.swing.JRadioButton();
        bt_o = new javax.swing.JRadioButton();
        bt_on = new javax.swing.JRadioButton();
        bt_ab = new javax.swing.JRadioButton();
        bt_abn = new javax.swing.JRadioButton();
        bt_masculino = new javax.swing.JRadioButton();
        bt_feminino = new javax.swing.JRadioButton();
        bt_paciente = new javax.swing.JRadioButton();
        bt_doador = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome Completo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Peso:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo Sanguíneo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tipo de Usuário:");
        jLabel8.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Pronto!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dgt_nascimento.setToolTipText("");

        bg_tiposang.add(bt_a);
        bt_a.setText("A+");

        bg_tiposang.add(bt_an);
        bt_an.setText("A-");

        bg_tiposang.add(bt_b);
        bt_b.setText("B+");

        bg_tiposang.add(bt_bn);
        bt_bn.setText("B-");

        bg_tiposang.add(bt_o);
        bt_o.setText("O+");

        bg_tiposang.add(bt_on);
        bt_on.setText("O-");

        bg_tiposang.add(bt_ab);
        bt_ab.setText("AB+");

        bg_tiposang.add(bt_abn);
        bt_abn.setText("AB-");

        bg_sexo.add(bt_masculino);
        bt_masculino.setText("Masculino");

        bg_sexo.add(bt_feminino);
        bt_feminino.setText("Feminino");

        bg_usuario.add(bt_paciente);
        bt_paciente.setText("Paciente");
        bt_paciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_paciente.setMaximumSize(new java.awt.Dimension(67, 29));
        bt_paciente.setMinimumSize(new java.awt.Dimension(67, 29));

        bg_usuario.add(bt_doador);
        bt_doador.setText("Doador");
        bt_doador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_doador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bt_doador.setMaximumSize(new java.awt.Dimension(61, 29));
        bt_doador.setMinimumSize(new java.awt.Dimension(61, 29));

        jLabel9.setText("dd/mm/aaaa");

        jLabel10.setText("KG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(dgt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_masculino)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(bt_a)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_an)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_b)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_bn)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_o)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_on)))
                                .addGap(18, 18, 18)
                                .addComponent(bt_ab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_abn)))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dgt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(bt_feminino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dgt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dgt_nome)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dgt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_masculino)
                        .addComponent(bt_feminino))
                    .addComponent(dgt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dgt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bt_a)
                    .addComponent(bt_an)
                    .addComponent(bt_b)
                    .addComponent(bt_bn)
                    .addComponent(bt_o)
                    .addComponent(bt_on)
                    .addComponent(bt_ab)
                    .addComponent(bt_abn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dgt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_doador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // evento que vai ser iniciado ao clicar no botao pronto!
        try{
            String nome = dgt_nome.getText();
            if (nome.isEmpty()){
                JOptionPane.showMessageDialog(null, "Você precisa inserir um nome!", null, JOptionPane.ERROR_MESSAGE);
            }
            else {
                //inserir no banco de dados o nome da pessoa
            }
            
            long numero_cpf = Long.parseLong(dgt_cpf.getText());
            //cadastrar aqui o cpf da pessoa no banco de dados
            
            if (bt_feminino.isSelected()){
                //colocar no banco de dados que a pessoa é do sexo feminino
            }
            else if (bt_masculino.isSelected()){
                //colocar no banco de dados que a pessoa é do sexo masculino
            }
            else{
                JOptionPane.showMessageDialog(null, "Você precisa inserir um sexo!", null, JOptionPane.ERROR_MESSAGE);
            }
            
            String data_nascimento = dgt_nascimento.getText();
            if (data_nascimento.isEmpty()){
                JOptionPane.showMessageDialog(null, "Você precisa inserir uma data de nascimento!", null, JOptionPane.ERROR_MESSAGE);
            }
            else{
                //colocar a data de nascimento da pessoa no banco de dados
            }
            
            
            int peso = Integer.parseInt(dgt_peso.getText());
            //colocar o peso da pessoa no banco de dados
            
            if (bt_paciente.isSelected()){
                //colocar no banco de dados que a pessoa é paciente
            }
            else if (bt_doador.isSelected()){
                //colocar no banco de dados que a pessoa é doador
            }
            else{
                JOptionPane.showMessageDialog(null, "Você esqueceu de nos informar se é paciente ou doador!", null, JOptionPane.ERROR_MESSAGE);
            }
            
            if (bt_a.isSelected()){
                //colocar no banco de dados o tipo sanguineo A+
            }
            else if (bt_an.isSelected()){
                //colocar no banco de dados o tipo sanguineo A-
            }
            else if (bt_b.isSelected()){
                //colocar no banco de dados o tipo sanguineo B+
            }
            else if (bt_bn.isSelected()){
                //colocar no banco de dados o tipo sanguineo B-
            }
            else if (bt_o.isSelected()){
                //colocar no banco de dados o tipo sanguineo O+
            }
            else if (bt_on.isSelected()){
                //colocar no banco de dados o tipo sanguineo O-
            }
            else if (bt_ab.isSelected()){
                //colocar no banco de dados o tipo sanguineo AB+
            }
            else if (bt_abn.isSelected()){
                //colocar no banco de dados o tipo sanguineo AB-
            }
            else {
                JOptionPane.showMessageDialog(null, "Você esqueceu de nos informar seu tipo sanguíneo!", null, JOptionPane.ERROR_MESSAGE);
            }
            
            new Menu().setVisible(true);
            dispose();
            //finalizar o cadastro no banco de dados e ir para a tela de menuse estiver tudo ok!
        }
        catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, verifique os dados inseridos e tente novamente!", "Erro na validação", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.ButtonGroup bg_tiposang;
    private javax.swing.ButtonGroup bg_usuario;
    private javax.swing.JRadioButton bt_a;
    private javax.swing.JRadioButton bt_ab;
    private javax.swing.JRadioButton bt_abn;
    private javax.swing.JRadioButton bt_an;
    private javax.swing.JRadioButton bt_b;
    private javax.swing.JRadioButton bt_bn;
    private javax.swing.JRadioButton bt_doador;
    private javax.swing.JRadioButton bt_feminino;
    private javax.swing.JRadioButton bt_masculino;
    private javax.swing.JRadioButton bt_o;
    private javax.swing.JRadioButton bt_on;
    private javax.swing.JRadioButton bt_paciente;
    private javax.swing.JTextField dgt_cpf;
    private javax.swing.JTextField dgt_nascimento;
    private javax.swing.JTextField dgt_nome;
    private javax.swing.JTextField dgt_peso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
