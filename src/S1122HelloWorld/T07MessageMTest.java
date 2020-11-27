package S1122HelloWorld;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

public class T07MessageMTest {
	public static void main(String[] args) throws IOException {

	InputStream is=Resources.getResourceAsStream("mybatis-conf.xml");
	
	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
	SqlSession sqlSession=sqlSessionFactory.openSession();
	S6MessageMMapper messageMMapper=sqlSession.getMapper(S6MessageMMapper.class);
	System.out.println(messageMMapper.displayMessageM());
	System.out.println(messageMMapper.displayMessageM2());
	System.out.println("messageMAMap:"+messageMMapper.dislayMessageMA());
	System.out.println(messageMMapper.selectMessageMById(1));
	
	
	}
}
