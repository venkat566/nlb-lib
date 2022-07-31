/* this is docker build file */

def call (appName, version, registry, dockerfileName) {

  echo "-------------- Docker build image with ${appName} with version ${version} ---------"
  def cmd = $/
  docker build -t ${appName}:${version} -f ${dockerfileName} .
  docker tag ${appName}:${version} ${registry}:8082/${appName}:${version}
  docker images -a
  /$
  shWrapper cmd

}
