package br.com.bovino.server.dominio

import lombok.Data
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty

@EqualsAndHashCode
@Data
class TaskEntity {
	@JsonProperty("id")
	private @Getter @Setter Long id
	
	@JsonProperty("description")
	private @Getter @Setter String description	
	
	@JsonProperty("title")
	private @Getter @Setter String title	
	
	@JsonProperty("date")
	@JsonFormat(
		shape = JsonFormat.Shape.STRING,
		pattern = "dd-MM-yyyy hh:mm:ss")
	private @Getter @Setter Date date	
	
	@JsonProperty("picturePath")
	private @Getter @Setter String picturePath
}