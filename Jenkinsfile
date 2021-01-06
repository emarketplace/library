pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Maven Deploy') {
            steps {
                withMaven() {
                    sh 'mvn clean deploy'
                }
            }
        }
    }
}