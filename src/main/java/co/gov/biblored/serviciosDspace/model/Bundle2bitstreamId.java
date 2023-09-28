package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class Bundle2bitstreamId implements Serializable {
    private static final long serialVersionUID = 2241662185270521378L;
    @Column(name = "bundle_id", nullable = false)
    private UUID bundleId;

    @Column(name = "bitstream_id", nullable = false)
    private UUID bitstreamId;

    @Column(name = "bitstream_order", nullable = false)
    private Integer bitstreamOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bundle2bitstreamId entity = (Bundle2bitstreamId) o;
        return Objects.equals(this.bitstreamOrder, entity.bitstreamOrder) &&
                Objects.equals(this.bitstreamId, entity.bitstreamId) &&
                Objects.equals(this.bundleId, entity.bundleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitstreamOrder, bitstreamId, bundleId);
    }

}