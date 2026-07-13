def call(Map params = [:]) {

    withSonarQubeEnv('sonarqube') {

        sh '''
            sonar-scanner \
              -Dsonar.projectName=${SONAR_PROJECT_NAME} \
              -Dsonar.projectKey=${SONAR_PROJECT_KEY} \
              -Dsonar.sources=.
        '''
    }
}