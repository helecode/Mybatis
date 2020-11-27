package S1122HelloWorld;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class T09EamilTest {
	public static void main(String[] args) throws IOException {
		
	
		InputStream is=Resources.getResourceAsStream("mybatis-conf.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlsession=sqlSessionFactory.openSession();
		S8EmailMapper emailMapper=sqlsession.getMapper(S8EmailMapper.class);
		System.out.println("selectEamilByIdMessage:"+emailMapper.selectEamilByIdMessage(1));
		System.out.println("selectEamilByIdMessageFenBu:"+emailMapper.selectEamilByIdMessageFenBu(2));
		System.out.println("dynamicSelectEamil:"+emailMapper.dynamicSelectEamil(1,null));
		System.out.println("dynamicSelectEamilTrim:"+emailMapper.dynamicSelectEamilTrim(1, "n1"));
		System.out.println("dynamicSelectEamilSet:"+emailMapper.dynamicSelectEamilSet(3, "234567"));
		System.out.println("dynamicSelectEamilChoose:"+emailMapper.dynamicSelectEamilChoose(3, "234567"));
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("dynamicSelectEamilForeach:"+emailMapper.dynamicSelectEamilForeach(list));
		sqlsession.commit();
	
	}
}
