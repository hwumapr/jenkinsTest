pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'java -jar jenkinstest-1.0-SNAPSHOT.jar'
            }
        }
    }
}