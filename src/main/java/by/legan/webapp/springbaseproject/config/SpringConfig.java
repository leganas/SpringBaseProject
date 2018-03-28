package by.legan.webapp.springbaseproject.config;

import by.legan.webapp.springbaseproject.dao.DataBaseProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"by.legan.webapp.springbaseproject.service", "by.legan.webapp.springbaseproject.dao"})
public class SpringConfig {

    @Autowired
    DataBaseProperty dataBaseProperty;

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dataBaseProperty.getUrl());
        dataSource.setUsername(dataBaseProperty.getUser());
        dataSource.setPassword(dataBaseProperty.getPassword());
        dataSource.setDriverClassName(dataBaseProperty.getDriverClassName());

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
