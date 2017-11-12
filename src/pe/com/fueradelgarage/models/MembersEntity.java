package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MembersEntity extends BaseEntity{

    public MembersEntity(){
        super();
        setTableName("members");
    }

    public MembersEntity(Connection connection, String tableName ){
        super(connection, tableName);
    }

    public Member findById(int id){
        return findByCriteria(
                String.format("WHERE id_member = %d",id)).get(0);
    }

    public List<Member> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Member> members = new ArrayList<>();
            while (rs.next())
                members.add(Member.from(rs));

            return members;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Member findByName(String name){
        return findByCriteria(
                String.format("WHERE name_me = '%s'",name)).get(0);
    }

    public List<Member> findAll(){ return findByCriteria(""); }


    public Member create(Member member){
        return executeUpdate(String.format(
                "INSERT INTO %s(id_applicants,name_me,position) VALUES (%d,'%s','%s')",
                getTableName(),member.getId_applicants(),member.getName_me(),member.getPosition()))?
                member : null;
    }

    public Member create (int id_member, int id_applicants, String name, String position){
        return create(new Member(id_member, id_applicants,name,position));
    }
    public Member create (int id_applicants, String name, String position){
        return create(0, id_applicants, name, position);
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int id_member, String name, String position){
        return executeUpdate(String.format(
                "UPDATE %s SET name_me = '%s', position = '%s' WHERE id_member = %d",getTableName(),name,position,id_member));
    }

    public boolean update(Member member){
        return update(member.getId_member(),member.getName_me(),member.getPosition());
    }

    public boolean erase(int id_member){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_member=%d",
                getTableName(),id_member));
    }

    public boolean erase(Member member){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_member=%d",
                getTableName(),member.getId_member()));
    }
}





