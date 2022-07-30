/* This file is script to push image to nexus repo */

def call (registry, appname, version) {

  echo "--- push image to registry ----"

  sh """
  echo 'login to registry'
  docker login -u admin:admin http://54.226.215.168:8082/repository/nlb-docker/
  docker tag  ${appname}:${version} ${registry}:${version}
  docker push  ${registry}:${version}
  """.trim()




}
