package br.com.bovino.server.json

import br.com.bovino.server.dominio.TaskEntity;

import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.ObjectMapper

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.io.File
import java.io.IOException
  
public class JsonWriterObjectMapper {
    
	private final Logger logger = LoggerFactory.getLogger(this.getClass())
    private ObjectMapper objectMapper = new ObjectMapper()
 
    public String writeTaskToJson(TaskEntity task) {
        
		try {
            String jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(task)
            logger.info("Task JSON is\n" + jsonInString)
            //objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true)
            //objectMapper.writeValue(new File(task.getId()+"_task.json"), task);
			return jsonInString
 
        } catch (JsonGenerationException e) {
            e.printStackTrace()
        } catch (JsonMappingException e) {
            e.printStackTrace()
        } catch (IOException e) {
            e.printStackTrace()
        }
    }
}