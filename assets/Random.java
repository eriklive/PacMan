package assets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random{
	
	public static String sorteia (){
		List<String> lista = new ArrayList<String>() ;
		lista.add ("c") ; 
		lista.add ("d") ;
		lista.add ("e") ;
		lista.add ("b") ;
		Collections.shuffle(lista) ;
		
		// pega qualquer indice.
		return lista.get((int)Math.random() * lista.size());
	}

}