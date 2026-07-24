package mcframe.clientMAUD.MAUDP1050;

import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.meta.MCMeta;

public class MAUDP_DPartsCellConfig_MC extends MAUDP_CellConfig {
	/**
	 * 金額や単価に対応する小数部有効桁数を返す<br>
	 * 金額や単価の小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 * 
	 * @param index 小数部有効桁数を持つ通貨に対応するテーブルの行（通貨がヘッダの場合は引数は無効）
	 * @param column 設定対象のカラムコンフィグ（カラムによって返す小数部有効桁数が異なる場合に使用する）
	 * @return 小数部有効桁数
	 */
	protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
		return null;
	}
	
	/**
	 * 金額や単価カラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をする金額や単価カラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getAmtDecPlace で決定される桁数
	 * 
	 * @see getAmtDecPlace
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をする金額や単価カラムの場合にtrueを返す
	 */
	protected boolean isAmtColumn(MCColumnConfig column) {
		return false;
	}
	
	/**
	 * 数量に対応する小数部有効桁数を返す<br>
	 * 数量の小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 * 
	 * @param index 小数部有効桁数を持つ単位に対応するテーブルの行（単位がヘッダの場合は引数は無効）
	 * @param column 設定対象のカラムコンフィグ（カラムによって返す小数部有効桁数が異なる場合に使用する）
	 * @return 小数部有効桁数
	 */
	protected MCNumber getUnitDecPlace(int index, MCColumnConfig column) {
		return null;
	}
	
	/**
	 * 数量カラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をする数量カラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getUnitDecPlace で決定される桁数
	 * 
	 * @see getUnitDecPlace
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をする金額カラムの場合にtrueを返す
	 */
	protected boolean isQtyColumn(MCColumnConfig column) {
		return false;
	}

	@Override
	protected int getCustomScale(int index, MCColumnConfig column, MCTable table) {
	
		// 金額カラムのスケールは単位の小数部有効桁数で決定する
		if (isAmtColumn(column)) {
			MCNumber decPlace = getAmtDecPlace(index, column);
			return nullToZero(decPlace);
		}
		// 数量カラムのスケールは単位の小数部有効桁数で決定する
		if (isQtyColumn(column)) {
			MCNumber decPlace = getUnitDecPlace(index, column);
			return nullToZero(decPlace);
		}
		return super.getCustomScale(index, column, table);
	
	}
	
	@Override
	protected int getCustomLength(int index, MCColumnConfig column, MCTable table) {
		
		// 金額カラムのスケールは単位の小数部有効桁数で決定する
		if (isAmtColumn(column)) {
			MCNumber decPlace = getAmtDecPlace(index, column);
			return getLength(decPlace, column);
		}
		// 数量カラムのスケールは単位の小数部有効桁数で決定する
		if (isQtyColumn(column)) {
			MCNumber decPlace = getUnitDecPlace(index, column);
			return getLength(decPlace, column);
		}
		return super.getCustomLength(index, column, table);
		
	}
	
	protected int nullToZero(MCNumber num){
		return (num != null) ? num.intValue() : 0;
	}
	protected int getLength(MCNumber decPlace, MCColumnConfig column){
		
		if(decPlace == null){return 0;}
		
		MCMeta m = column.getMeta();
		int full = m.length();
		int sca  = m.scale();
		int dec = decPlace.intValue();
		
		return full - sca + dec;
	}
}

