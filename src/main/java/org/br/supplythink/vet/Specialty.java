package org.br.supplythink.vet;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.br.supplythink.model.NamedEntity;

@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {

}
