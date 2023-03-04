package org.bootcamp.model.account;

import org.bootcamp.model.Trade;
import org.bootcamp.model.constant.Type;

public class TFSA extends Account {

    public static final double TRADE_FEE = 0.01;

    public TFSA(double funds) {
        super(funds);
    }

    public TFSA(Account source) {
        super(source);
    }

    @Override
    public Account clone() {
        return new TFSA(this);
    }

    @Override
    public boolean makeTrade(Trade trade) {
        return Type.MARKET_BUY == trade.getType() ?
                super.executePurchase(trade, TRADE_FEE) : super.executeSale(trade, TRADE_FEE);
    }
}
