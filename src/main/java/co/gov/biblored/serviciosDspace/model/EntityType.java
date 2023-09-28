package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "EntityType")
@Table(name = "entity_type", schema = "public", indexes = {
        @Index(name = "entity_type_label_key", columnList = "label", unique = true),
        @Index(name = "entity_type_label_idx", columnList = "label")
})
public class EntityType {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false, length = 32)
    private String label;

}