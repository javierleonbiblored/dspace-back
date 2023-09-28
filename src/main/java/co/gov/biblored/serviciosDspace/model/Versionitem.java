package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Versionitem")
@Table(name = "versionitem", schema = "public", indexes = {
        @Index(name = "versionitem_person", columnList = "eperson_id"),
        @Index(name = "versionitem_item", columnList = "item_id")
})
public class Versionitem {
    @Id
    @Column(name = "versionitem_id", nullable = false)
    private Integer id;

    @Column(name = "version_number")
    private Integer versionNumber;

    @Column(name = "version_date")
    private Instant versionDate;

    @Column(name = "version_summary")
    private String versionSummary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "versionhistory_id")
    private Versionhistory versionhistory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eperson_id")
    private Eperson eperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

}