package projetobcdd;

import javax.swing.JOptionPane;

public class Portal_Doador extends javax.swing.JFrame {

    public Portal_Doador() {
        initComponents();
         qtPacientes();
         doacoesPossiveis();
         totalDoacoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_qtPacientes = new javax.swing.JLabel();
        lb_doacoesPossiveis = new javax.swing.JLabel();
        lb_totalDoacoes = new javax.swing.JLabel();
        bt_adcDoacao = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Portal do Doador");

        lb_qtPacientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_qtPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_qtPacientes.setText("Quantidade de pacientes possíveis:");

        lb_doacoesPossiveis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_doacoesPossiveis.setText("Número de doações possíveis esse ano:");

        lb_totalDoacoes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_totalDoacoes.setText("Total de doações:");

        bt_adcDoacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_adcDoacao.setText("Adicionar Doação");
        bt_adcDoacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_adcDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adcDoacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 561, Short.MAX_VALUE))
                    .addComponent(lb_qtPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_doacoesPossiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_totalDoacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_adcDoacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_qtPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_doacoesPossiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_totalDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_adcDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // EVENTO ACIONADO QUANDO O BOTAO DE VOLTAR É CLICADO
        new Menu().setVisible(true);
        dispose();
    }                                        
    
    private void qtPacientes(){
    try{
        int pacientes = 0;
        //consultar no banco a quantidade de pacientes disponíveis pelo tipo sanguineo e adicionar em pacientes
        lb_qtPacientes.setText("Quantidade de pacientes possíveis: " + pacientes);
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro desconhecido ao consultar pacientes disponíveis!", null, JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void doacoesPossiveis(){
        try{
            int doacoesP = 3;
            //consultar no banco de dados se a pessoa é do sexo fem ou masc e as datas de doaçao.
            //adicionar ou diminuir na variavel doacoesP
            
            lb_doacoesPossiveis.setText("Número de doações possíveis esse ano: " + doacoesP);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao consultar doações possíveis!", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void totalDoacoes(){
        try{
            int doacoes = 0;
            //consultar no banco o historico de doações da pessoa, quantas vezes ela já doou no total
            //adicionar na variável doacoes
            
            lb_totalDoacoes.setText("Total de doações: " + doacoes);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao consultar total de doações!", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    private void bt_adcDoacaoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //evento que será chamado quando o botão "adicionar doação" for clicado.

        try{
            //ao clicar, pegar a data atual (classe calendar) e salvar no banco a data, adicionando mais uma doação.
            //ooooooou outra forma de pegar a data??
            JOptionPane.showMessageDialog(null, "Doação salva com sucesso!");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao adicionar doação!", null, JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Portal_Doador portalDoador = new Portal_Doador();
                portalDoador.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_adcDoacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_doacoesPossiveis;
    private javax.swing.JLabel lb_qtPacientes;
    private javax.swing.JLabel lb_totalDoacoes;
    // End of variables declaration                   
}
