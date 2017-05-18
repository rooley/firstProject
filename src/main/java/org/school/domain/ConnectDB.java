package org.school.domain;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.h2.jdbcx.JdbcDataSource;

public class ConnectDB {

	private static SqlSessionFactory sqlSessionFactory;

	private void createSqlSession() {
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL("jdbc:h2:˜/test");
		dataSource.setUser("sa");
		dataSource.setPassword("sa");
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("FirstProgect", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(QuestionMapper.class);
		configuration.addMapper(AnswerMapper.class);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
