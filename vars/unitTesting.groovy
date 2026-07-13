def call(Map params = [:]) {

    echo "Starting Unit Test execution"

    sh '''
        npm install
        npm test -- --passWithNoTests
    '''

    echo "Unit Test execution completed successfully"
}