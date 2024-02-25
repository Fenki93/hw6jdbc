package org.ddiachenko.service;

import org.ddiachenko.database.Database;

import java.sql.Connection;

public class DatabaseInitService {

    public static void main(String[] args) {
        Connection connection = Database.getConnection();
        Database database = Database.getInstance();
        database.execute("sql/init_db.sql");
        database.closeConnection();
    }
}
