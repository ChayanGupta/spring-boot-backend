package com.backend.planmytrip.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaOfInterestDto {

	private Integer id;
	@NotBlank(message = "area of interest name is mandatory")
	private String name;
}
