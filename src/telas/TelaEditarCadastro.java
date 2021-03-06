/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.UsuarioDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static modelos.CalcularIdade.CalculaIdade;
import modelos.RandomDates;
import modelos.Usuario;

/**
 *
 * @author Hamilton
 */
public class TelaEditarCadastro extends javax.swing.JFrame {

    String codigo;
    String status;
    String devento;
    String prioridade;

    /**
     * Creates new form TelaEditarCadastro
     */
    public TelaEditarCadastro(String codigo, String nome, String cpf, String datanasc, String telefone, String cidade, String estado, String genero, String prioridade, String status, String devento) {
        initComponents();
        this.codigo = codigo;
        this.prioridade = prioridade;
        this.status = status;
        this.devento = devento;
        this.txtNomeA.setText(nome);
        this.txtCpfA.setValue(cpf);
        this.txtNascA.setValue(datanasc);
        this.txtTelA.setValue(telefone);
        this.txtCidadeA.setText(cidade);
        this.cbEstadoA.setSelectedItem(estado);
        this.cmbGenA.setSelectedItem(genero);

    }

    TelaEditarCadastro(int codigo, String nome, String cpf, String datanasc, String telefone, String cidade, String estado, String genero, String prioridade, String status, String devento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaEditarCadastro(String nome, String cpf, String datanasc, String telefone, String cidade, String estado, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNasc = new javax.swing.JFormattedTextField();
        txtCpf1 = new javax.swing.JFormattedTextField();
        cmbGenA = new javax.swing.JComboBox<>();
        txtNascA = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCpfA = new javax.swing.JFormattedTextField();
        txtTelA = new javax.swing.JFormattedTextField();
        cbEstadoA = new javax.swing.JComboBox<>();
        txtNomeA = new javax.swing.JTextField();
        txtCidadeA = new javax.swing.JTextField();
        btnSair1 = new javax.swing.JButton();
        cbGestanteA = new javax.swing.JCheckBox();
        btnSalvarA = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbGenA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbGenA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homem", "Mulher" }));
        getContentPane().add(cmbGenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        try {
            txtNascA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtNascA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 113, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Corbel", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR CADASTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 412, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Cidade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("G??nero:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        try {
            txtCpfA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfAActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpfA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, 30));

        try {
            txtTelA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, -1));

        cbEstadoA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbEstadoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CE" }));
        getContentPane().add(cbEstadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));
        getContentPane().add(txtNomeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 335, 30));
        getContentPane().add(txtCidadeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 97, -1));

        btnSair1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSair1.setText("Voltar");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        cbGestanteA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbGestanteA.setText("Gestante");
        getContentPane().add(cbGestanteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        btnSalvarA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvarA.setText("Salvar");
        btnSalvarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bgc4.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfAActionPerformed

    private void btnSalvarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAActionPerformed

        if (txtNomeA.getText().isEmpty() || txtCpfA.getValue() == null || txtNascA.getValue() == null || txtTelA.getValue() == null || txtCidadeA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
        } else {

            JOptionPane.showMessageDialog(null, "Altera????o realizada com sucesso!");

            Usuario usuario = new Usuario();
            usuario.setCodigo(Integer.parseInt(codigo));
            usuario.setNome(txtNomeA.getText());
            usuario.setCpf(txtCpfA.getText());
            usuario.setNasc(txtNascA.getText());
            usuario.setTelefone(txtTelA.getText());
            usuario.setCidade(txtCidadeA.getText());
            usuario.setEstado((String) cbEstadoA.getSelectedItem());
            usuario.setGenero((String) cmbGenA.getSelectedItem());
            usuario.setStatus(status);
            usuario.setDevento(devento);

            int dian = Integer.valueOf(txtNascA.getText().substring(0, 2));
            int mesn = Integer.valueOf(txtNascA.getText().substring(3, 5));
            int anon = Integer.valueOf(txtNascA.getText().substring(6, 10));

            if (CalculaIdade(dian, mesn, anon) >= 60 || cbGestanteA.isSelected()) {
                usuario.prioridade = "ALTA";
            } else {
                usuario.prioridade = "NORMAL";
            }

            UsuarioDAO usuariodao = new UsuarioDAO();
            usuariodao.AlterarUsuario(usuario);

            new TelaConsulta().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnSalvarAActionPerformed
    }
    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        TelaConsulta tconsulta = new TelaConsulta();
        tconsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvarA;
    private javax.swing.JComboBox<String> cbEstadoA;
    private javax.swing.JCheckBox cbGestanteA;
    private javax.swing.JComboBox<String> cmbGenA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCidadeA;
    private javax.swing.JFormattedTextField txtCpf1;
    private javax.swing.JFormattedTextField txtCpfA;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JFormattedTextField txtNascA;
    private javax.swing.JTextField txtNomeA;
    private javax.swing.JFormattedTextField txtTelA;
    // End of variables declaration//GEN-END:variables

    private Object getSelectedItem(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void txtEstadoA(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
