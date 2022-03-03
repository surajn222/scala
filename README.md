# scala

###How to run this project:  
&emsp; Tested on intellij version: Community 2021.1  
&emsp; Open Java 1.8, installed from sdkman  
&emsp; Scala scala-sdk-2.12.12  

1. Download the code, open in intellij
2. change-sdk:
   -File > Project Strucure > Project > SDK > Select SDK
3. Reload sbt changes, to pull down all the jars. Once the refresh is done, check in the folder of External Libraries > scala, new jars should come up
4. Run > Run spark_init
5. Change the main function if required

Everytime sbt changes, click on the small red refresh button on the top right of the IDE. It will rebuild the project