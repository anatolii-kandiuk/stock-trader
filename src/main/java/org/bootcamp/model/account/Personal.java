package org.bootcamp.model.account;

import org.bootcamp.model.Trade;
import org.bootcamp.model.constant.Type;

public class Personal extends Account {

    public static final double SELL_FEE = 0.85;

    public Personal(double funds) {
        super(funds);
    }

    public Personal(Account source) {
        super(source);
    }

    @Override
    public Account clone() {
        return new Personal(this);
    }

    @Override
    public boolean makeTrade(Trade trade) {
        return Type.MARKET_BUY == trade.getType() ?
                super.executePurchase(trade, 0) : super.executeSale(trade, SELL_FEE);
    }
}
