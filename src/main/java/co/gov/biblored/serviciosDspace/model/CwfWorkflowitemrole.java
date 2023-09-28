package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfWorkflowitemrole")
@Table(name = "cwf_workflowitemrole", schema = "public", indexes = {
        @Index(name = "cwf_workflowitemrole_item_role_fk_idx", columnList = "role_id, workflowitem_id"),
        @Index(name = "cwf_workflowitemrole_item_fk_idx", columnList = "workflowitem_id")
})
public class CwfWorkflowitemrole {
    @Id
    @Column(name = "workflowitemrole_id", nullable = false)
    private Integer id;

    @Column(name = "role_id", length = Integer.MAX_VALUE)
    private String roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflowitem_id")
    private CwfWorkflowitem workflowitem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Epersongroup group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eperson_id")
    private Eperson eperson;

}