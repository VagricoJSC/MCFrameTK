package mcframe.clientMGUD.MGUDP0020;

import mcframe.clientCore.beans.table.MCCellConfig;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.commonCore.lang.MCNumber;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;

/**
 * 原価共通のセルコンフィグクラス<br>
 * セルコンフィグを設定する場合は基本的には本クラスを使用する。<br>
 */
abstract public class MGUDP_CellConfig_MC extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {

	@SuppressWarnings("deprecation")
	@Override
	public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {

		if (isPercentColumn(index, column, table)) {
			MCNumber decPlace = getPercentDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return (decPlace == null) ? -1 : decPlace.intValue();
		}

		String type = getPriorViewScaleType(index , column, table);
		if(type == null ){
			return super.getPriorViewScale(index, column, table);
		}
		else if(isSame(type,IfViewScale.AMT)){
			return getCostAmtDispDigit((MAUDP_PanelBase)table.getBaseRootPanel());
		}
		else if(isSame(type,IfViewScale.STD)){
			return getCostStdDispDigit((MAUDP_PanelBase)table.getBaseRootPanel());
		}
		else if(isSame(type,IfViewScale.UNIT)){
			return getCostUnitDispDigit((MAUDP_PanelBase)table.getBaseRootPanel());
		}
		else if(isSame(type,IfViewScale.RATE)){
			return getCostRateDispDigit((MAUDP_PanelBase)table.getBaseRootPanel());
		}
		else if(isSame(type,IfViewScale.INPUT)){
			MCCellConfig colCellConfig = column.getCellConfig();
			if(colCellConfig instanceof FXBAP_CellConfig){
				FXBAP_CellConfig xppCellConfig = (FXBAP_CellConfig)colCellConfig;
				return xppCellConfig.getCellScale(index, column, table);
			}
			return getCellScale(index, column, table);
		}
		return super.getPriorViewScale(index, column, table);
	}

	// 追加表示桁の設定用
	protected int _add_digit;
	public void setAddDigit(MCNumber digit) {
		if (isNull(digit)) {
			_add_digit = 0;
		}
		else {
			_add_digit = digit.intValueExact();
		}
	}
	public int getAddDigit() {
		if (isNull(_add_digit)) {
			_add_digit = 0;
		}
		return _add_digit;
	}

	@Override
	protected MCNumber getPercentDecPlace(int index, MCColumnConfig column) {
		return MCNumber.valueOf(
				getCostRateDispDigit((MAUDP_PanelBase) column.getBaseRootPanel()));
	}
}