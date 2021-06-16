import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public aspect Logger {
	
	File file = new File("log.txt");
    int id = 0;
	Calendar calendar = Calendar.getInstance();
    pointcut success() : call(void hangeBackGColor());
    after() throws IOException : success(){
    //Core corncern: Añade un identificador al cambio de color
		id+=1;
	//Cross-Cutting: escribe en un documento log la operación de cambio de color. 
		FileWriter writer= new FileWriter(file,true);
    	writer.write(String.valueOf(id) + ": Cambio de color \n");
    	writer.close();
    }
} 