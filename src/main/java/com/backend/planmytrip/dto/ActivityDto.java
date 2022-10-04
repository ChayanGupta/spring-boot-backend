package com.backend.planmytrip.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDto {

	private Integer id;
	@NotBlank(message = "activity name is mandatory")
	private String activityName;
	private Double activityPrice;
}
