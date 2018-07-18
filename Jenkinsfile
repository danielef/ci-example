pipeline {
  agent {
    docker {
      image 'naartjie/alpine-lein'
      args '--user=root'
    }
    
  }
  stages {
    stage('Test') {
      steps {
        sh 'lein test'
      }
    }
    stage('Cobertura') {
      steps {
        sh 'lein cloverage'
      }
    }
    stage('jar') {
      steps {
        sh 'lein jar'
      }
    }
  }
}