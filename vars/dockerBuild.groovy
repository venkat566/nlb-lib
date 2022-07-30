/* this is docker build file */

def call (appname, version) {
  echo "---- Docker build -----"
  sh '''
  docker build -t ${appname}:${version} .

  '''
}
