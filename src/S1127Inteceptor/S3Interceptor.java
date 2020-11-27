package S1127Inteceptor;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import S1122HelloWorld.S8EmailMapper;

public class S3Interceptor {

	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis-conf.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlsession=sqlSessionFactory.openSession();
		S8EmailMapper emailMapper=sqlsession.getMapper(S8EmailMapper.class);
		//Ò»¼¶»º´æ
		System.out.println("selectEamilByIdMessage1:"+emailMapper.selectEamilByIdMessage(1));

	}

}
