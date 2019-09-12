package test2;

import controller.RoleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "test2", "controller" })
public class MainApplicationClass {

    /*@Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:maipogrande.c1gkpofat6lb.us-east-1.rds.amazonaws.com:1521:ORCL");
        ds.setUsername("maipogrande");
        ds.setPassword("MaipoBDGrande");
        return ds;
    }
    */


    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context =
        //        new AnnotationConfigApplicationContext(MainApplicationClass.class);
        //context.getBean(RoleController.class).index();


        SpringApplication.run(MainApplicationClass.class, args);
    }
}
