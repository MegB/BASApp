package west.sample.bas;

import android.os.Bundle; 
import android.support.v4.app.Fragment; 
import android.view.*;

public class TableFragment extends Fragment { 	
	public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) { 
		return inflater.inflate(R.layout.fragment_table, viewGroup, false); 
	} 
}
