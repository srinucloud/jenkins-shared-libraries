def call(Map params = [:]) {

    withSonarQubeEnv('sonarqube') {

        sh """
            sonar-scanner \
            -Dsonar.projectKey=${params.projectKey} \
            -Dsonar.projectName=${params.projectName} \
            -Dsonar.sources=${params.sources ?: 'src'}
        """
    }
}