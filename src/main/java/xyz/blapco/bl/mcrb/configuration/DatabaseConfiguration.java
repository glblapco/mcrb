package xyz.blapco.bl.mcrb.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;

@Configuration
@Profile("develop")
public class DatabaseConfiguration {
    public static void connectDB() {
        Connection connection = null;

        String dbUrl = "jdbc:sqlite:mcrb.db";
    }
}
