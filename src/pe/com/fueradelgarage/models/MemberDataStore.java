package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class MemberDataStore {
    private Connection connection;
    private MembersEntity membersEntity;

    public MemberDataStore(Connection connection) {
        this.connection = connection;
    }

    public MemberDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Member findMembersById(int id) {
        if(connection == null) return null;
        return getMembersEntity().findById(id);
    }

    public List<Member> findAllMenbers() {
        return connection == null ? null: getMembersEntity().findAll();
    }

    public Member createMenbers( int idApplicants, String nameMember, String position) {
        return connection == null ?
                null :
                getMembersEntity().create(idApplicants,idApplicants,nameMember,position);
    }

    public boolean updateMenbers(int idMember, String name, String position) {
        return connection == null ?
                false :
                getMembersEntity().update(idMember,name,position);
    }

    public boolean updateMenbers(Member menber) {
        return updateMenbers(menber.getIdApplicants(),menber.getNameMenber(),menber.getPosition());
    }

    public boolean eraseMember(int id) {
        return connection == null ?
                false :
                getMembersEntity().erase(id);
    }

    private MembersEntity getMembersEntity() {
        if(membersEntity == null) {
            membersEntity = new MembersEntity();
            membersEntity.setConnection(connection);
        }
        return membersEntity;
    }

}
