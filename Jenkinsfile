pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('check mvn') {
            steps {
                sh 'mvn --version'
            }
        }

         stage('test') {
            steps {
                sh 'mvn test'
            }
        }

         stage('build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}