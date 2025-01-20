package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"

	abstractfactory "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-factory"
	abstractproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-product"
	concretefactory "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/concrete-factory"
)

func main() {

	var osName string

	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter OS name: ")
	osName, _ = reader.ReadString('\n')
	osName = strings.Trim(osName, "\n")
	osName = strings.ToLower(osName)

	var factory abstractfactory.UiFactory
	var button abstractproduct.Button

	if osName == "linux" {
		factory = concretefactory.NewLinuxFactory()
	}

	if osName == "mac" {
		factory = concretefactory.NewMacFactory()
	}

	if osName == "windows" {
		factory = concretefactory.NewWindowsFactory()
	} else {
		fmt.Println("Invalid OS")
		os.Exit(0) // Exit the program with status 0 (success)
		// os.Exit(1) // Exit the program with status 1 (failure)
	}

	button = factory.CreateButton()
	button.Paint()

}
