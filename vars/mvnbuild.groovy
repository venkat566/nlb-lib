/* This is build script */

def call () {

  echo ' ----------- Starting build --------'
  sh '''
  mvn --version
  mvn clean package
  '''
}
