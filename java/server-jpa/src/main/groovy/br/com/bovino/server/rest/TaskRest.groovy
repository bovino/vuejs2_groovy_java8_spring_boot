package br.com.bovino.server.rest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import br.com.bovino.server.dominio.TaskEntity
import br.com.bovino.server.json.JsonWriterObjectMapper

@Controller
@RequestMapping("/task")
class TaskRest {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Collection<TaskEntity> getTaskList(){
		
		TaskEntity t1 = new TaskEntity(id: 1L, description: "desc", title: "titulo", date: Date.parse("yyyy-MM-dd", "2016-03-13"), picturePath:"caminhoImagem")
		TaskEntity t2 = new TaskEntity(id: 2L, description: "desc2", title: "titulo2", date: Date.parse("yyyy-MM-dd", "2017-01-11"), picturePath:"caminhoImagem2")
		List<TaskEntity> lista = new ArrayList<>()
		lista.add(t1)
		lista.add(t2)
		
		JsonWriterObjectMapper jsonWriter = new JsonWriterObjectMapper()
		jsonWriter.writeTaskToJson(t1)
		jsonWriter.writeTaskToJson(t2)
		return lista
	}
	
}
