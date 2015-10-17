package com.zhujie.study.mybatis._05_JavaAPI;

import com.zhujie.study.mybatis._01_GettingStarted.Blog;
import com.zhujie.study.mybatis._01_GettingStarted.BlogMapper;
import com.zhujie.study.mybatis._03_MapperXML.User;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhujie on 15/10/9.
 */
public class SqlSessionCreate {
    public static void main(String[] args) throws IOException {
        //创建SqlSessionFactory方式1
        String resource = "org/mybatis/builder/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);

        //创建SqlSessionFactory方式2
        DataSource dataSource = new PooledDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        Environment environment = new Environment("development", transactionFactory, dataSource);

        Configuration configuration = new Configuration(environment);
        configuration.setLazyLoadingEnabled(true);
        configuration.getTypeAliasRegistry().registerAlias(Blog.class);
        configuration.getTypeAliasRegistry().registerAlias(User.class);
        configuration.addMapper(BlogMapper.class);

        SqlSessionFactoryBuilder builder1 = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory1 = builder1.build(configuration);
    }
}
