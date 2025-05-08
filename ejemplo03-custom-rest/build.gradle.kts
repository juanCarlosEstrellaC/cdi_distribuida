plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {


    //CDI: Weld
    // https://mvnrepository.com/artifact/org.jboss.weld.se/weld-se-core
   // implementation("org.jboss.weld.se:weld-se-core:6.0.2.Final")

    //implementation("org.jboss.weld.se:weld-se-core:6.0.2.Final")
   // https://mvnrepository.com/artifact/io.smallrye/jandex
    //implementation("io.smallrye:jandex:3.2.7")

    //REST: usando RESTEasy
    // https://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-core
    implementation("org.jboss.resteasy:resteasy-core:6.2.12.Final")

    //Necesitamos un servidor

    implementation("org.jboss.resteasy:resteasy-undertow-cdi:6.2.12.Final")

}

sourceSets {
    main {
        output.setResourcesDir( file("${buildDir}/classes/java/main") )
    }}