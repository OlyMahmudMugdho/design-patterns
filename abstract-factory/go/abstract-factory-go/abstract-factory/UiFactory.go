package abstractfactory

import abstractproduct "github.com/OlyMahmudMugdho/design-patterns/abstract-factory/abstract-product"

type UiFactory interface {
	CreateButton() abstractproduct.Button
}
