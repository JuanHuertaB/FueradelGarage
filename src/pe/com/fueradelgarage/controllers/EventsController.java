package pe.com.fueradelgarage.controllers;

import pe.com.fueradelgarage.models.Event;
import pe.com.fueradelgarage.models.GbService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "EventsController", urlPatterns = "/events")
public class EventsController extends javax.servlet.http.HttpServlet{
    GbService service;
    String url;

    public EventsController() {
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
                List<Event> events = service.findAllEvents();
                request.setAttribute("users", events);
                url = "listUsers.jsp";
            }
            if(action.equals("show")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Event event = service.findEventById(id);
                request.setAttribute("event", event);
                url = "showEvent.jsp";
            }
            if(action.equals("new")) {
                url = "newEvent.jsp";
            }
            if(action.equals("edit")) {
                int id = Integer.parseInt(request.getParameter("id"));
                Event event = service.findEventById(id);
                request.setAttribute("user", event);
                url = "editEvent.jsp";
            }
            if(action.equals("delete")){
                int id = Integer.parseInt(request.getParameter("id"));
                boolean isErase = service.eraseEvent(id);
                List<Event> events = service.findAllEvents();
                request.setAttribute("events", events);
                url = "listEvents.jsp";
            }
        }

        if(method.equals("POST")) {
            // Create Action
            if(action.equals("create")) {
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");
                int score = 0;

                Event event = service.createEvent(name,password,description,score);

                List<Event> events = service.findAllEvents();
                request.setAttribute("events", events);
                url = "listEvents.jsp";
            }
            if(action.equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String password = request.getParameter("password");
                String description = request.getParameter("description");

                boolean isUpdated = service.updateEvent(id, name,password,description);
                List<Event> events = service.findAllEvents();
                request.setAttribute("events", events);
                url = "listEvents.jsp";
            }
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

}
