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
                    sh 'cat https://oss.sonatype.org/content/repositories/snapshots/com/github/emarketplace/library/0.0.1-SNAPSHOT/maven-metadata.xml'
                }
            }
        }
    }
}