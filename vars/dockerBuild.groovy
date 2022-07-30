/* this is docker build file */

def call (appname, version) {
  echo "---- Docker build -----"

  def cmd = $/
  docker build -t ${appname}:latest \
  .
  docker tag ${appname}:latest ${appname}:${version}
  /$

  sh "cmd"
}
