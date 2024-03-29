package by.gbyzzz.task07webxmlparsing.controller;

import by.gbyzzz.task07webxmlparsing.controller.command.Command;
import by.gbyzzz.task07webxmlparsing.controller.command.impl.ParseXML;
import by.gbyzzz.task07webxmlparsing.entity.Users;
import by.gbyzzz.task07webxmlparsing.entity.repository.Repository;
import by.gbyzzz.task07webxmlparsing.entity.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

@WebServlet (urlPatterns = "/result")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 10
)
public class Controller extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String COMMAND = "command";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        executeTask(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String uploadPath = getServletContext().getRealPath("") + File.separator + "xml";
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();
        Part filePart = null;
        try {
            filePart = request.getPart("filename");

        uploadPath = uploadPath +File.separator + filePart.getSubmittedFileName();
        filePart.write(uploadPath);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
        request.setAttribute("file", uploadPath);
        executeTask(request, response);
    }



    public void executeTask(HttpServletRequest request, HttpServletResponse response) {
        try {
            Command executionCommand = new ParseXML();
            request.setAttribute(COMMAND, request.getParameter(COMMAND));
            executionCommand.execute(request);

        Repository<Users> repository = UserRepository.getRepository();
        HashMap<Long, Users> usersHM =  repository.read();
        List<Users> users = new ArrayList<>();
        for(Map.Entry<Long,Users> entry : usersHM.entrySet()){
            users.add(entry.getValue());
        }
        request.setAttribute("users", users);
        request.setAttribute("parser", request.getParameter(COMMAND));
            getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
        } catch (ServletException | ParseException | IOException | ParserConfigurationException | SAXException | XMLStreamException e) {
            LOGGER.error(e);
        }
    }
}