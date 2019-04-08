package SSVVL4MV.repository;

import SSVVL4MV.domain.*;
import SSVVL4MV.validation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NotaRepository extends AbstractCRUDRepository<Pair<String, String>, Nota> {
    public NotaRepository(Validator<Nota> validator) {
        super(validator);
    }
}
