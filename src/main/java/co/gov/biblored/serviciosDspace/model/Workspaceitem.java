package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Workspaceitem")
@Table(name = "workspaceitem", schema = "public", indexes = {
        @Index(name = "workspaceitem_item", columnList = "item_id"),
        @Index(name = "workspaceitem_coll", columnList = "collection_id")
})
public class Workspaceitem {
    @Id
    @Column(name = "workspace_item_id", nullable = false)
    private Integer id;

    @Column(name = "multiple_titles")
    private Boolean multipleTitles;

    @Column(name = "published_before")
    private Boolean publishedBefore;

    @Column(name = "multiple_files")
    private Boolean multipleFiles;

    @Column(name = "stage_reached")
    private Integer stageReached;

    @Column(name = "page_reached")
    private Integer pageReached;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;

}