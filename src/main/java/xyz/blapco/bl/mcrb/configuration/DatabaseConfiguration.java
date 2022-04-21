package xyz.blapco.bl.mcrb.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@Profile("develop")
public class DatabaseConfiguration {
    public static void connectDB() {
        Connection connection = null;
        try {
            String dbUrl = "jdbc:sqlite:mcrb.db";
            connection = DriverManager.getConnection(dbUrl);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
