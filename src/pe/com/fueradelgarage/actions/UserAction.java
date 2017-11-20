package pe.com.fueradelgarage.actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import pe.com.fueradelgarage.models.GbService;
import pe.com.fueradelgarage.models.User;
import javax.servlet.http.HttpServletRequest;

public class UserAction extends ActionSupport{
    User user = new User();

    @Override
    public String execute(){
        GbService service = new GbService();
        int score = 0;
         user = service.createUser(user.getName(),user.getFirstName(),user.getLastName(),user.getPassword(),user.getDescription(),user.getVideo(),score);
        return SUCCESS;
    }

    public String eliminar(){
        try {
            GbService service = new GbService();
            service.eraseUser(user.getId());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }

    public String edit(){
        try {
            GbService service = new GbService();
            user = service.findUserById(user.getId());
            int id = user.getId();
            String name = user.getName();
            String password = user.getPassword();
            String description = user.getDescription();
            int score = user.getScore();
            return SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }

    public String update(){
        try {
            GbService service = new GbService();
            service.updateUser(user.getId(),user.getName(),user.getFirstName(),user.getLastName(),user.getPassword(),user.getDescription(),user.getVideo());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
