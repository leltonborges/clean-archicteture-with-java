package br.com.main.infra.aluno;

import br.com.main.dominio.aluno.Aluno;
import br.com.main.dominio.aluno.CPF;
import br.com.main.dominio.aluno.RepositorioDeAlunos;
import br.com.main.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {
    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, aluno.getCpf().getCpf());
            stm.setString(2, aluno.getName());
            stm.setString(3, aluno.getEmail().getAddressEmail());
            stm.execute();
            sql = "INSERT INTO TELEFONE VALUE (?,?)";
            stm = connection.prepareStatement(sql);
            for (Telefone fone: aluno.getTelefones()){
                stm.setString(1, fone.getDdd());
                stm.setString(2, fone.getNumber());
                stm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
