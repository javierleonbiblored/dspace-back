package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfPooltask")
@Table(name = "cwf_pooltask", schema = "public", indexes = {
        @Index(name = "cwf_pooltask_workflow_fk_idx", columnList = "workflowitem_id")
})
public class CwfPooltask {
    @Id
    @Column(name = "pooltask_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflowitem_id")
    private CwfWorkflowitem workflowitem;

    @Column(name = "workflow_id", length = Integer.MAX_VALUE)
    private String workflowId;

    @Column(name = "step_id", length = Integer.MAX_VALUE)
    private String stepId;

    @Column(name = "action_id", length = Integer.MAX_VALUE)
    private String actionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Epersongroup group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eperson_id")
    private Eperson eperson;

}