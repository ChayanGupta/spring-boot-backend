package com.backend.planmytrip.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDto {

	private Integer id;
	@NotBlank(message = "type name is mandatory")
	private String name;
}
