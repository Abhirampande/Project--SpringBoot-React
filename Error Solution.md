Add in lombok for this error:-
 java: cannot find symbol
  symbol:   method getId()
Sol:-
//JDK9+ with module-info.java
//The configuration of the compiler plug-in should contain the following:
     use this:-
<annotationProcessorPaths>
	<path>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.36</version>
	</path>
</annotationProcessorPaths>

Error 2:--
Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 8.0.30
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown

 Solution:-- downgrade the version from 3.4.1 to 3.3.5
