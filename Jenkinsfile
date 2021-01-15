pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Maven Deploy') {
            steps {
                withMaven([maven: 'maven', mavenSettingsConfig: 'MAVEN_SETTINGS']) {
                    sh 'mvn clean deploy'
                }
            }
        }
    }
}