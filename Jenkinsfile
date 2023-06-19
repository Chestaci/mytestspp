





 pipeline {
  agent any
  stages {
     stage("Build image") {
        steps {
        docker compose up
        }
       }
     }
  }






// pipeline {
//   agent any
//   stages {
//      stage("Build image") {
//         steps {
//     	catchError {
//       	   script {
//         	      docker.build("mytestspp", "-f Dockerfile .")
//       	     }
//           }
//        }
//     }
//      stage('Pull browser') {
//         steps {
//            catchError {
//               script {
//       	    docker.image('selenoid/chrome:114.0')
//       	      }
//            }
//         }
//      }
//      stage('Run tests') {
//         steps {
//            catchError {
//               script {
//           	     docker.image('aerokube/selenoid:1.10.4').withRun('-p 4444:4444 -v /run/docker.sock:/var/run/docker.sock -v $PWD:/etc/selenoid/',
//             	'-timeout 600s -limit 2') { c ->
//               	docker.image('mytestspp').inside("--link ${c.id}:selenoid") {
//                     	sh "mvn clean test"
//                 	    }
//                    }
//         	     }
//       	    }
//          }
//      }
//      stage('Reports') {
//         steps {
//            allure([
//       	   includeProperties: false,
//       	   jdk: '',
//       	   properties: [],
//       	   reportBuildPolicy: 'ALWAYS',
//       	   results: [[path: 'report']]
//     	   ])
//   	        }
//          }
//      }
// }