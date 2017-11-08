package pe.com.fueradelgarage.models.others;

import pe.com.fueradelgarage.models.dao.*;
import pe.com.fueradelgarage.models.dto.Applicant;
import pe.com.fueradelgarage.models.dto.User;


import java.sql.Connection;
import java.util.List;

public class DataStore {
    private Connection connection;
    private UsersEntity usersEntity;
    private ApplicantsEntity applicantsEntity;
    // Constructores
    public DataStore(Connection connection) {
        this.connection=connection;
    }
    public DataStore() {
    }
    //Obteniendo users y applicants
    public User findUserById(int id){
        if (connection==null) return null;
        return getUserEntity().findById(id);
    }
    public Applicant findApplicantById(int id) {
        if (connection == null) return null;
        return getApplicantEntity().findById(id, getUserEntity());
    }
    //Listando users y applicants
    public List<User> findAllUsers(){
        return connection==null ? null:getUserEntity().findAll();
    }
    public List<Applicant> findAllApplicants(){
        return connection==null ? null:getApplicantEntity().findAll(getUserEntity());
    }
    //Creando Usuarios
    public User createUser(String user,String password,String description,int score){
        return connection==null ?
                null:
                getUserEntity().create(user,password,description,score);
    }
    //Actualizando usuarios
    public boolean updateUser(int id, String name, String password, String description){
        return connection== null ?
                false :
                getUserEntity().update(id,name,password,description);
    }
    public boolean updateUser(User user) {
        return updateUser(user.getId(),user.getName(),user.getPassword(),user.getDescription());
    }
    //Borrando usuarios
    public boolean eraseUser (int id){
        return connection == null ?
                false :
                getUserEntity().erase(id);
    }
    //Constructor de connection
    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection=connection;
    }
    //Conectando con users y applicants para obtener informacion
    private UsersEntity getUserEntity(){
        if (usersEntity==null){
            usersEntity=new UsersEntity();
            usersEntity.setConnection(connection);
        }
        return usersEntity;
    }
    private ApplicantsEntity getApplicantEntity(){
        if (applicantsEntity==null){
            applicantsEntity= new ApplicantsEntity();
            applicantsEntity.setConnection(connection);
        }
        return applicantsEntity;
    }
}
