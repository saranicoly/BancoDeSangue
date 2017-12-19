package projetobcdd;

import javax.swing.JOptionPane;

public class Portal_Paciente extends javax.swing.JFrame {
    public Portal_Paciente() {
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb_qtDoadores = new javax.swing.JLabel();
        lb_chancesReacao = new javax.swing.JLabel();
        lb_tempoRecuperacao = new javax.swing.JLabel();
        bt_adcTransfusao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Portal do Paciente");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb_qtDoadores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_qtDoadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_qtDoadores.setText("Quantidade de doadores disponíveis:");

        lb_chancesReacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_chancesReacao.setText("Chances de reação:");

        lb_tempoRecuperacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_tempoRecuperacao.setText("Tempo esperado de recuperação:");

        bt_adcTransfusao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_adcTransfusao.setText("Adicionar Transfusão");
        bt_adcTransfusao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_adcTransfusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adcTransfusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_qtDoadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_chancesReacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_tempoRecuperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bt_adcTransfusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_qtDoadores, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_chancesReacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tempoRecuperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_adcTransfusao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }                  
    
    
    private void qtDoadores(){
    try{
    //colocar no lb_qtDoadores a quantidade de doadores disponíveis pelo tipo sanguineo
    //consultar no banco
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro desconhecido ao consultar doadores!", null, JOptionPane.ERROR_MESSAGE);
    }
    }
    
    //lb_chancesReacao 
    private void chancesReacao(){
        try{
            //calcular a partir dos dados cadastrados no banco as chances de reação
            
            /*Fórmula: 
            Se(idade>65 ou idade<10): aumentar 5%
            Se (peso<40kg): aumentar 3%
            Se (ultimaTransfusao foi a menos de 4 meses): aumentar 2%  -----opcional
            
            adicionar (ou nao) na variavel chance
            */
            int chance = 0;
            lb_chancesReacao.setText("Chances de reação " + chance + "%");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao calcular chances de reação!", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tempoRecuperacao(){
        //tempo é em dias
        try{
            //calcular a partir dos dados cadastrados no banco o tempo de recuperação
            int tempo = 3;
            /* Fórmula:
            if (((idade>65)||(idade<10)){
                tempo++2;
            }
            else if (peso<40){
                tempo--2;
            }
            else if(ultimaTransfusao a menos de 15 dias){
                tempo++3;
            }
            */
            
            lb_tempoRecuperacao.setText("Tempo estimado de recuperação: " + tempo + " dias");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao calcular tempo de recuração!", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // evento acionado quando o botao de voltar é clicado
        new Menu().setVisible(true);
        dispose();
    }                                        

    private void bt_adcTransfusaoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        //evento que será chamado quando o botão "adicionar transfusão" for clicado.
        
        try{
            //ao clicar, pegar a data atual (classe calendar) e salvar no banco a data, adicionando mais uma transfusão.
            //ooooooou outra forma de pegar a data??
            JOptionPane.showMessageDialog(null, "Transfusão salva com sucesso!");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao adicionar transfusão", null, JOptionPane.ERROR_MESSAGE);
        }
    }                                                

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Portal_Paciente portalPaciente = new Portal_Paciente();
                portalPaciente.chancesReacao();
                portalPaciente.qtDoadores();
                portalPaciente.tempoRecuperacao();
                portalPaciente.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_adcTransfusao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_chancesReacao;
    private javax.swing.JLabel lb_qtDoadores;
    private javax.swing.JLabel lb_tempoRecuperacao;
    // End of variables declaration                   
}