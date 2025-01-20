package concreteproduct

import "fmt"

type LinuxButton struct{}

// LinuxButton implementation
func (l *LinuxButton) Paint() {
	fmt.Println("Painting using Linux Button")
}
