
public class help {
/*
 * <dependencies>
 <! - Hibernate >
 <dependency>
 <groupId>org.hibernate</groupId>
 <artifactId>hibernate-core</artifactId>
 <version>{hibernate-version}</version>
 </dependency>
 
 <! - PostgreSQL >
 <dependency>
 <groupId>org.postgresql</groupId>
 <artifactId>postgresql</artifactId>
 <version>{postgresql-version}</version>
 </dependency>
</dependencies>
 
 * */
	
	
/*
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
  "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
  "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
 <session-factory>
 <! - Database connection properties >
 <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
 <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/your_database</property>
 <property name="hibernate.connection.username">your_username</property>
 <property name="hibernate.connection.password">your_password</property>
 
 <! - Other Hibernate properties >
 <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
 <property name="hibernate.show_sql">true</property>
 <property name="hibernate.format_sql">true</property>

 <! first time it is create and then onwards update>
 <property name="hbm2ddl.auto">update</property>
 
 <! - Mapping files or annotated classes >
 <! - Add your entity classes or mapping files here  for ex: entity used below >
 <mapping class="org.demo.main.model.Employee"/>
 
 </session-factory>
</hibernate-configuration>
 * 
 * */
}
