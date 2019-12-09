package domainapp.fixture.dom.pets.objects;

import domainapp.dom.pets.PetSpecies;

public class PetForFido extends PetAbstract {

    @Override
    protected void execute(ExecutionContext executionContext) {
        create("Fido", PetSpecies.Dog, executionContext);
    }
}
