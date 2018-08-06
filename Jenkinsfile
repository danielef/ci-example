pipeline {
  agent {
    docker {
      args '--user=root -v /opt/jenkins_files/cacerts:/usr/lib/jvm/java-8-oracle/jre/lib/security/cacerts -v /opt/jenkins_files/.lein:/root/.lein'
      image 'interwaremx/alpine-lein-maven:1.0'
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
        withCredentials([usernameColonPassword(credentialsId: 'IW_CI', variable: 'NEXUS_TOKEN')]) {
          sh 'apk add --no-cache curl && bin/publish-distro.sh $NEXUS_TOKEN'
        }
      }
    }
  }
}
