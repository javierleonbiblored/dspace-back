package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Subscription")
@Table(name = "subscription", schema = "public", indexes = {
        @Index(name = "subscription_person", columnList = "eperson_id")
})
public class Subscription {
    @Id
    @Column(name = "subscription_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eperson_id")
    private Eperson eperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dspace_object_id")
    private Dspaceobject dspaceObject;

    @Column(name = "type")
    private String type;

}