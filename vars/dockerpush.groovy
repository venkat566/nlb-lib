/* This file is script to push image to nexus repo */

def call (appName, version) {
  withCredentials([usernamePassword(credentialsId: 'admin', passwordVariable: 'pwd', usernameVariable: 'username')]) {
    sh '''
    docker login -u ${username} -p ${pwd} 3.89.93.229:8082
    docker images -a
    docker push 3.89.93.229:8082/${appName}:${version}
    '''
  }
}
