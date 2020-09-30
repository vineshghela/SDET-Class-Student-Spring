package com.qa.springSDET_Project.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ClassRoomDTO {
//	Data transfer object
	//converts our POJO to JSON in this case classRoom to view in the front end.
	private long Id;
	private String subject;
	private String teacherName;
	private int classSize;
	private List<StudentDTO> students;
	
}

