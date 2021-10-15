package model.service.impl;

import model.bean.User;
import model.repository.impl.UserRepositoryImpl;
import model.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    UserRepositoryImpl userRepository = new UserRepositoryImpl();
    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String countryN) {
        return userRepository.searchByCountry(countryN);
    }

    @Override
    public List<User> sortByName(String sort) {
        return userRepository.sortByName(sort);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        userRepository.addUserTransaction(user, permision);
    }

    @Override
    public void insertUpdateWithoutTransaction() {
        userRepository.insertUpdateWithoutTransaction();
    }

    @Override
    public void insertUpdateUseTransaction() {
        userRepository.insertUpdateUseTransaction();
    }

    @Override
    public List<User> selectAllUsersBySP() {
        return userRepository.selectAllUsersBySP();
    }

    @Override
    public void updateUserBySP(User user) throws SQLException {
        userRepository.updateUserBySP(user);
    }

    @Override
    public void deleteUserBySP(int id) throws SQLException {
        userRepository.deleteUserBySP(id);
    }

}
