pipeline {
    agent any

    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }

    stages {
        stage('Build') {
            steps {
                sh 'printenv'
            }
        }
        stage('Meh'){
            environment{
                DISABLE_AUTH = 'false'
            }
            steps{
                sh 'printenv'
            }
        }
    }
}