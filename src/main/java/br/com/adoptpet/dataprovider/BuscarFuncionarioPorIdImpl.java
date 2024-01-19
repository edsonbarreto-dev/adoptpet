package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;
import br.com.adoptpet.dataprovider.repository.mapper.FuncionarioEntityMapper;
import br.com.adoptpet.dataprovider.repository.vo.FuncionarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarFuncionarioPorIdImpl implements BuscarFuncionarioPorId<FuncionarioVO> {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioEntityMapper funcionarioEntityMapper;

    @Override
    public FuncionarioVO find(Long id) {
        FuncionarioEntity funcionarioEntity = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não localizado"));

        return funcionarioEntityMapper.toFuncionarioVO(funcionarioEntity);
    }

}
