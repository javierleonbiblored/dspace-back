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
public class Process2bitstreamId implements Serializable {
    private static final long serialVersionUID = 7755032019425558813L;
    @Column(name = "process_id", nullable = false)
    private Integer processId;

    @Column(name = "bitstream_id", nullable = false)
    private UUID bitstreamId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Process2bitstreamId entity = (Process2bitstreamId) o;
        return Objects.equals(this.processId, entity.processId) &&
                Objects.equals(this.bitstreamId, entity.bitstreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, bitstreamId);
    }

}