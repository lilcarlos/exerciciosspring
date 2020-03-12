package br.com.rd.exerciciospring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long codCupom;

    @NotNull
    @Column(name = "id_cliente")
    private Long idCliente;

    @NotNull
    @Column(name = "dt_venda")
    private String dtVenda;

    @NotNull
    @Column(name = "vl_venda")
    private BigDecimal vlVenda;

}
