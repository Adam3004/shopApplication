package project.ignythe.shopservice.api.basket;

import project.ignythe.shopservice.domain.basket.Basket;
import project.ignythe.shopservice.domain.basket.BasketItem;

public class BasketMapper {

    public BasketResponse toBasketResponse(Basket basket) {
        return new BasketResponse(
                basket.getId(),
                basket.getName(),
                basket.getBasketItems().stream()
                        .map(this::basketItemDetails)
                        .toList());
    }

    public BasketResponse.BasketItemDetails basketItemDetails(BasketItem basketItem) {
        return new BasketResponse.BasketItemDetails(basketItem.getItem().getName(), basketItem.getItem().getDescription());
    }
}
