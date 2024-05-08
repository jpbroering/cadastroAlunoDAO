package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;

public class FrmGerenciaAluno extends javax.swing.JFrame {

    private Aluno objetoAluno;
    
    public FrmGerenciaAluno() {
        initComponents();
        this.objetoAluno = new Aluno();
        this.carregaTabela();
    }

    public void carregaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jTableAlunos.getModel();
        modelo.setNumRows(0);
        ArrayList<Aluno> minhaLista = objetoAluno.getMinhaLista();
        for(Aluno a : minhaLista){
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCurso(),
                a.getFase()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFCurso = new javax.swing.JTextField();
        JTFFase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Idade", "Curso", "Fase"
            }
        ));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Curso:");

        JTFCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCursoActionPerformed(evt);
            }
        });

        JTFFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFaseActionPerformed(evt);
            }
        });

        jLabel4.setText("Fase:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFCurso))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(JBCancelar)
                .addGap(18, 18, 18)
                .addComponent(JBEditar)
                .addGap(18, 18, 18)
                .addComponent(JBApagar)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBEditar)
                    .addComponent(JBApagar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCursoActionPerformed

    private void JTFFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFaseActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if(this.jTableAlunos.getSelectedRow() != -1){
        String nome = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 1).toString();
        String idade = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 2).toString();
        String curso = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 3).toString();
        String fase = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 4).toString();
        
        this.JTFNome.setText(nome);
        this.JTFIdade.setText(idade);
        this.JTFCurso.setText(curso);
        this.JTFFase.setText(fase);
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        try{
            int id = 0;
            String nome = "";
            int idade = 0;
            String curso = "";
            int fase = 0;
            
            if(this.JTFNome.getText().length()<2){
                throw new Mensagens("Nome deve conter pelo menos 2 caracteres");
            } else {
                nome = this.JTFNome.getName();
            }
            if(this.JTFIdade.getText().length()<0){
                throw new Mensagens("Idade deve ser maior que zero");
            } else {
                idade = Integer.parseInt(this.JTFIdade.getText());
            }
            if(this.JTFCurso.getText().length()<2){
                throw new Mensagens("Curso deve conter pelo menos 2 caracteres");
            } else {
                curso = this.JTFCurso.getText();
            }
            if(this.JTFFase.getText().length()<0){
                throw new Mensagens("Fase deve ser maior que zero");
            } else {
                fase = Integer.parseInt(this.JTFFase.getText());
            }
            if(this.jTableAlunos.getSelectedRow() == -1){
                throw new Mensagens("Primeiro selecione um Aluno para editar");
            } else {
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }
            if(this.objetoAluno.UpdateAlunoBD(id, nome, idade, curso, fase)){
                JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado com Sucesso!");
                this.JTFNome.setText("");
                this.JTFIdade.setText("");
                this.JTFCurso.setText("");
                this.JTFFase.setText("");
            }
            System.out.println(this.objetoAluno.getMinhaLista().toString());
        } catch(Mensagens erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage());
        } catch(NumberFormatException erro2){
            JOptionPane.showMessageDialog(null,"Imforme um número válido");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try{
            int id = 0;
            if(this.jTableAlunos.getSelectedRow() == -1){
                throw new Mensagens("Primeiro Selecione um aluno para Apagar");
            } else{
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse aluno?");
            if(respostaUsuario == 0){
                if(this.objetoAluno.DeleteAlunoBD(id)){
                    this.JTFNome.setText("");
                    this.JTFIdade.setText("");
                    this.JTFCurso.setText("");
                    this.JTFFase.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aluno apagado com sucesso!");
                }
            }
            System.out.println(this.objetoAluno.getMinhaLista().toString());
        } catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
        carregaTabela();
    }
    }//GEN-LAST:event_JBApagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFCurso;
    private javax.swing.JTextField JTFFase;
    private javax.swing.JTextField JTFIdade;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
