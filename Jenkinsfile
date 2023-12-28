pipeline {
    agent any
    environment {
      JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
    }
    stages {
        stage("Check Environment Variables") {
            steps {
                script {
                    echo 'Checking Environment Variables...'
                    echo "PATH: ${env.PATH}"
                    echo "JAVA_HOME: ${env.JAVA_HOME}"
                    echo "SONARQUBE_SCANNER_HOME: ${env.SONARQUBE_SCANNER_HOME}"
                }
            }
        }
        stage("build & sonarqube") {
            steps {
                script {
                    withSonarQubeEnv('SonarQube_server') {
                        bat "sonar-scanner -Dsonar.projectKey=compiladores -Dsonar.sources=src -Dsonar.java.binaries=."
                    }
                }
            }
        }
    }
}