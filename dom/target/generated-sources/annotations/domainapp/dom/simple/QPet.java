package domainapp.dom.simple;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPet extends PersistableExpressionImpl<Pet> implements PersistableExpression<Pet>
{
    public static final QPet jdoCandidate = candidate("this");

    public static QPet candidate(String name)
    {
        return new QPet(null, name, 5);
    }

    public static QPet candidate()
    {
        return jdoCandidate;
    }

    public static QPet parameter(String name)
    {
        return new QPet(Pet.class, name, ExpressionType.PARAMETER);
    }

    public static QPet variable(String name)
    {
        return new QPet(Pet.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> NAME_LENGTH;
    public final StringExpression name;
    public final ObjectExpression<org.apache.isis.applib.services.repository.RepositoryService> repositoryService;

    public QPet(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.NAME_LENGTH = new NumericExpressionImpl<Integer>(this, "NAME_LENGTH");
        this.name = new StringExpressionImpl(this, "name");
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
    }

    public QPet(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.NAME_LENGTH = new NumericExpressionImpl<Integer>(this, "NAME_LENGTH");
        this.name = new StringExpressionImpl(this, "name");
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
    }
}
