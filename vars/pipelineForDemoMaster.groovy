def call(env){
    pipeline {
        agent { 
            docker { 
                label 'Docker'
                image 'bitnami/kubectl' 
            }
        }
        stages {
            stage('First Test') {
                steps {
                    script {
                            sh "kubectl version"
                    }
                }
            }
        }
    }
}