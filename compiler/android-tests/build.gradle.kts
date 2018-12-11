
plugins {
    kotlin("jvm")
    id("jps-compatible")
}

jvmTarget = "1.6"

dependencies {
    compile(project(":compiler:util"))
    compile(project(":compiler:cli"))
    compile(project(":compiler:frontend"))
    compile(project(":compiler:backend"))
    compile(project(":kotlin-stdlib"))
    compileOnly("org.jetbrains:annotations:13.0")
    compile(project(":kotlin-reflect"))
    compile(projectTests(":compiler:tests-common"))
    compile(commonDep("junit:junit"))
    compileOnly(intellijDep()) { includeJars("openapi") }

    testCompile(project(":compiler:incremental-compilation-impl"))
    testCompile(project(":core:descriptors"))
    testCompile(project(":core:descriptors.jvm"))
    testCompile(project(":compiler:frontend.java"))
    testCompile(projectTests(":jps-plugin"))
    testCompile(commonDep("junit:junit"))
    testCompile(intellijDep()) { includeJars("openapi", "idea", "idea_rt", "groovy-all", "jps-builders", rootProject = rootProject) }
    testCompile(intellijDep("jps-standalone")) { includeJars("jps-model") }
    testCompile(intellijDep("jps-build-test"))
}

sourceSets {
    "main" { projectDefault() }
    "test" { projectDefault() }
}

projectTest {
    dependsOn(*testDistProjects.map { "$it:dist" }.toTypedArray())
    doFirst {
        environment("kotlin.tests.android.timeout", "45")
    }
    workingDir = rootDir
}
