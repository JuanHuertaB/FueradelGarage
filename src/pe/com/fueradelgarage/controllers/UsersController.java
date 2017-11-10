package pe.com.fueradelgarage.controllers;

import pe.com.fueradelgarage.models.User;
import pe.com.fueradelgarage.models.GbService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "UsersController", urlPatterns = "/users")
public class UsersController extends javax.servlet.http.HttpServlet {
    GbService service;
    String url;

    public UsersController() {
        super();
        service = new GbService();
        url = "";
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest("POST", request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest("GET", request, response);
    }

    private void processRequest(String method, HttpServletRequest request, HttpServletResponse response)  throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");

        if(method.equals("GET")) {
            // Index Action
            if(action.equals("index")) {
                List<User> users = service.findAllUsers();
                request.setAttribute("users", users);
                url = "listUsers.jsp";
            }
            if(action.equals("show")) {
                int id = Integer.parseInt(request.getParameter("id"));
                User user = service.findUserById(id);
                request.setAttribute("user", user);
                url = "showUser.jsp";
            }
            if(action.equals("new")) {
                url = "newUser.jsp";
            }
            if(action.equals("edit")) {
                int id = Integer.parseInt(request.getParameter("id"));
                User user = service.findUserById(id);
                request.setAttribute("user", user);
                url = "editUser.jsp";
            }
        }

        if(method.equals("POST")) {
            // Create Action
            if(action.equals("create")) {
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");
                int score = 100;

                User user = service.createUser(name,password,description,score);

                List<User> users = service.findAllUsers();
                request.setAttribute("users", users);
                url = "listUsers.jsp";
            }
            if(action.equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");

                boolean isUpdated = service.updateUser(id, name,password,description);
                List<User> users = service.findAllUsers();
                request.setAttribute("users", users);
                url = "listUsers.jsp";
            }
        }

        request.getRequestDispatcher(url).forward(request, response);
    }
}







