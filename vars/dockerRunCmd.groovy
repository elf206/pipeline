def call(String cmd = '-v') {
    sh script: "docker -v"
    sh script: "docker $cmd"
}
