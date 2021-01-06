pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Maven Deploy') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}