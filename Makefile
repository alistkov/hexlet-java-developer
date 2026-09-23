install-dist:
	make clean
	./gradlew installDist

run-dist:
	./build/install/hexlet-java/bin/hexlet-java

clean:
	./gradlew clean

lint:
	./gradlew spotlessCheck

lint-fix:
	./gradlew spotlessApply

update:
	./gradlew dependencyUpdates

test:
	./gradlew test