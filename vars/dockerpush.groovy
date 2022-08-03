/* This file is script to push image to nexus repo */

def call (appName, version, registry) {

  withDockerRegistry(credentialsId: 'nexus-admin', url: 'http://3.82.129.115:8082') {
    shWrapper 'docker push ${registry}/${appName}:${version}'
  }
}
