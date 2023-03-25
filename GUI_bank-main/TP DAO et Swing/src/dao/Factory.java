package dao;

import model.Admin;
import model.Banque;
import model.Client;
import model.Utilisateur;

public abstract class  Factory {

    public static final int MYSQL_DAO_FACTORY =1;
    public static final int FILES_DAO_FACTORY =1;


    public abstract IDao<Client,Long> getClientDAO();
    public abstract IDao<Client,Long> getComteDAO();
    public abstract IDao<Admin,Long> getAdminDAO();
    public abstract IDao<Utilisateur,Long> getUtilisateurDAO();

    public abstract IDao<Banque,Long> getBanqueDAO();


    public static Factory getFactory(int type){
        switch (type){

            case MYSQL_DAO_FACTORY : return FactoryMySQL.INSTANCE;
            case FILES_DAO_FACTORY: return new FactoryID() ;

            default:return null ;


        }



    }

}
