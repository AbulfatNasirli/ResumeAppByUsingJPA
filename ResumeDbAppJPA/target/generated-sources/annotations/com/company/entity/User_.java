package com.company.entity;

import com.company.entity.Country;
import com.company.entity.EmploymentHistory;
import com.company.entity.UserSkill;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-09T19:18:19", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, Date> birthdate;
    public static volatile CollectionAttribute<User, EmploymentHistory> employmentHistoryCollection;
    public static volatile SingularAttribute<User, String> profileDescription;
    public static volatile SingularAttribute<User, Country> nationalityId;
    public static volatile SingularAttribute<User, Country> birthplaceId;
    public static volatile CollectionAttribute<User, UserSkill> userSkillCollection;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Integer> age;

}