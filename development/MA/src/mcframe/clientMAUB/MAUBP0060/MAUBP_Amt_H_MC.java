package mcframe.clientMAUB.MAUBP0060;

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
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Amt_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Amt_H_MC extends MAUBP_Amt_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Amt_H_MC() {
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
	protected MAUBP_Amt_H_MC(mcframe.clientMAUB.MAUBP0060.AmtR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Amt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Amt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _cur;
	protected MCRowBeans _decPlace;
	protected MCRowBeans _qty;
	protected MCRowBeans _upri;
	protected MCRowBeans _rndTyp;
	protected MCRowBeans _dscntAmt;
	protected MCRowBeans _trdCurAmt;
	protected MCRowBeans _xrate;
	protected MCRowBeans _baseCurAmt;
	protected MCRowBeans _taxRate;
	protected boolean _wtaxFlg = false;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param amtDecPlace 金額小数部有効桁数部品
	 */
	public void setRelateBeans(MCRowBeans cur, MCRowBeans amtDecPlace) {
		_cur = cur;
		_decPlace = amtDecPlace;
	}
	protected MCRowBeans getCur() {
		return _cur;
	}
	protected MCRowBeans getDecPlace() {
		return _decPlace;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param amtDecPlace 金額小数部有効桁数部品
	 * @param qty 数量部品
	 * @param upri 単価部品
	 * @param rndTyp 端数処理区分部品
	 * @param dscntAmt 値引金額部品。nullを指定した場合、値引金額を加味せずに金額計算します。
	 */
	public void setRelateBeans(MCRowBeans cur, MCRowBeans amtDecPlace, MCRowBeans qty, MCRowBeans upri, MCRowBeans rndTyp, MCRowBeans dscntAmt) {
		_cur = cur;
		_decPlace = amtDecPlace;
		_qty = qty;
		_upri = upri;
		_rndTyp = rndTyp;
		_dscntAmt = dscntAmt;
	}
	protected MCRowBeans getQty() {
		return _qty;
	}
	protected MCRowBeans getUpri() {
		return _upri;
	}
	protected MCRowBeans getRndTyp() {
		return _rndTyp;
	}
	protected MCRowBeans getDscntAmt() {
		return _dscntAmt;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * <b>基準通貨金額、納税通貨金額</b>として振る舞います。
	 * 
	 * @param cur 通貨部品（基準通貨、納税通貨）
	 * @param amtDecPlace 金額小数部有効桁数部品
	 * @param trdCurAmt 取引通貨金額部品
	 * @param xrate 為替レート部品
	 */
	public void setRelateBeans(
			MCRowBeans cur,
			MCRowBeans amtDecPlace, 
			MCRowBeans trdCurAmt, 
			MCRowBeans xrate) {

		_cur = cur;
		_decPlace = amtDecPlace;
		_trdCurAmt = trdCurAmt;
		_xrate = xrate;
	}
	protected MCRowBeans getTrdCurAmt() {
		return _trdCurAmt;
	}
	protected MCRowBeans getXrate() {
		return _xrate;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * <b>源泉税額</b>として振る舞います。
	 * 
	 * @param cur 基準通貨通貨部品
	 * @param amtDecPlace 金額小数部有効桁数部品
	 * @param amt 基準通貨金額部品
	 * @param taxRate 源泉税率部品
	 * @param wtaxFlg 源泉税額として使う場合trueを渡す
	 */
	public void setRelateBeans(
			MCRowBeans cur,
			MCRowBeans amtDecPlace, 
			MCRowBeans baseCurAmt, 
			MCRowBeans taxRate,
			boolean wtaxFlg) {

		_cur = cur;
		_decPlace = amtDecPlace;
		_baseCurAmt = baseCurAmt;
		_taxRate = taxRate;
		_wtaxFlg = wtaxFlg;
	}
	protected MCRowBeans getTaxRate() {
		return _taxRate;
	}
	protected MCRowBeans getBaseCurAmt() {
		return _baseCurAmt;
	}
	protected boolean getWtaxFlg() {
		return _wtaxFlg;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getCur()).addLCListener(this);
		((MCLCBeans) getDecPlace()).addLCListener(this);

		if (getQty() != null) {
			((MCLCBeans) getQty()).addLCListener(this);
		}
		if (getUpri() != null) {
			((MCLCBeans) getUpri()).addLCListener(this);
		}
		if (getRndTyp() != null) {
			((MCLCBeans) getRndTyp()).addLCListener(this);
		}
		if (getDscntAmt() != null) {
			((MCLCBeans) getDscntAmt()).addLCListener(this);
		}
		if (getTrdCurAmt() != null) {
			((MCLCBeans) getTrdCurAmt()).addLCListener(this);
		}
		if (getXrate() != null) {
			((MCLCBeans) getXrate()).addLCListener(this);
		}
		if (getBaseCurAmt() != null) {
			((MCLCBeans) getBaseCurAmt()).addLCListener(this);
		}
		if (getTaxRate() != null) {
			((MCLCBeans) getTaxRate()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getCur()) {
			doBeans_cur_cd_LC(info);
		}
		else if(lc == getDecPlace()){
			doBeans_dec_place_LC(info);
		}
		else if(lc == getQty()){
			doBeans_qty_LC(info);
		}
		else if(lc == getUpri()){
			doBeans_upri_LC(info);
		}
		else if(lc == getDscntAmt()){
			doBeans_dscnt_amt_LC(info);
		}
		else if(lc == getTrdCurAmt()){
			doBeans_trd_cur_amt_LC(info);
		}
		else if(lc == getXrate()){
			doBeans_xrate_LC(info);
		}
		else if(lc == getBaseCurAmt()){
			doBeans_base_cur_amt_LC(info);
		}
		else if(lc == getTaxRate()){
			doBeans_tax_rate_LC(info);
		}
	}

	/**
	 * 通貨ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 金額をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_cur_cd_LC(MCEventInfo info) {
		setValueEx(Amt_amt, null);
		
		setGUIMode();
		setGUILength();
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 金額をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		setValueEx(Amt_amt, null);
		
		setGUIMode();
		setGUILength();
	}

	/**
	 * 数量が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_qty_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getAmt());
	}

	/**
	 * 単価が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_upri_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getAmt());
	}

	/**
	 * 値引金額が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dscnt_amt_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getAmt());
	}

	/**
	 * 取引通貨金額が変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_cur_amt_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getCurAmt());
	}

	/**
	 * 為替レートが変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_xrate_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getCurAmt());
	}

	/**
	 * 基準通貨金額が変更されたときに実行される。<br>
	 * <br>
	 * 源泉税額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_base_cur_amt_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getWtaxAmt());
	}

	/**
	 * 税率が変更されたときに実行される。<br>
	 * <br>
	 * 源泉税額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_tax_rate_LC(MCEventInfo info) {
		setValueEx(Amt_amt, getWtaxAmt());
	}

	protected MCNumber getAmt() {
		if (getDscntAmt() == null) {
			return mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.getAmt(
					(MCNumber) getUpri().getRowValue(),
					(MCNumber) getQty().getRowValue(),
					(MCNumber) getDecPlace().getRowValue(),
					(String) getRndTyp().getRowValue()
					);
		}
		else {
			return mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.getAmt(
					(MCNumber) getUpri().getRowValue(),
					(MCNumber) getQty().getRowValue(),
					(MCNumber) getDecPlace().getRowValue(),
					(String) getRndTyp().getRowValue(),
					(MCNumber) getDscntAmt().getRowValue()
					);
		}
	}

	protected MCNumber getCurAmt() {
		if (getTrdCurAmt() == null || getXrate() == null) {
			return null;
		}
		return convCur(
				(MCNumber) getTrdCurAmt().getRowValue(),
				(MCNumber) getXrate().getRowValue(),
				(MCNumber) getDecPlace().getRowValue(),
				getCo().xrate_rnd_typ());
	}

	protected MCNumber getWtaxAmt() {
		if (!getWtaxFlg() || getBaseCurAmt() == null || getTaxRate() == null) {
			return null;
		}
		return MAUCP_AmtUtil.getTaxAmt(
				(MCNumber) getBaseCurAmt().getRowValue(),
				(MCNumber) getTaxRate().getRowValue(),
				(MCNumber) getDecPlace().getRowValue(),
				getCo().wtax_rnd_typ());
	}

	/**
	 * GUI 部品の桁数を設定する。<br>
	 * 小数部有効桁数に合わせて、金額の桁数を設定する。
	 */
	protected void setGUILength() {
		Comparable<?> val = getDecPlace().getRowValue();
		MAUCP_AmtUtil.setAmtLength(Amt_amt, (MCNumber)val);
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
	 * 金額部品が入力可能なモードでも、連携する通貨がnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == Amt_amt && isDefaultModeEditable(compo)) {
			if (isNull(getCur().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}