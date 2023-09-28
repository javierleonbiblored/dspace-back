package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfInProgressUser")
@Table(name = "cwf_in_progress_user", schema = "public", indexes = {
        @Index(name = "cwf_in_progress_user_workflow_fk_idx", columnList = "workflowitem_id")
})
public class CwfInProgressUser {
    @Id
    @Column(name = "in_progress_user_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflowitem_id")
    private CwfWorkflowitem workflowitem;

    @Column(name = "finished")
    private Boolean finished;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Eperson user;

}