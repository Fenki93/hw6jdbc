package org.ddiachenko.database;

import org.ddiachenko.utils.PropertyReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

public class Database {

    private static final Database INSTANCE = new Database();

    private static Connection connection;

    private Database() {
        String url = PropertyReader.getConnectionUrlForDatabase();
        String user = PropertyReader.getUserForDatabase();
        String password = PropertyReader.getPasswordForDatabase();

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Cannot create DB connection");
        }
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public static Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void execute(String fileName) {
        try (Statement statement = connection.createStatement()) {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            statement.execute(content);
        } catch (SQLException | IOException e) {
            throw new RuntimeException("Cannot run query", e);
        }
    }

    public ResultSet executeResult(String fileName) {
        try {
            Statement statement = connection.createStatement();
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            return statement.executeQuery(content);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}