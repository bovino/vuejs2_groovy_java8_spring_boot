package br.com.bovino.server.dominio

import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter

@AllArgsConstructor
@EqualsAndHashCode
@Getter @Setter
class TaskEntity {

	Long id
	
	String description
	
	String title
	
	Date date
	
	String picturePath
	
}
