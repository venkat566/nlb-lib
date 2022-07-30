/* This file is script to push image to nexus repo */

def call (appName, version) {
  withCredentials([usernamePassword(credentialsId: 'nexus-admin', passwordVariable: 'pwd', usernameVariable: 'uname')]) {
    // some block
    sh '''
    docker login -u $uname -p $pwd 3.89.93.229:8082
    docker images -a
    docker push 3.89.93.229:8082/${appName}:${version}
    '''
  }
}
