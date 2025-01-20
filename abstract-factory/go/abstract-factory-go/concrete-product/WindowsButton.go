package concreteproduct

import "fmt"

type WindowsButton struct{}

// WindowsButton implementation
func (w *WindowsButton) Paint() {
	fmt.Println("Painting using Windows Button")
}
