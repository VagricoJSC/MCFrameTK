package mcframe.clientMAUB.MAUBP0070;

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
 * 画面"MAUBP_Upri_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Upri_H_MC extends MAUBP_Upri_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Upri_H_MC() {
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
	protected MAUBP_Upri_H_MC(mcframe.clientMAUB.MAUBP0070.UpriR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Upri START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Upri END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _cur;
	protected MCRowBeans _decPlace;
	protected MCRowBeans _trdCurUpri;
	protected MCRowBeans _xrate;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param upriDecPlace 単価小数部有効桁数部品
	 */
	public void setRelateBeans(MCRowBeans cur, MCRowBeans upriDecPlace) {
		_cur = cur;
		_decPlace = upriDecPlace;
	}
	protected MCRowBeans getCur() {
		return _cur;
	}
	protected MCRowBeans getDecPlace() {
		return _decPlace;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * <b>基準通貨単価、納税通貨単価</b>として振る舞います。
	 * 
	 * @param cur 通貨部品（基準通貨単価、納税通貨単価）
	 * @param upriDecPlace 単価小数部有効桁数部品
	 * @param trdCurAmt 取引通貨単価部品
	 * @param xrate 為替レート部品
	 */
	public void setRelateBeans(
			MCRowBeans cur,
			MCRowBeans upriDecPlace, 
			MCRowBeans trdCurUpri, 
			MCRowBeans xrate) {

		_cur = cur;
		_decPlace = upriDecPlace;
		_trdCurUpri = trdCurUpri;
		_xrate = xrate;
	}
	protected MCRowBeans getTrdCurUpri() {
		return _trdCurUpri;
	}
	protected MCRowBeans getXrate() {
		return _xrate;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getCur()).addLCListener(this);
		((MCLCBeans) getDecPlace()).addLCListener(this);

		if (getTrdCurUpri() != null) {
			((MCLCBeans) getTrdCurUpri()).addLCListener(this);
		}
		if (getXrate() != null) {
			((MCLCBeans) getXrate()).addLCListener(this);
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
		else if(lc == getTrdCurUpri()){
			doBeans_trd_cur_upri_LC(info);
		}
		else if(lc == getXrate()){
			doBeans_xrate_LC(info);
		}
	}

	/**
	 * 通貨ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 単価をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_cur_cd_LC(MCEventInfo info) {
		setValueEx(Upri_upri, null);
		
		setGUIMode();
		setGUILength();
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 単価をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * GUI 部品の桁数を設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 * @see #setGUILength()
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		setValueEx(Upri_upri, null);
		
		setGUIMode();
		setGUILength();
	}

	/**
	 * 取引通貨単価が変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨単価を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_cur_upri_LC(MCEventInfo info) {
		setValueEx(Upri_upri, getCurUpri());
	}

	/**
	 * 為替レートが変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨単価を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_xrate_LC(MCEventInfo info) {
		setValueEx(Upri_upri, getCurUpri());
	}

	protected MCNumber getCurUpri() {
		if (getTrdCurUpri() == null || getXrate() == null) {
			return null;
		}
		return convCur(
				(MCNumber) getTrdCurUpri().getRowValue(),
				(MCNumber) getXrate().getRowValue(),
				(MCNumber) getDecPlace().getRowValue(),
				getCo().xrate_rnd_typ());
	}

	/**
	 * GUI 部品の桁数を設定する。<br>
	 * 小数部有効桁数に合わせて、単価の桁数を設定する。
	 */
	protected void setGUILength() {
		Comparable<?> val = getDecPlace().getRowValue();
		MAUCP_AmtUtil.setAmtLength(Upri_upri, (MCNumber)val);
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
	 * 単価部品が入力可能なモードでも、連携する通貨がnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == Upri_upri && isDefaultModeEditable(compo)) {
			if (isNull(getCur().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}