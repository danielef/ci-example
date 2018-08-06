pipeline {
  agent {
    docker {
      image 'naartjie/alpine-lein'
      args '--user=root -v /opt/jenkins_files/cacerts:/usr/lib/jvm/java-8-oracle/jre/lib/security/cacerts -v /opt/jenkins_files/.lein:/root/.lein'
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
        sh 'cat $HOME/.lein/profiles.clj && lein deploy'
      }
    }
    stage('Distro') {
      steps {
        sh 'bin/make-distro.sh'
      }
    }
    stage('Publish') {          
      steps {
        withCredentials([string(credentialsId: 'IW_CI', variable: 'NEXUS_TOKEN')]) {
          sh 'bin/publish-distro.sh $NEXUS_TOKEN'
        }
      }
    }
  }
}