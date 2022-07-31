/* This file is script to push image to nexus repo */

def call (appName, version, registry) {

  withDockerRegistry(credentialsId: 'nexus-admin', url: 'http://44.202.62.76:8082') {
    shWrapper 'docker push ${registry}:8082/${appName}:${version}'
  }
}
