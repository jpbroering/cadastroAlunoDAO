package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO {

    private static ArrayList<Aluno> minhalista = new ArrayList<>();

    public ArrayList<Aluno> getMinhalista() {
        minhalista.clear();
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int idade = res.getInt("idade");
                String curso = res.getString("curso");
                int fase = res.getInt("fase");

                Aluno objeto = new Aluno(id, nome, idade, curso, fase);
                minhalista.add(objeto);
            }
            stmt.close();

        } catch (SQLException e) {

        }
        return minhalista;
    }

    public void setMinhalista(ArrayList<Aluno> minhalista) {
        AlunoDAO.minhalista = minhalista;
    }

    public Connection getConexao() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_alunos";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Unisul@1520";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: Não Conectado!");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println(" O Driver não foi encontrado");
            return null;
        } catch (SQLException e) {
            System.out.println(" não foi possivel conectar");
            return null;
        }
    }

    public boolean insertAlunoBD(Aluno objeto) {
        String sql = "INSERT INTO tb_alunos(id,nome,idade,curso,fase) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getCurso());
            stmt.setInt(5, objeto.getFase());
            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean deleteAlunoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_alunos WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }
    public boolean updateAlunoBD(Aluno objeto){
        String sql = "UPDATE tb_alunos set nome = ? ,idade = ? ,curso = ? ,fase =? WHERE id = ?";
        
        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getCurso());
            stmt.setInt(4, objeto.getFase());
            stmt.setInt(5, objeto.getId());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
    public int maiorID(){
        int maiorID = 0;
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_alunos");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }
    public Aluno carregaAluno (int id) {
        Aluno objeto = new Aluno();
        objeto.setId(id);
        try{
            Statement stmt = this.getConexao().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_aluno WHERE id = "+id);
            res.next();
            
            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setCurso(res.getString("curso"));
            objeto.setFase(res.getInt("fase"));
            
            stmt.close();
        } catch(SQLException erro) {
            System.out.println("Erro: "+erro);
        }
        return objeto;
    }
}
