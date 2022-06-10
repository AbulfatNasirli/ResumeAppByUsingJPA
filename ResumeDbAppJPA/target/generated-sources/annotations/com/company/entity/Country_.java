package com.company.entity;

import com.company.entity.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-09T19:18:19", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> nationality;
    public static volatile CollectionAttribute<Country, User> userCollection;
    public static volatile SingularAttribute<Country, String> name;
    public static volatile CollectionAttribute<Country, User> userCollection1;
    public static volatile SingularAttribute<Country, Integer> id;

}