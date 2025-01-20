package concretefactory

import (
	abstractproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-product"
	concreteproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/concrete-product"
)

type MacFactory struct{}

func NewMacFactory() *MacFactory {
	return &MacFactory{}
}

func (mf *MacFactory) CreateButton() abstractproduct.Button {
	return new(concreteproduct.MacButton)
}
