package edu.xtu.library.controller.req;

import lombok.Data;

@Data
public class AddBookReq {
	private String name;
	private String author;
	private String publisher;
	private Double price;
	private String code;
	private Integer number;
}
