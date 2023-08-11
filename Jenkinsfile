pipeline {
    agent none
    stages {
        stage('mvn') {
            agent {
                docker { image 'maven:3.8.6-openjdk-11-slim' }
                // docker { image 'golang:1.19-bullseye' }
            }
            steps {
                sh 'mvn -v'
                sh 'ls -l'
                sh 'echo 123123 > ws1'
            }
        }
        stage('node') {
            agent {
                docker { image 'node-16:latest' }
            }
            steps {
                sh 'node --version'
                sh 'pwd'
                sh 'ls -la'
                archiveArtifacts artifacts: 'ws1', followSymlinks: false
            }
        }
    }
}