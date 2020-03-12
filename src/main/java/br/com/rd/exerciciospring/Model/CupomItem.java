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
@Table(name = "tb_cupom_item")
public class CupomItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name = "id_cupom")
    private Cupom cupom;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @NotNull
    @Column(name = "qt_produto")
    private Long qtProduto;

    @NotNull
    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

}
