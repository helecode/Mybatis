package S1127Inteceptor;

import java.lang.reflect.Method;
import java.sql.Statement;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;


@Intercepts({ @Signature(type=StatementHandler.class,
						method="parameterize",
						args={Statement.class}
) })
public class S1Interceptor implements Interceptor{

	@Override
	public Object intercept(Invocation invoacation) throws Throwable {
		Object target=invoacation.getTarget();//被代理的对象
		Method method=invoacation.getMethod();//被代理的方法
		Object args[]=invoacation.getArgs();//方法参数
		//方法拦截前执行的代码块
		Object result=invoacation.proceed();
	
		
		System.out.println("intercept:"+invoacation.getTarget());
		System.out.println("intercept:"+invoacation.getMethod());
		return result;//调用目标方法
	}

	@Override
	public Object plugin(Object obj) {
		System.out.println("pluginplugin:");
		return Plugin.wrap(obj, this);
	}

	@Override
	public void setProperties(Properties pro) {
		pro.setProperty("user", "username");
		System.out.println("userValue:"+pro.getProperty("user"));
		System.out.println("size:"+pro.size());
		
	}

}
