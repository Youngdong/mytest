package nc.flycamel.mytest.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Data
@Entity
public class TestTable {

    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 200)
    private String testValue;
}
