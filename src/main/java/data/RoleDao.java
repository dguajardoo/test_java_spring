package data;

import interfaces.Dao;
import model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

@Repository
public class RoleDao implements Dao<Role> {

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:maipogrande.c1gkpofat6lb.us-east-1.rds.amazonaws.com:1521:ORCL");
        ds.setUsername("maipogrande");
        ds.setPassword("MaipoBDGrande");
        return ds;
    }

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource());
    }

    @Override
    public void save(Role role) {

    }

    @Override
    public Role load(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(Role role) {

    }

    @Override
    public List<Role> loadAll() {
        return jdbcTemplate.query("select * from Person", (resultSet, i) -> {
            return toPerson(resultSet);
        });
    }

    private Role toPerson(ResultSet resultSet) throws SQLException {
        Role role = new Role();
        role.set_id(resultSet.getInt("ID_ROL"));
        role.set_name(resultSet.getString("NOMBRE_ROL"));
        System.out.println(role.get_id());
        System.out.println(role.get_name());
        return role;
    }
}
