/* This is build script */

def call (config) {

  echo ' ----------- Starting build --------'
  def projectType = config.projectType

  def cmd = projectType
  sh 'cmd'

  switch(projectType) {
    case 'maven':
      return 'mvn clean package'
    case 'gradle':
      return 'gradle package'
    default:
      return "echo 'no projectType provided'"
  }

}
