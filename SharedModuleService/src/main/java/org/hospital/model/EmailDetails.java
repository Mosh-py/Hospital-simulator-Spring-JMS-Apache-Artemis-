package org.hospital.model;

import lombok.Data;

@Data
public class EmailDetails {

	private String recipeient;
	private String messageBody;
	private String subject;
	private String attachment;
}
