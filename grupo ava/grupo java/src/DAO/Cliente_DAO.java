package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import MODEL.Cliente;
public class Cliente_DAO {
	// Método para adicionar um cliente ao banco de dados
    public void adicionarCliente(Cliente cliente) {
    	DAO dao = new DAO();
    	Connection con = dao.conectar();
        String query = "INSERT INTO clientes (nome, cpf) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	dao.closeConnection(con);
        }
    }

    // Método para obter um cliente do banco de dados pelo ID
    public Cliente obterClientePorId(int id) {
    	DAO dao = new DAO();
    	Connection con = dao.conectar();
        Cliente cliente = null;
        String query = "SELECT * FROM clientes WHERE id = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf(resultSet.getString("cpf"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	dao.closeConnection(con);
        }

        return cliente;
    }

    // Método para obter todos os clientes do banco de dados
    public List<Cliente> obterTodosClientes() {
    	DAO dao = new DAO();
    	Connection con = dao.conectar();
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf(resultSet.getString("cpf"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	dao.closeConnection(con);
        }

        return clientes;
    }

    // Método para atualizar um cliente no banco de dados
    public void atualizarCliente(Cliente cliente) {
    	DAO dao = new DAO();
    	Connection con = dao.conectar();
        String query = "UPDATE clientes SET nome = ?, cpf = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setInt(3, cliente.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	dao.closeConnection(con);
        }
    }

    // Método para excluir um cliente do banco de dados
    public void excluirCliente(int id) {
    	DAO dao = new DAO();
    	Connection con = dao.conectar();
        String query = "DELETE FROM clientes WHERE id = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	dao.closeConnection(con);
        }
    }
}
