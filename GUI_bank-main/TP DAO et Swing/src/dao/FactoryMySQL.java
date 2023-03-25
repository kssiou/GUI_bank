package dao;

import model.Admin;
import model.Banque;
import model.Client;
import model.Utilisateur;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryMySQL extends Factory{
    private static final String PROPERTIES_FILE= "dao/dao.propreties",
            URL="DB_NAME",
            LOGIN ="SDB_LOGIN",
            PASS="SDB_PASS",
            DRIVER="SDB_DRIVER";



    public static FactoryMySQL INSTANCE =getInstance();


    private static Connection connection ;
    private String url ,login , pass ;
    private FactoryMySQL getInstance(String url, String login, String pass) throws SQLException {
        this.url=url;
        this.login=login;
        this.pass=pass;
        connection = DriverManager.getConnection(url, login, pass);
        return null;
    };
    private static FactoryMySQL getInstance() {
        FactoryMySQL instance =null ;

        return instance;
    }


    public static Connection getConnection() {
        return null;
    }

    @Override
    public IDao<Client, Long> getClientDAO() {
        return null;
    }

    @Override
    public IDao<Client, Long> getComteDAO() {
        return null;
    }

    @Override
    public IDao<Admin, Long> getAdminDAO() {
        return null;
    }

    @Override
    public IDao<Utilisateur, Long> getUtilisateurDAO() {
        return null;
    }

    @Override
    public IDao<Banque, Long> getBanqueDAO() {
        return null;
    }
}
