package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.controllers.UserController;
import org.example.model.FileOperation;
import org.example.model.FileOperationImpl;
import org.example.model.Repository;
import org.example.model.RepositoryFile;
import org.example.view.ViewUser;

public class Main {
    static final Logger rootLogger = LogManager.getRootLogger();

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("id.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
        rootLogger.info("END!");

    }


}