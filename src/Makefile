JVM_OPTS=-Djava.library.path=$(pwd) -Xms4g -Xmx4g -verbose:gc

all:
	#javac main/java/org/jinngm/jvm/anatomyCriticalGC.java
	javah CriticalGC
	cc -I. -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin -shared -o libCriticalGC.dylib CriticalGC.c

clean:
	rm CriticalGC.class libCriticalGC.so CriticalGC.h *.log

run-parallel:
	time java ${JVM_OPTS} -XX:+UseParallelGC CriticalGC

run-cms:
	time java ${JVM_OPTS} -XX:+UseConcMarkSweepGC CriticalGC

run-g1:
	time java ${JVM_OPTS} -XX:+UseG1GC CriticalGC

run-shenandoah:
	time java ${JVM_OPTS} -XX:+UseShenandoahGC CriticalGC
