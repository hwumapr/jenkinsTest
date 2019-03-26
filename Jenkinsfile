pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean build'
            }
        }
        stage('run') {
            steps {
                sh 'java -jar target/jenkinstest-1.0-SNAPSHOT-jar-with-dependencies.jar'
            }
        }
    }
}