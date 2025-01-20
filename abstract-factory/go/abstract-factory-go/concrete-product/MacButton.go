package concreteproduct

import "fmt"

type MacButton struct{}

// MacButton implementation
func (m *MacButton) Paint() {
	fmt.Println("Painting using Mac Button")
}
