package domainapp.fixture.dom.pets.objects;

import domainapp.dom.pets.PetSpecies;

public class PetForTiddles extends PetAbstract{
    @Override
    protected void execute(ExecutionContext executionContext) {
        create("Tiddles", PetSpecies.Cat, executionContext);
    }
}
