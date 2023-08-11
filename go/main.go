package main

import (
	"flag"
	"fmt"
)

func main() {

	name := flag.String("name", "World", "Имя")
	flag.Parse()

	fmt.Printf("Hello, %s", *name)
}