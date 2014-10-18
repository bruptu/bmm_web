package br.com.bmm.model.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "sexo")
public class Sexo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue          //unique e unico
    @Column(name="IdSexo", nullable=false)
    private Integer IdSexo;
    @Column(name="Descricao", unique=true, nullable=false, length=9)
    private String Descricao;

    // Mapeamento  de 1 para N
    @OneToMany(mappedBy = "sexo", fetch = FetchType.LAZY)
    @ForeignKey(name = "PessoaSexo")
    private List<Pessoa> pessoas;
    
    
    public Sexo() {
    }

    public Integer getIdSexo() {
        return IdSexo;
    }

    public void setIdSexo(Integer IdSexo) {
        this.IdSexo = IdSexo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.IdSexo != null ? this.IdSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sexo other = (Sexo) obj;
        if (this.IdSexo != other.IdSexo && (this.IdSexo == null || !this.IdSexo.equals(other.IdSexo))) {
            return false;
        }
        return true;
    }

}
