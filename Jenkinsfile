pipeline {
     agent { docker { image 'maven:3.3.3' } }

     environment {
        JANK_SECRET = credentials('SampleSecretText')
     }
     stages {
         stage('test') {
            steps{
                sh 'mvn test'
            }
         }
         stage('build') {
             steps {
                 sh 'mvn clean package'
             }
         }
         stage('run') {
             steps {
                 sh 'java -jar target/jenkinstest-1.0-SNAPSHOT-jar-with-dependencies.jar $JANK_SECRET'
             }
         }
         post {
             always {
                 archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
                 junit 'build/reports/**/*.xml'
             }
         }
     }
 }