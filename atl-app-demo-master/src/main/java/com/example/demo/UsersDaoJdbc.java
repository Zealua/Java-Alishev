package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

class UsersDaoJdbc extends JdbcDaoSupport {

    public List<User> getUsers() {
        List<User> users = getJdbcTemplate().query("select id, name, status from users", new RowMapper<User>() { //select id, name, status from users where status = 0
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User c = new User();
                c.setId(rs.getLong(1));
                c.setName(rs.getString(2));
                c.setStatus(rs.getInt(3));
                return c;
            }
        });

        users.removeIf(u -> u.getStatus() == 1);
        return users;
    }

    public void addUser(String userName) {
        getJdbcTemplate().update("insert into users (name, status) values (?, 0)", userName);
    }
    public void removeUser( int userId){
        getJdbcTemplate().update("update users set status=1 where id=?", userId);
    }
}