package com.company;
import java.sql.SQLException;

public interface USERdao {
    User getByID(int ID) throws SQLException;

    void createUser(User user);

    void changeInfo(int ID);

    void delete(int ID);

}