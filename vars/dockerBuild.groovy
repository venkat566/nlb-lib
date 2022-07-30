/* this is docker build file */

def call (appName, version) {
  echo "---- Docker build -----"
  sh '''
  docker build -t ${appName}:${version} .

  '''
}
