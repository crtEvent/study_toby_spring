package com.tobyspring.toby.user.dao;

import com.tobyspring.toby.user.domain.User;

import java.sql.*;

public class DeprecatedUserDao_01 {
    /*
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toby_spring", "toby", "1234");

        PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toby_spring", "toby", "1234");

        PreparedStatement ps = c.prepareStatement("select id, name, password from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return  user;
    }

    public void delete(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toby_spring", "toby", "1234");

        PreparedStatement ps = c.prepareStatement("delete from users where id = ?");
        ps.setString(1, id);

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeprecatedUserDao_01 dao = new DeprecatedUserDao_01();

        User user = new User();
        user.setId("tempId");
        user.setName("??????");
        user.setPassword("1234");

        dao.delete(user.getId());

        dao.add(user);
        System.out.printf("%s ?????? ??????%n", user.getId());

        User user2 = dao.get(user.getId());
        System.out.printf("%s ?????? ??????%n", user2.getId());
        System.out.printf("name: %s, password: %s%n"
                , user2.getName(), user2.getPassword());
    }
*/
}
