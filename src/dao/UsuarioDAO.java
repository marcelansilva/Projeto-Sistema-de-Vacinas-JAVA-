package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Usuario;

/**
 *
 * @author Hamilton
 */
public class UsuarioDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Usuario> lista = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "insert into tbl_usuarios (nome, cpf, datanasc, telefone, cidade, estado, genero, prioridade, status, devento) values (?,?,?,?,?,?,?,?,?,?)";

        con = new ConexaoDAO().conectaBD();

        try {

            pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setString(3, usuario.getNasc());
            pstm.setString(4, usuario.getTelefone());
            pstm.setString(5, usuario.getCidade());
            pstm.setString(6, usuario.getEstado());
            pstm.setString(7, usuario.getGenero());
            pstm.setString(8, usuario.getPrioridade());
            pstm.setString(9, usuario.getStatus());
            pstm.setString(10, usuario.getDevento());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Cadastrar" + erro);
        }
    }

    public ArrayList<Usuario> ListarUsuarios() {
        String sql = "select * from tbl_usuarios";
        con = new ConexaoDAO().conectaBD();
        try {

            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setNasc(rs.getString("datanasc"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setGenero(rs.getString("genero"));
                usuario.setPrioridade(rs.getString("prioridade"));
                usuario.setStatus(rs.getString("status"));
                usuario.setDevento(rs.getString("devento"));

                lista.add(usuario);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void AlterarUsuario (Usuario usuario) {
        String sql = "update tbl_usuarios set nome = ?, cpf = ?, datanasc = ?, telefone = ?, cidade = ?, estado = ?, genero = ?, prioridade = ?, status = ?, devento = ? where codigo = ?";
        
        con = new ConexaoDAO().conectaBD();
        
            try {

            pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setString(3, usuario.getNasc());
            pstm.setString(4, usuario.getTelefone());
            pstm.setString(5, usuario.getCidade());
            pstm.setString(6, usuario.getEstado());
            pstm.setString(7, usuario.getGenero());
            pstm.setString(8, usuario.getPrioridade());
            pstm.setString(9, usuario.getStatus());
            pstm.setString(10, usuario.getDevento());
            pstm.setInt(11, usuario.getCodigo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Alterar" + erro);
        }     
    }
    
   public void excluirUsuario (Usuario usuario) {
       String sql = "delete from tbl_usuarios where codigo = ?";
       
       con = new ConexaoDAO().conectaBD();
        
            try {

            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, usuario.getCodigo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Excluir" + erro);
        }    
   
   }
}
