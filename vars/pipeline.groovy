/* This is ci pipeline */

def call(config) {

  def appname = config.appname
  def version = config.version
  def projectType = config.projectType
  def buildcommand = config.buildcommand ? config.buildcommand : ''

  pipeline {
    agent any
    options {
      timeout(time: 60, unit: 'MINUTES')
    }

    stages {
      stage('Build') {
        steps {
          build(buildcommand, projectType)
        }
      }

      stage('Sonar') {
        steps {
          sonarScan()
        }
      }

      stage('Docker Build') {
        steps {
          dockerBuild(appname, version)
        }
      }

      stage('Push image to Nexus') {
        steps {
          publishImageToNexus(registry, appname, version)
        }
      }
    }
  }
}
