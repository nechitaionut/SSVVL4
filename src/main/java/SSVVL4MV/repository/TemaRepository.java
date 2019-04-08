package SSVVL4MV.repository;

import SSVVL4MV.domain.Tema;
import SSVVL4MV.validation.*;

public class TemaRepository extends AbstractCRUDRepository<String, Tema> {
    public TemaRepository(Validator<Tema> validator) {
        super(validator);
    }
}

