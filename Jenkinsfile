pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}
