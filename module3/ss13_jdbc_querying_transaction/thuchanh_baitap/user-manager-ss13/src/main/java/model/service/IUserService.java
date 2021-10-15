package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    List<User> searchByCountry(String countryN);

    List<User> sortByName(String sort);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();

    List<User> selectAllUsersBySP ();

    void updateUserBySP (User user) throws SQLException;

    void deleteUserBySP (int id) throws SQLException;

}
