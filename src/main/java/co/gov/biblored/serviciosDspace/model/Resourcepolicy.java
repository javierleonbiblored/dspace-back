package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Resourcepolicy")
@Table(name = "resourcepolicy", schema = "public", indexes = {
        @Index(name = "resourcepolicy_type_id_idx", columnList = "resource_type_id, resource_id"),
        @Index(name = "resourcepolicy_action_idx", columnList = "action_id"),
        @Index(name = "resourcepolicy_idx_rptype", columnList = "rptype"),
        @Index(name = "resourcepolicy_person", columnList = "eperson_id"),
        @Index(name = "resourcepolicy_group", columnList = "epersongroup_id"),
        @Index(name = "resourcepolicy_object", columnList = "dspace_object")
})
public class Resourcepolicy {
    @Id
    @Column(name = "policy_id", nullable = false)
    private Integer id;

    @Column(name = "resource_type_id")
    private Integer resourceTypeId;

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "action_id")
    private Integer actionId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "rpname", length = 30)
    private String rpname;

    @Column(name = "rptype", length = 30)
    private String rptype;

    @Column(name = "rpdescription", length = Integer.MAX_VALUE)
    private String rpdescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eperson_id")
    private Eperson eperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "epersongroup_id")
    private Epersongroup epersongroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "dspace_object")
    private Dspaceobject dspaceObject;

}