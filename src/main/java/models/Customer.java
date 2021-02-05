package models;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
    private LocalTime vistTime;

    //Setting up the relationship
    @ManyToOne
    @JoinColumn(name="sdid", insertable = false, updatable = false)
    private ServiceDepartment serviceDepartment;
    private Integer sdid; //ServiceDepartment ID
}
