package crud.examples.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run( Application.class, args );
    }

    /*@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.cj.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/spring_boot_test?useSSL=false" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "mysqlroot" );
        return dataSource;
    }*/


}
