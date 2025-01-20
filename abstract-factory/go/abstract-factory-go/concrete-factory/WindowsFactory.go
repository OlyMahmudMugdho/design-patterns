package concretefactory

import (
	abstractproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-product"
	concreteproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/concrete-product"
)

type WindowsFactory struct{}

func NewWindowsFactory() *WindowsFactory {
	return &WindowsFactory{}
}

// WindowsButton implementation
func (wf *WindowsFactory) CreateButton() abstractproduct.Button {
	return new(concreteproduct.WindowsButton)
}
