package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfWorkflowitem")
@Table(name = "cwf_workflowitem", schema = "public")
public class CwfWorkflowitem {
    @Id
    @Column(name = "workflowitem_id", nullable = false)
    private Integer id;

    @Column(name = "multiple_titles")
    private Boolean multipleTitles;

    @Column(name = "published_before")
    private Boolean publishedBefore;

    @Column(name = "multiple_files")
    private Boolean multipleFiles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;

}