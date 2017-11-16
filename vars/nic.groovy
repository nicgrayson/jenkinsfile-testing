def call() {
  pipeline {
    agent any

    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }

    stages {
      stage('Parameter Loading') {
        steps {
          echo "Parameters loaded from Library"
        }
      }
    }
  }
}
