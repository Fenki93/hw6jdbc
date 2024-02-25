package org.ddiachenko.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static String getConnectionUrlForDatabase(){
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream(
                "application.properties")) {

            Properties prop = new Properties();

            if (inputStream == null) {
                //TODO: Add logger here (No prop file)
                return null;
            }

            prop.load(inputStream);

            return new StringBuilder("jdbc:postgresql://")
                    .append(prop.getProperty("postgres.db.host"))
                    .append(":")
                    .append(prop.getProperty("postgres.db.port"))
                    .append("/")
                    .append(prop.getProperty("postgres.db.database"))
                    .append("?currentSchema=public")
                    .toString();
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }
    public static String getUserForDatabase(){
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream(
                "application.properties")){

            Properties prop = new Properties();
            if (inputStream == null) {
                //TODO: Add logger here (No prop file)
                return null;
            }

            prop.load(inputStream);

            return prop.getProperty("postgres.db.username");
        }
        catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public static String getPasswordForDatabase(){
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream(
                "application.properties")){

            Properties prop = new Properties();
            if (inputStream == null) {
                //TODO: Add logger here (No prop file)
                return null;
            }

            prop.load(inputStream);

            return prop.getProperty("postgres.db.password");
        }
        catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
    }
}