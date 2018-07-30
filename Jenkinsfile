pipeline {
  agent {
    docker {
      image 'naartjie/alpine-lein'
      args '''--user=root
-v /opt/jenkins_files/cacerts:/etc/ssl/certs/java/cacerts
-v /opt/jenkins_files/.lein:/root/.lein'''
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
        sh 'lein cloverage --fail-threshold=80'
      }
    }
    stage('Package') {
      steps {
        sh 'lein jar'
      }
    }
    stage('Nexus') {
      steps {
        sh 'lein deploy'
      }
    }
  }
}