/* This is build script */

def call () {

  echo ' ----------- Starting build --------'
  shWrapper 'mvn clean package'
}
