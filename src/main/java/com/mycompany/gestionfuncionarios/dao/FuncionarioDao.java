package com.mycompany.gestionfuncionarios.dao;

import com.mycompany.gestionfuncionarios.domain.Funcionario;
import com.mycompany.gestionfuncionarios.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    private static final String GET_FUNCIONARIOS = "select * from tabla_funcionario";
    private static final String CREATE_FUNCIONARIO = "insert into tabla_funcionario (nombre, apellido, tipo_identificacion, direccion, sexo, f_nacimiento, tel, num_documento, nivel_educativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String GET_FUNCIONARIO_BY_ID = "select * from tabla_funcionario where id_funcionario = ?";
    private static final String UPDATE_FUNCIONARIO = "update tabla_funcionario set nombre = ?, apellido = ?, tipo_identificacion = ?, direccion = ?, sexo = ?, f_nacimiento = ?, tel = ?, num_documento = ?, nivel_educativo = ? where id_funcionario = ?";
    private static final String DELETE_FUNCIONARIO = "delete from tabla_funcionario where id_funcionario = ?";

    public void crear(Funcionario funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getNombre());
            preparedStatement.setString(2, funcionario.getApellido());
            preparedStatement.setString(3, funcionario.getTipo_identificacion());
            preparedStatement.setString(4, funcionario.getDireccion());
            preparedStatement.setString(5, funcionario.getSexo());
            preparedStatement.setString(6, funcionario.getF_nacimiento());
            preparedStatement.setInt(7, funcionario.getTel());
            preparedStatement.setInt(8, funcionario.getNum_documento());
            preparedStatement.setString(9, funcionario.getNivel_educativo());
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public List<Funcionario> obtenerFuncionarios() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(resultSet.getInt("id_funcionario"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setF_nacimiento(resultSet.getString("f_nacimiento"));
                funcionario.setTel(resultSet.getInt("tel"));
                funcionario.setNum_documento(resultSet.getInt("num_documento"));
                funcionario.setNivel_educativo(resultSet.getString("nivel_educativo"));
                funcionarios.add(funcionario);
            }
            return funcionarios;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

    public Funcionario obtenerFuncionario(int id_funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            preparedStatement.setInt(1, id_funcionario);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new Funcionario();
                funcionario.setId_funcionario(resultSet.getInt("id_funcionario"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setF_nacimiento(resultSet.getString("f_nacimiento"));
                funcionario.setTel(resultSet.getInt("tel"));
                funcionario.setNum_documento(resultSet.getInt("num_documento"));
                funcionario.setNivel_educativo(resultSet.getString("nivel_educativo"));
            }
            return funcionario;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

    public void actualizarFuncionario(int id_funcionario, Funcionario funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getNombre());
            preparedStatement.setString(2, funcionario.getApellido());
            preparedStatement.setString(3, funcionario.getTipo_identificacion());
            preparedStatement.setString(4, funcionario.getDireccion());
            preparedStatement.setString(5, funcionario.getSexo());
            preparedStatement.setString(6, funcionario.getF_nacimiento());
            preparedStatement.setInt(7, funcionario.getTel());
            preparedStatement.setInt(8, funcionario.getNum_documento());
            preparedStatement.setString(9, funcionario.getNivel_educativo());
            preparedStatement.setInt(10, id_funcionario);
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public void eliminarFuncionario(int id_funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1, id_funcionario);
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

}
