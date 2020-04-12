package com.aia.gp.DeployConfirm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

@SpringBootApplication
public class DeployConfirmApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeployConfirmApplication.class, args);
    }
}
