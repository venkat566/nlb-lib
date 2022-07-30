/* Run shell command passed */

def call(cmd) {

  def fullCmd = $/
  set -x
  ${cmd}
  /$
  sh fullCmd
}
