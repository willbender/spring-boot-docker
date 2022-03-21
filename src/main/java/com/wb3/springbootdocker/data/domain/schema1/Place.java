package com.wb3.springbootdocker.data.domain.schema1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "places", schema = "schema1")
@Data
public class Place {

	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "places_gen", sequenceName = "schema1.places_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "places_gen")
	private Integer id;

	@Column(name = "name", columnDefinition = "varchar", length = 150, nullable = false, unique = true)
	private String name;

	@Column(name = "visited", columnDefinition = "boolean")
	private Boolean visited = false;

	@Column(name = "description", columnDefinition = "text")
	private String description;
}