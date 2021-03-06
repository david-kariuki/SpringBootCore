/**
 * Entity Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-visit SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@SuppressWarnings("JpaDataSourceORMInspection")
@Getter
@Setter
@ToString
@Entity
@RequiredArgsConstructor
@Table(name = "tbl_project_details")
public class SpringBootCoreDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "projectName")
	private String projectName;

	@Column(name = "projectStartDate")
	private String projectStartDate;

	@Column(name = "projectDescription")
	private String projectDescription;

	@Column(name = "projectLanguage")
	private String projectLanguage;

	@Column(name = "projectFramework")
	private String projectFramework;
}

