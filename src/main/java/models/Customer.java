package models;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int serialNumber;

    //Setting up the relationship
    @ManyToOne
    @JoinColumn(name="sdid", insertable = false, updatable = false)
    private ServiceDepartment serviceDepartment;
    private Integer sdid; //ServiceDepartment ID
}
