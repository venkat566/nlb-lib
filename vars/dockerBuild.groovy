/* this is docker build file */

def call (appName, version, registry, dockerfileName) {

  echo "-------------- Docker build image with ${appName} with version ${version} ---------"
  shWrapper 'docker build -t ${appName}:${version} -f ${dockerfileName} .'
  shWrapper 'docker tag ${appName}:${version} ${registry}/${appName}:${version}'
  
}
