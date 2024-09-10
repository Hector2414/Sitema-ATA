package model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sugestao {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String sugestao;
	    private LocalDateTime dataSugestao;

	    @ManyToOne
	    @JoinColumn(name = "ata_id")
	    private Ata ata;

	    @ManyToOne
	    @JoinColumn(name = "funcionario_id")
	    private Funcionario funcionario;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSugestao() {
			return sugestao;
		}

		public void setSugestao(String sugestao) {
			this.sugestao = sugestao;
		}

		public LocalDateTime getDataSugestao() {
			return dataSugestao;
		}

		public void setDataSugestao(LocalDateTime dataSugestao) {
			this.dataSugestao = dataSugestao;
		}

		public Ata getAta() {
			return ata;
		}

		public void setAta(Ata ata) {
			this.ata = ata;
		}

		public Funcionario getFuncionario() {
			return funcionario;
		}

		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}
	    
	    

}
