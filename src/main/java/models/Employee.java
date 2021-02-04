package models;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

    //Setting up the relationship
    @ManyToOne
    @JoinColumn(name="sdid", insertable = false, updatable = false)
    private ServiceDepartment serviceDepartment;
    private Integer sdid; //ServiceDepartment ID

    // Getting list of customers
    @OneToMany(mappedBy = "ServiceDepartment")
    private List<Customer> customersList;

}
