package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

import java.util.Date;

/**
 * Created by Tony on 12/29/2016.
 */
public class MpCreator extends ItemCreator{
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성했습니다. " + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
