def call(String tag = 'my_tag') {
    sh script: "docker build -t $tag -f Dockerfile ."
}
