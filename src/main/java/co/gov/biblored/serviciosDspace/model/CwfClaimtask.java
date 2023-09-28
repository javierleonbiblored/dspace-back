package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfClaimtask")
@Table(name = "cwf_claimtask", schema = "public", indexes = {
        @Index(name = "cwf_claimtask_workflow_step_action_fk_idx", columnList = "workflowitem_id, step_id, action_id"),
        @Index(name = "cwf_claimtask_workflow_step_fk_idx", columnList = "workflowitem_id, step_id"),
        @Index(name = "cwf_claimtask_workflow_fk_idx", columnList = "workflowitem_id")
})
public class CwfClaimtask {
    @Id
    @Column(name = "claimtask_id", nullable = false)
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
    @JoinColumn(name = "owner_id")
    private Eperson owner;

}