package com.rohit.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
public class Expense {
//  primary key generation
//	The @GeneratedValue annotation is to configure the way of increment of the specified column(field). For example when using Mysql, you may specify auto_increment in the definition of table to make it self-incremental, and then use
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String expense;
	
	private String description;
	
	private BigDecimal amount;
	
}
