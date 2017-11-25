package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class SocialNetworkDataStore {
    private SocialNetworkEntity socialNetworkEntity;
    private Connection connection;

    public SocialNetworkDataStore(Connection connection){
        this.connection = connection;
    }

    public SocialNetworkDataStore(){
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public SocialNetwork findSocialNetworkById(int id){
        if (connection==null) return null;
        return getSocialNetworkEntity().findById(id);
    }


    public SocialNetwork createSocialNetwork(String name , String url){
        return connection == null ?
                null: getSocialNetworkEntity().create(name, url);
    }

    public boolean updateSocialNetwork(int id){
        return connection == null?
                false :
                getSocialNetworkEntity().update(id);
    }

    public boolean eraseSocialNetwork(int id){
        return connection == null?
                false:
                getSocialNetworkEntity().erase(id);
    }


    private SocialNetworkEntity getSocialNetworkEntity() {
        if(socialNetworkEntity== null){
           socialNetworkEntity = new SocialNetworkEntity();
           socialNetworkEntity.setConnection(connection);
        }
        return socialNetworkEntity;
    }


}
