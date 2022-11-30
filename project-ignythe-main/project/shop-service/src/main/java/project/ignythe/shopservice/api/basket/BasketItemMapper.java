package project.ignythe.shopservice.api.basket;

import project.ignythe.shopservice.domain.basket.BasketItem;

public class BasketItemMapper {
    public BasketItemResponse toBasketItemResponse(BasketItem basketItem){
        var item = basketItem.getItem();
        return new BasketItemResponse(
            item.getId(),
            item.getName(),
            item.getDescription()
        );
    }
}
