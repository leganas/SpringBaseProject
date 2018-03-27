package by.legan.webapp.springbaseproject.config;

import by.legan.webapp.springbaseproject.dao.UserDAO;
import by.legan.webapp.springbaseproject.dao.UserDAOImpl;
import by.legan.webapp.springbaseproject.service.USerServiceImpl;
import by.legan.webapp.springbaseproject.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"by.legan.webapp.springbaseproject.service", "by.legan.webapp.springbaseproject.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/springtest?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("forever");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return dataSource;
    }

/*
    @Bean
    public UserDAO getUserDAOImpl(){
        return new UserDAOImpl(getJdbcTemplate());
    }
*/

/*
    @Bean
    public UserService getUserService(){
        return new USerServiceImpl();
    }
*/
}
