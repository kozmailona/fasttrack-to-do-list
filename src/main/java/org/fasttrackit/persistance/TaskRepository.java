package org.fasttrackit.persistance;

import org.fasttrackit.transfer.CreateTaskRequest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskRepository {

    public void createTask(CreateTaskRequest request ) throws IOException, SQLException {
        String sql = "INSERT INTO task (description, deadline) VALUES (?, ?)";
//
//        Connection connection = DatabaseConfiguration.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, request.getDescription());
//        preparedStatement.setDate(2, request.getDeadline());
    }
}
