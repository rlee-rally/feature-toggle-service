package com.featuretoggle.db.dao;

import com.featuretoggle.domain.Toggle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ToggleDAO extends AbstractDAO<Toggle> {
    public static final String TABLE_NAME = "toggle";

    @Override
    public String getTableName() {
        return TABLE_NAME;
    }

    @Override
    protected Toggle processResultSetRow(ResultSet resultSet) {
        return null;
    }

    public Toggle insert(String name) throws SQLException {
//        String insert = String.format(INSERT_STATEMENT, "TOGGLE");
//        PreparedStatement preparedStatement = getConnection().prepareStatement(insert);
        UUID id = UUID.randomUUID();
//        preparedStatement.setString(1, id.toString());
//        preparedStatement.setString(2, name);
//        boolean success = preparedStatement.execute();
//        if(!success) {
//            throw new RuntimeException("Unable to create a Toggle");
//        }
        return findById(id);
    }


    public Toggle findById(UUID id) throws SQLException {
//        String query = String.format(SELECT_STATEMENT, "TOGGLE", "ID");
//        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
//        //need to learn how to do this with binary!!!!
//        preparedStatement.setString(1, id.toString());
//        ResultSet result = preparedStatement.executeQuery();
        return null;
    }
}
