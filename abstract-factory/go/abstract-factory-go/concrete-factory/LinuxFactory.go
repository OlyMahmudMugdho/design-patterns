package concretefactory

import (
	abstractproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-product"
	concreteproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/concrete-product"
)

type LinuxFactory struct{}

func NewLinuxFactory() *LinuxFactory {
	return &LinuxFactory{}
}

func (mf *LinuxFactory) CreateButton() abstractproduct.Button {
	return new(concreteproduct.LinuxButton)
}
