def call(String tag = 'my_app') {

    def file = libraryResource 'Dockerfile'
    writeFile file: 'Dockerfile', text: file

    sh script: "docker build -t $tag -f Dockerfile ."
}
