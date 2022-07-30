/* This file is script to push image to nexus repo */

def call (appName, version) {

  withDockerRegistry(credentialsId: 'nexus-admin', url: 'http://3.89.93.229:8082') {
    sh '''docker push 3.89.93.229:8082/${appName}:${version}'''
  }
}
