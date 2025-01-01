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
