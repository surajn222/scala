change-sdk:
	-File > Project Strucure > Project > SDK > Select SDK

build-jar-from-intellij:
	-File > Project Strucure > Artifacts > New > Add main class > Save
	-Build > Artifacts > JAR

build-jar:
	-sbt clean
	-sbt assembly

