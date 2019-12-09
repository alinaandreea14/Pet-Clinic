package domainapp.fixture.dom.pets.objects;

import domainapp.dom.pets.PetSpecies;

public class PetForSkye extends PetAbstract{
    @Override
    protected void execute(ExecutionContext executionContext) {
        create("Skye", PetSpecies.Budgie, executionContext);
    }
}
