package domainapp.fixture.dom.pets.objects;

import domainapp.dom.pets.Pet;
import domainapp.dom.pets.Pets;
import domainapp.dom.pets.PetSpecies;

import org.apache.isis.applib.fixturescripts.FixtureScript;

public abstract class PetAbstract extends FixtureScript {

    protected Pet create(
            final String name,
            final PetSpecies species,
            final ExecutionContext executionContext) {
        return executionContext.addResult(this, pets.create(name, species));
    }

    @javax.inject.Inject
    private Pets pets;
}
