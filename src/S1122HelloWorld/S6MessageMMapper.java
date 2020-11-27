package S1122HelloWorld;

import java.util.List;
import java.util.Set;

public interface S6MessageMMapper {
	
	public Set<S5MessageM> selectMessageMById(int id);
	
	public boolean addMessageE(S5MessageM messageM);
	
	public List<S5MessageM> displayMessageM();
	
	public List<S5MessageM> displayMessageM2();
	
	public List<S5MessageM> dislayMessageMA();
}
