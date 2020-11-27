package S1122HelloWorld;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.net.ns.SessionAtts;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class S3HelloWorldTest {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis-conf.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//获取Mapper接口的代理实现类对象
		S2MessageMapper messageMapper=sqlSession.getMapper(S2MessageMapper.class);
		System.out.println(messageMapper.findMessage(1));
		
		System.out.println(messageMapper.displayMessage());
		S1Message message=new S1Message(0,"name",33,'男',"小学生","18279441494","希望小学");
		boolean addFlag=messageMapper.addMessage(message);
		System.out.println("addaddaddaddaddaddaddadd:"+addFlag+"---"+message.getId()+"---"+"--"+messageMapper.displayMessage());
		
		boolean updateFlag=messageMapper.updateMessage(new S1Message(3,"name33",13,'男',"小学生","18279441494","希望小学"));
		
		System.out.println(updateFlag+"--"+messageMapper.displayMessage());
		
		boolean deleteFlag=messageMapper.deleteMessage(3);
		
		System.out.println(deleteFlag+"--"+messageMapper.displayMessage());
		
		List<S1Message> messageList=messageMapper.selectMessage("name",33, "education");
		System.out.println("messageList:"+messageList);
		
		System.out.println("messageMMList:"+messageMapper.selectMessageMM("name",33));
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "name");
		map.put("age", 33);
		System.out.println("messagemapList:"+messageMapper.selectMessageMap(map));
		Map<String,Object> mapPJ=new HashMap<String,Object>();
		mapPJ.put("name", "name");
		mapPJ.put("age", 33);
		System.out.println("mapPJ:"+messageMapper.selectMessageMapPJ(mapPJ));
		sqlSession.commit();

		
		System.out.println("selectMessageMapResultMap:"+messageMapper.selectMessageMapResultMap(message));
		
	}
}
