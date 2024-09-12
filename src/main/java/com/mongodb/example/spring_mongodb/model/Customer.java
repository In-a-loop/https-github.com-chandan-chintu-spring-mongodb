package com.mongodb.example.spring_mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customer")
public class Customer {
// made changes
// add some lines
    @Id
    private int id;
    private String name;
    private int age;
	// made changes
    private String email;
    private String mobile;
    // System.out.println("--------------------------------");
	// add some lines
	
	///isowsksm
	//sjuwowo
	
	// made changes

}
