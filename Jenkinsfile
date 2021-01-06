pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Maven Deploy') {
            steps {
                withMaven([maven: 'maven', mavenSettingsConfig: 'mavensettings']){
                    sh 'mvn clean deploy'
                }
            }
        }
    }
}