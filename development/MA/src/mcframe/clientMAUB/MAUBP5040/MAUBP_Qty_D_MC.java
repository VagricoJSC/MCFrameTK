package mcframe.clientMAUB.MAUBP5040;

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
 * 画面"MAUBP_Qty_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Qty_D_MC extends MAUBP_Qty_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Qty_D_MC() {
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
	public MAUBP_Qty_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected boolean _clearQtyFlg = false;
	protected MCBeans _itmCd = null;
	protected MCBeans _itmSub1 = null;
	protected MCBeans _itmSub2 = null;
	protected MCBeans _itmSub3 = null;
	protected MCBeans _baseUnit = null;

	protected MCBeans _unit;
	protected MCBeans _decPlace;
	protected MCBeans _rndTyp;
	protected MCBeans _inptQty;
	protected MCBeans _convBaseQty;
	protected MCBeans _convQty;

	protected boolean _checkLgGrpFlg = false;
	protected MCBeans _frLgGrpCd;
	protected MCBeans _toLgGrpCd;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param itmCd 品目部品
	 * @param itmSub1 枝番１部品
	 * @param itmSub2 枝番２部品
	 * @param itmSub3 枝番３部品
	 * @param unit 単位部品
	 * @param decPlace 単位の小数部有効桁数部品
	 * @param rndTyp 単位の端数処理区分部品
	 * @param convBaseQty 単位の換算基準数量部品
	 * @param convQty 単位の換算数量部品
	 * @param baseUnit 基準単位部品
	 */
	public void setRelateBeans(
		MCBeans itmCd,
		MCBeans itmSub1,
		MCBeans itmSub2,
		MCBeans itmSub3, 
		MCBeans unit,
		MCBeans decPlace,
		MCBeans rndTyp, 
		MCBeans convBaseQty, 
		MCBeans convQty,
		MCBeans baseUnit) {
		_itmCd = itmCd;
		_itmSub1 = itmSub1;
		_itmSub2 = itmSub2;
		_itmSub3 = itmSub3;
		_unit = unit;
		_decPlace = decPlace;
		_rndTyp = rndTyp;
		_convBaseQty = convBaseQty;
		_convQty = convQty;
		_baseUnit = baseUnit;
	}
	protected MCBeans getItmCd() {
		return _itmCd;
	}
	protected MCBeans getItmSub1() {
		return _itmSub1;
	}
	protected MCBeans getItmSub2() {
		return _itmSub2;
	}
	protected MCBeans getItmSub3() {
		return _itmSub3;
	}
	protected MCBeans getBaseUnit() {
		return _baseUnit;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param unit 単位部品
	 * @param decPlace 単位の小数部有効桁数部品
	 */
	public void setRelateBeans(
			MCBeans unit,
			MCBeans decPlace) {

		_unit = unit;
		_decPlace = decPlace;
		_clearQtyFlg = true;
	}
	protected MCBeans getUnit() {
		return _unit;
	}
	protected MCBeans getDecPlace() {
		return _decPlace;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * <b>基準単位数量</b>として振る舞います。
	 * 
	 * @param unit 基準単位部品
	 * @param decPlace 基準単位の小数部有効桁数部品
	 * @param rndTyp 基準単位の端数処理区分部品
	 * @param inptQty 入力単位数量部品
	 * @param convBaseQty 入力単位の換算基準数量部品
	 * @param convQty 入力単位の換算数量部品
	 */
	public void setRelateBeans(
			MCBeans unit, 
			MCBeans decPlace, 
			MCBeans rndTyp, 
			MCBeans inptQty, 
			MCBeans convBaseQty, 
			MCBeans convQty) {

		_unit = unit;
		_decPlace = decPlace;
		_rndTyp = rndTyp;
		_inptQty = inptQty;
		_convBaseQty = convBaseQty;
		_convQty = convQty;
		_clearQtyFlg = true;
	}
	protected MCBeans getRndTyp() {
		return _rndTyp;
	}
	protected MCBeans getInptQty() {
		return _inptQty;
	}
	protected MCBeans getConvBaseQty() {
		return _convBaseQty;
	}
	protected MCBeans getConvQty() {
		return _convQty;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param unit 単位部品
	 * @param decPlace 単位の小数部有効桁数部品
	 * @param frLgGrpCd 移動元物流グループＣＤ
	 * @param toLgGrpCd 移動先物流グループＣＤ
	 */
	public void setRelateBeans(
			MCBeans unit,
			MCBeans decPlace,
			MCBeans frLgGrpCd,
			MCBeans toLgGrpCd) {

		_unit = unit;
		_decPlace = decPlace;
		_frLgGrpCd = frLgGrpCd;
		_toLgGrpCd = toLgGrpCd;
		_clearQtyFlg = true;
		_checkLgGrpFlg = true;
	}
	protected MCBeans getFrLgGrpCd() {
		return _frLgGrpCd;
	}
	protected MCBeans getToLgGrpCd() {
		return _toLgGrpCd;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getUnit()).addLCListener(this);
		((MCNCBeans) getUnit()).addNCListener(this);
		((MCLCBeans) getDecPlace()).addLCListener(this);

		if (getInptQty() != null) {
			((MCLCBeans) getInptQty()).addLCListener(this);
		}
		if (getItmCd() != null) {
			((MCNCBeans) getItmCd()).addNCListener(this);
		}
		if (getItmSub1() != null) {
			((MCNCBeans) getItmSub1()).addNCListener(this);
		}
		if (getItmSub2() != null) {
			((MCNCBeans) getItmSub2()).addNCListener(this);
		}
		if (getItmSub3() != null) {
			((MCNCBeans) getItmSub3()).addNCListener(this);
		}
		if (_checkLgGrpFlg) {
			((MCNCBeans) getFrLgGrpCd()).addNCListener(this);
			((MCNCBeans) getToLgGrpCd()).addNCListener(this);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getUnit() && _clearQtyFlg) {
			doBeans_unit_cd_NC(info);
		}
		else if (nc == getItmCd() || nc == getItmSub1() || nc == getItmSub2() || nc == getItmSub3()) {
			doBeans_itm_NC(info);
		}
		else if ((nc == getFrLgGrpCd() || nc == getToLgGrpCd()) && _clearQtyFlg) {
			doBeans_lg_grp_cd_NC(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getUnit()) {
			doBeans_unit_cd_LC(info);
		}
		else if(lc == getDecPlace() && _clearQtyFlg){
			doBeans_dec_place_LC(info);
		}
		else if(lc == getInptQty()){
			doBeans_inpt_qty_LC(info);
		}
	}

	/**
	 * 単位ＣＤが変更されたときに実行される。<br>
	 * LCイベントだとリストロジックで補完する項目のLCイベント含めて、最後に実行されるため、
	 * 単位のリストロジックのOUT項目である単位換算数に数量部品を使用すると、単位のLC
	 * イベントで数量がクリアされてしまう。そのため、単位変更時の数量のクリアはNCイベントに
	 * 実装する。
	 * <br>
	 * 数量をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_unit_cd_NC(MCEventInfo info) {
		clearQty(info.getEventIndex());
	}

	/**
	 * 単位ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 基準単位数量として動作する場合、基準数量を設定する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_unit_cd_LC(MCEventInfo info) {
		if (isNull(getBeansValue(getUnit(), info.getEventIndex()))) {
			clearQty(info.getEventIndex());
			return;
		}
		setQty(info);
		setBaseUnitQty(info.getEventIndex());
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。
	 * 基準単位数量として動作する場合、基準数量を設定する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		clearQty(info.getEventIndex());
	}
	
	/**
	 *品目が変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_NC(MCEventInfo info) {
		clearUnit(info.getEventIndex());
	}

	/**
	 * 入力単位数量が変更されたときに実行される。<br>
	 * <br>
	 * 基準単位数量を計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_inpt_qty_LC(MCEventInfo info) {
		setBaseUnitQty(info.getEventIndex());
	}

	/**
	 * 移動元物流グループＣＤまたは移動先物流グループＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_lg_grp_cd_NC(MCEventInfo info) {
		clearQty(info.getEventIndex());
	}

	protected void clearUnit(int i) {
		// ヘッダ
		if (getUnit() instanceof MCRowBeans) {
			setValueEx((MCRowBeans)getUnit(), null);
		}
		// 明細
		else {
			// 変更対象がヘッダの場合（全てクリア）
			if (i < 0) {
				for (QtyR r : exceptBaseEmpty(QtyTable)) {
					setValueEx((MCColumnConfig)getUnit(), r.getGUIIndex(), null);
				}
			}
			// 変更対象が明細の場合（指定された行のみクリア）
			else {
				setValueEx((MCColumnConfig)getUnit(), i, null);
			}
		}
	}

	protected void clearQty(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (QtyR r : exceptBaseEmpty(QtyTable)) {
				setValueEx(columnQty_qty, r.getGUIIndex(), null);
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnQty_qty, i, null);
		}
	}

	protected void setQty(MCEventInfo info) {
		String preUnit_cd = (String)info.getOldValue();
		int idx = info.getEventIndex();

		// 変更対象がヘッダの場合（全て再計算）
		if (idx < 0) {
			for (QtyR r : exceptBaseEmpty(QtyTable)) {
				int i = r.getGUIIndex();

				if (isNull(getBeansValue(columnQty_qty, i))) {
					continue;
				}

				MCRow rowPre = getItmUnit(
					(String)getBeansValue(getItmCd(), i), 
					(String)getBeansValue(getItmSub1(), i), 
					(String)getBeansValue(getItmSub2(), i), 
					(String)getBeansValue(getItmSub3(), i), 
					preUnit_cd, 
					(String)getBeansValue(getBaseUnit(), i),
					(MCRootPanel)this);

				if (isNull(rowPre)) {
					continue;
				}

				MCNumber ret = null;

				// 基準単位から基準単位以外の単位へ単位変換
				if (rowPre.getBoolean("base_unit_flg")) {
					ret = rvrsBaseUnitConv(
						(MCNumber)getBeansValue(columnQty_qty, i),
						(MCNumber)getBeansValue(getConvBaseQty(), i),
						(MCNumber)getBeansValue(getConvQty(), i),
						(MCNumber)getBeansValue(getDecPlace(), i),
						(String)getBeansValue(getRndTyp(), i));
				}
				else {
					// 基準単位以外の単位から基準単位へ単位変換
					if (isSame(getBeansValue(getUnit() , i),
							getBeansValue(getBaseUnit(), i))) {
						ret = convToBaseUnit(
							(MCNumber)getBeansValue(columnQty_qty, i),
							(MCNumber)rowPre.getNumber("conv_base_qty"),
							(MCNumber)rowPre.getNumber("conv_qty"),
							(MCNumber)getBeansValue(getDecPlace(), i),
							(String)getBeansValue(getRndTyp(), i));
					}
					// 基準単位以外の単位から、別の基準単位以外の単位へ変換
					else {
						ret = unitConv(
							(MCNumber)getBeansValue(columnQty_qty, i),
							(MCNumber)rowPre.getNumber("conv_base_qty"),
							(MCNumber)rowPre.getNumber("conv_qty"),
							(MCNumber)rowPre.getNumberNE("add_unit_dec_place"),
							(String)rowPre.getStringNE("add_unit_rnd_typ"),
							(MCNumber)getBeansValue(getConvBaseQty(), i),
							(MCNumber)getBeansValue(getConvQty(), i),
							(MCNumber)getBeansValue(getDecPlace(), i),
							(String)getBeansValue(getRndTyp(), i));
					}
				}
				clearQty(i);
				setValueEx(columnQty_qty, i, ret);
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			int i = info.getEventIndex();

			if (isNull(getBeansValue(columnQty_qty, i))) {
				return;
			}

			MCRow rowPre = getItmUnit(
				(String)getBeansValue(getItmCd(), i), 
				(String)getBeansValue(getItmSub1(), i), 
				(String)getBeansValue(getItmSub2(), i), 
				(String)getBeansValue(getItmSub3(), i), 
				preUnit_cd, 
				(String)getBeansValue(getBaseUnit(), i),
				(MCRootPanel)this);

			if (isNull(rowPre)) {
				return;
			}

			MCNumber ret = null;

			// 基準単位から基準単位以外の単位へ単位変換
			if (rowPre.getBoolean("base_unit_flg")) {
				ret = rvrsBaseUnitConv(
					(MCNumber)getBeansValue(columnQty_qty, i),
					(MCNumber)getBeansValue(getConvBaseQty(), i),
					(MCNumber)getBeansValue(getConvQty(), i),
					(MCNumber)getBeansValue(getDecPlace(), i),
					(String)getBeansValue(getRndTyp(), i));
			}
			else {
				// 基準単位以外の単位から基準単位へ単位変換
				if (isSame(getBeansValue(getUnit() , i),
						getBeansValue(getBaseUnit(), i))) {
					ret = convToBaseUnit(
						(MCNumber)getBeansValue(columnQty_qty, i),
						(MCNumber)rowPre.getNumber("conv_base_qty"),
						(MCNumber)rowPre.getNumber("conv_qty"),
						(MCNumber)getBeansValue(getDecPlace(), i),
						(String)getBeansValue(getRndTyp(), i));
				}
				// 基準単位以外の単位から、別の基準単位以外の単位へ変換
				else {
					ret = unitConv(
						(MCNumber)getBeansValue(columnQty_qty, i),
						(MCNumber)rowPre.getNumber("conv_base_qty"),
						(MCNumber)rowPre.getNumber("conv_qty"),
						(MCNumber)rowPre.getNumberNE("add_unit_dec_place"),
						(String)rowPre.getStringNE("add_unit_rnd_typ"),
						(MCNumber)getBeansValue(getConvBaseQty(), i),
						(MCNumber)getBeansValue(getConvQty(), i),
						(MCNumber)getBeansValue(getDecPlace(), i),
						(String)getBeansValue(getRndTyp(), i));
				}
			}

			clearQty(i);
			setValueEx(columnQty_qty, i, ret);
		}
	}

	protected void setBaseUnitQty(int i) {
		// 基準単位数量として初期化されていない場合は何もしない
		if (getInptQty() == null) {
			return;
		}
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (QtyR r : exceptBaseEmpty(QtyTable)) {
				setValueEx(columnQty_qty, r.getGUIIndex(), getBaseUnitQty(r.getGUIIndex()));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnQty_qty, i, getBaseUnitQty(i));
		}
	}

	protected MCNumber getBaseUnitQty(int i) {
		if (isNull(getBeansValue(getInptQty(), i))) {
			return null;
		}
		return convToBaseUnit(
				(MCNumber) getBeansValue(getInptQty(), i),
				(MCNumber) getBeansValue(getConvBaseQty(), i),
				(MCNumber) getBeansValue(getConvQty(), i),
				(MCNumber) getBeansValue(getDecPlace(), i),
				(String) getBeansValue(getRndTyp(), i));
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		QtyTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			return column == columnQty_qty;
		}

		@Override
		protected MCNumber getUnitDecPlace(int index, MCColumnConfig column) {
			if (isQtyColumn(column)) {
				return (MCNumber) getBeansValue(getDecPlace(), index);
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
		if (column == columnQty_qty) {
			if (isNull((MCNumber) getBeansValue(getDecPlace(), index))) {
				return MCMode.READ_ONLY;
			}
			if (_checkLgGrpFlg) {
				if (isNull(getBeansValue(getFrLgGrpCd(), index))
				 || isNull(getBeansValue(getToLgGrpCd(), index))
				 || isSame(getBeansValue(getFrLgGrpCd(), index), getBeansValue(getToLgGrpCd(), index))) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getCellMode(index, column);
	}

}