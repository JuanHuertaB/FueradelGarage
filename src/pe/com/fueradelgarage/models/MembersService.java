package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MembersService {
    private Connection connection;
    private MemberDataStore dataStore;

    public MembersService() {
        try {
            InitialContext context = new InitialContext();
            dataStore = new MemberDataStore();
            connection = ((DataSource) context
                    .lookup("MySQLDataSource"))
                    .getConnection();
            dataStore.setConnection(connection);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public MemberDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(MemberDataStore dataStore) {
        this.dataStore = dataStore;
    }

    // SERVICE MEMBERS
    public  Member findMenbersById(int id) {
        return dataStore.findMembersById(id);
    }

    public List<Member> findAllApplicants() {
        return dataStore.findAllMenbers(); }

    public Member createMember(int idApplicants, String nameMember, String position) {
        return dataStore.createMenbers(idApplicants,nameMember,position);}

    public boolean updateMember(int idMember, String name, String position) {
        return dataStore.updateMenbers(idMember,name,position);
    }
    public boolean eraseUser(int id) {
        return dataStore.eraseMember(id); }


}
