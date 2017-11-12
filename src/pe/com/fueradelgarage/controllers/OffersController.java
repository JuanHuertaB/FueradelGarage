package pe.com.fueradelgarage.controllers;

import pe.com.fueradelgarage.models.GbService;
import pe.com.fueradelgarage.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "UsersController", urlPatterns = "/users")
public class OffersController extends javax.servlet.http.HttpServlet {

    GbService service;
    String url;

    public OffersController() {
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
                List<Offer> offers = service.findAllUsers();
                request.setAttribute("offers", offers);
                url = "listOffers.jsp";
            }
            if(action.equals("show")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Offer offer = service.findUserById(id);
                request.setAttribute("offer", offer);
                url = "showOffer.jsp";
            }
            if(action.equals("new")) {
                url = "newOffer.jsp";
            }
            if(action.equals("edit")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Offer offer = service.findUserById(id);
                request.setAttribute("offer", offer);
                url = "editUser.jsp";
            }
        }

        if(method.equals("POST")) {
            // Create Action
            if(action.equals("create")) {
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");
                int score = 0;

                Offer offer = service.createOffer(name,password,description,score);

                List<Offer> offers = service.findAllOffer();
                request.setAttribute("users", users);
                url = "listOffer.jsp";
            }
            if(action.equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");

                boolean isUpdated = service.updateOffer(id, name,password,description);
                List<Offer> offers = service.findAllOffers();
                request.setAttribute("offers", offers);
                url = "listOffer.jsp";
            }
        }

        request.getRequestDispatcher(url).forward(request, response);
    }
}
