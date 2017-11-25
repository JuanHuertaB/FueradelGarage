package pe.com.fueradelgarage.controllers;

import pe.com.fueradelgarage.models.Agreement;
import pe.com.fueradelgarage.models.GbService;
import pe.com.fueradelgarage.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@javax.servlet.annotation.WebServlet(name = "AgreementController", urlPatterns = "/agreements")

public class AgreementsController extends javax.servlet.http.HttpServlet {
    GbService service;
    String url;

    public AgreementsController() {
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
                List<Agreement> agreements = service.findAllAgreements();
                request.setAttribute("agreements", agreements);
                url = "listAgreements.jsp";
            }
            if(action.equals("show")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Agreement agreements = service.findAgreementsById(id);
                request.setAttribute("agreements", agreements);
                url = "showAgreements.jsp";
            }
            if(action.equals("new")) {
                url = "newAgreements.jsp";
            }
            if(action.equals("edit")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Agreement agreement = service.findAgreementsById(id);
                request.setAttribute("agreement", agreement);
                url = "editAgreements.jsp";
            }
            if(action.equals("delete")){
                int id = Integer.parseInt(request.getParameter("id"));
                boolean isErase = service.eraseUser(id);
                List<Agreement> agreements = service.findAllAgreements();
                request.setAttribute("agreements", agreements);
                url = "listAgreements.jsp";
            }
        }

       /* if(method.equals("POST")) {
            // Create Action
            if(action.equals("create")) {
                String state = request.getParameter("state");
                String password = request.getParameter("password");
                String description = request.getParameter("description");
                int score = 0;

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
*/
        request.getRequestDispatcher(url).forward(request, response);
    }

}
