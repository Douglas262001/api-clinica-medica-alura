package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        @NotBlank
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco) {
}
