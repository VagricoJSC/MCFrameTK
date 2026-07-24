package mcframe.clientMAUB.MAUBP5340;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUC.MAUCP0110.MAUCP_UnitUtil;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_WkCostQty_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_WkCostQty_D_MC extends MAUBP_WkCostQty_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_WkCostQty_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_WkCostQty_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _unit;
	protected MCBeans _decPlace;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param unit 単位部品
	 * @param decPlace 小数部有効桁数部品
	 */
	public void setRelateBeans(MCBeans unit, MCBeans decPlace) {
		_unit = unit;
		_decPlace = decPlace;
	}
	protected MCBeans getUnitB() {
		return _unit;
	}
	protected MCBeans getDecPlaceB() {
		return _decPlace;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getUnitB()).addLCListener(this);
		((MCLCBeans) getDecPlaceB()).addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getUnitB()) {
			doBeans_unit_cd_LC(info);
		}
		else if(lc == getDecPlaceB()){
			doBeans_dec_place_LC(info);
		}
	}

	/**
	 * 単位ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_unit_cd_LC(MCEventInfo info) {
		clearQty(info.getEventIndex());
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		clearQty(info.getEventIndex());
	}

	/**
	 * 数量をクリアする。<br>
	 * 
	 * @param i イベント行のインデックス
	 */
	protected void clearQty(int i) {
		// 単位がヘッダの場合
		if (i < 0) {
			for (WkCostQtyR r : exceptBaseEmpty(WkCostQtyTable)) {
				setValueEx(columnWkCostQty_wk_cost_qty, r.getGUIIndex(), null);
			}
		}
		// 単位が明細の場合
		else {
			setValueEx(columnWkCostQty_wk_cost_qty, i, null);
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		WkCostQtyTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			return column == columnWkCostQty_wk_cost_qty;
		}

		@Override
		protected MCNumber getUnitDecPlace(int index, MCColumnConfig column) {
			if (isQtyColumn(column)) {
				return (MCNumber) getBeansValue(getDecPlaceB(), index);
			}
			return super.getUnitDecPlace(index, column);
		}

		@Override
		protected int getCustomScale(int index, MCColumnConfig column,
				MCTable table) {

			// 数量カラムのスケールは単位の小数部有効桁数で決定する
			if (isQtyColumn(column)) {
				MCNumber decPlace = getUnitDecPlace(index, column);
				return MAUCP_UnitUtil.nullToZero(decPlace);
			}
			return super.getCustomScale(index, column, table);
		}

		@Override
		protected int getCustomLength(int index, MCColumnConfig column,
				MCTable table) {

			// 数量カラムの桁数は単位の小数部有効桁数で決定する
			if (isQtyColumn(column)) {
				MCNumber decPlace = getUnitDecPlace(index, column);
				return MAUCP_UnitUtil.getLength(column.getMeta(), decPlace);
			}
			return super.getCustomLength(index, column, table);
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnWkCostQty_wk_cost_qty) {
			if (isNull((MCNumber) getBeansValue(getDecPlaceB(), index))) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}