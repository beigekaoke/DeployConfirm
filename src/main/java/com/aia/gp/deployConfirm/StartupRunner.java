package com.aia.gp.deployConfirm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: flag ship
 * @Date: 2020/4/12 15:21
 */

@Component
public class StartupRunner implements CommandLineRunner {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        String sql = "select 1";
        jdbcTemplate.execute(sql);
        System.out.println("DB connection:"+jdbcTemplate.getDataSource().getConnection().toString());
    }
}
