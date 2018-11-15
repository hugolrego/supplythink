package org.br.smartsupply.vet;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.br.smartsupply.model.NamedEntity;

@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {

}
