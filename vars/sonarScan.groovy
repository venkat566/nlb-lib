def call () {


  echo "--- starting sonar scan ---"
  sh "mvn sonar:sonar"
}
