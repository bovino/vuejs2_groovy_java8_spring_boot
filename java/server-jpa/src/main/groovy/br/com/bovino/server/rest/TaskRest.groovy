package br.com.bovino.server.rest

import java.util.Date;

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import br.com.bovino.server.dominio.TaskEntity

@Controller
@RequestMapping("/task")
class TaskRest {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody TaskEntity getTask(){
		return new TaskEntity( 1L, "description",  "title", null, "picturePath" )
	}
	
}
