/* this is docker build file */

def call (appName, version) {
  echo "---- Docker build -----"
  sh '''
  docker build -t ${appName}:${version} .
  docker tag ${appName}:${version} 3.89.93.229:8082/${appName}:${version}
  docker images -a
  docker login -u admin -p admin 3.89.93.229:8082
  docker push 3.89.93.229:8082/${appName}:${version}
  '''
}
