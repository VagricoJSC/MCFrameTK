package mcframe.clientMAUB.MAUBP0050;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Qty_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Qty_H_MC extends MAUBP_Qty_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Qty_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Qty_H_MC(mcframe.clientMAUB.MAUBP0050.QtyR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Qty START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Qty END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _unit;
	protected MCRowBeans _decPlace;
	protected MCRowBeans _rndTyp;
	protected MCRowBeans _inptQty;
	protected MCRowBeans _convBaseQty;
	protected MCRowBeans _convQty;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param unit 単位部品
	 * @param decPlace 単位の小数部有効桁数部品
	 */
	public void setRelateBeans(
			MCRowBeans unit,
			MCRowBeans decPlace) {

		_unit = unit;
		_decPlace = decPlace;
	}
	protected MCRowBeans getUnit() {
		return _unit;
	}
	protected MCRowBeans getDecPlace() {
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
	 * @param convQty 入力単位の換算数量数部品
	 */
	public void setRelateBeans(
			MCRowBeans unit, 
			MCRowBeans decPlace,
			MCRowBeans rndTyp,
			MCRowBeans inptQty, 
			MCRowBeans convBaseQty, 
			MCRowBeans convQty) {

		_unit = unit;
		_decPlace = decPlace;
		_rndTyp = rndTyp;
		_inptQty = inptQty;
		_convBaseQty = convBaseQty;
		_convQty = convQty;
	}
	protected MCRowBeans getRndTyp() {
		return _rndTyp;
	}
	protected MCRowBeans getInptQty() {
		return _inptQty;
	}
	protected MCRowBeans getConvBaseQty() {
		return _convBaseQty;
	}
	protected MCRowBeans getConvQty() {
		return _convQty;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getUnit()).addLCListener(this);
		((MCNCBeans) getUnit()).addNCListener(this);
		((MCLCBeans) getDecPlace()).addLCListener(this);

//		if (getRndTyp() != null) {
//			((MCLCBeans) getRndTyp()).addLCListener(this);
//		}
		if (getInptQty() != null) {
			((MCLCBeans) getInptQty()).addLCListener(this);
		}
//		if (getConvBaseQty() != null) {
//			((MCLCBeans) getConvBaseQty()).addLCListener(this);
//		}
//		if (getConvQty() != null) {
//			((MCLCBeans) getConvQty()).addLCListener(this);
//		}
	}

	@Override
	public void doNCEvent(MCNCBeans lc, MCEventInfo info) {
		super.doNCEvent(lc, info);

		if (lc == getUnit()) {
			doBeans_unit_cd_NC(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getUnit()) {
			doBeans_unit_cd_LC(info);
		}
		else if(lc == getDecPlace()){
			doBeans_dec_place_LC(info);
		}
//		else if(lc == getRndTyp()){
//			doBeans_rnd_typ_LC(info);
//		}
		else if(lc == getInptQty()){
			doBeans_inpt_qty_LC(info);
		}
//		else if(lc == getConvBaseQty()){
//			doBeans_conv_base_qty_LC(info);
//		}
//		else if(lc == getConvQty()){
//			doBeans_conv_qty_LC(info);
//		}
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
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_unit_cd_NC(MCEventInfo info) {
		clearQty();
	}

	/**
	 * 単位ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 基準単位数量として動作する場合、基準数量を設定する。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_unit_cd_LC(MCEventInfo info) {
		setGUILength();

		setBaseUnitQty();
		
		setGUIMode();
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 数量をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		setGUILength();
		
		clearQty();
		// 小数部有効桁数との連携では基準単位数量取得はしない
//		setBaseUnitQty();
		
		setGUIMode();
	}
//	
//	/**
//	 * 端数処理区分が変更されたときに実行される。<br>
//	 * <br>
//	 * 基準単位数量を計算する。<br>
//	 * 
//	 * @param info イベント情報
//	 */
//	protected void doBeans_rnd_typ_LC(MCEventInfo info) {
//		setBaseUnitQty();
//	}
	
	/**
	 * 入力単位数量が変更されたときに実行される。<br>
	 * <br>
	 * 基準単位数量を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_inpt_qty_LC(MCEventInfo info) {
		setBaseUnitQty();
	}
	
//	/**
//	 * 入力単位の基準数が変更されたときに実行される。<br>
//	 * <br>
//	 * 基準単位数量を計算する。<br>
//	 * 
//	 * @param info イベント情報
//	 */
//	protected void doBeans_conv_base_qty_LC(MCEventInfo info) {
//		setValueEx(Qty_qty, getBaseUnitQty());
//	}
//	
//	/**
//	 * 入力単位の換算数が変更されたときに実行される。<br>
//	 * <br>
//	 * 基準単位数量を計算する。<br>
//	 * 
//	 * @param info イベント情報
//	 */
//	protected void doBeans_conv_qty_LC(MCEventInfo info) {
//		setValueEx(Qty_qty, getBaseUnitQty());
//	}
	
	protected void clearQty() {
		setValueEx(Qty_qty, null);
	}

	protected void setBaseUnitQty() {
		// 基準単位数量として初期化されていない場合は何もしない
		if (getInptQty() == null) {
			return;
		}
		setValueEx(Qty_qty, getBaseUnitQty());
	}

	protected MCNumber getBaseUnitQty() {
		if (getInptQty() == null || isNull(getInptQty().getRowValue())) {
			return null;
		}
		return convToBaseUnit(
				(MCNumber) getInptQty().getRowValue(),
				(MCNumber) getConvBaseQty().getRowValue(),
				(MCNumber) getConvQty().getRowValue(),
				(MCNumber) getDecPlace().getRowValue(),
				(String) getRndTyp().getRowValue());
	}

	/**
	 * GUI 部品の桁数を設定する。<br>
	 * 小数部有効桁数に合わせて、数量の桁数を設定する。
	 */
	protected void setGUILength() {
		Comparable<?> val = getDecPlace().getRowValue();
		MAUCP_UnitUtil.setLength(Qty_qty, (MCNumber)val);
	}

	// モード設定

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		
		setGUIMode();
		setGUILength();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		
		setGUIMode();
		setGUILength();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		
		setGUIMode();
		setGUILength();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		
		setGUIMode();
		setGUILength();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		
		setGUIMode();
		setGUILength();
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 変更内容：
	 * 数量部品が入力可能なモードでも、連携する単位がnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == Qty_qty && isDefaultModeEditable(compo)) {
			if (isNull(getDecPlace().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}