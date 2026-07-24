package mcframe.clientMAUB.MAUBP5050;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Amt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Amt_D_MC extends MAUBP_Amt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Amt_D_MC() {
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
	public MAUBP_Amt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _cur;
	protected MCBeans _decPlace;
	protected MCBeans _qty;
	protected MCBeans _upri;
	protected MCBeans _rndTyp;
	protected MCBeans _dscntAmt;
	protected MCBeans _trdCurAmt;
	protected MCBeans _xrate;
	protected MCBeans _baseCurAmt;
	protected MCBeans _taxRate;
	protected boolean _wtaxFlg = false;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param amtDecPlace 金額小数部有効桁数部品
	 */
	public void setRelateBeans(MCBeans cur, MCBeans amtDecPlace) {
		_cur = cur;
		_decPlace = amtDecPlace;
	}
	protected MCBeans getCur() {
		return _cur;
	}
	protected MCBeans getDecPlace() {
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
	public void setRelateBeans(MCBeans cur, MCBeans amtDecPlace, MCBeans qty, MCBeans upri, MCBeans rndTyp, MCBeans dscntAmt) {
		_cur = cur;
		_decPlace = amtDecPlace;
		_qty = qty;
		_upri = upri;
		_rndTyp = rndTyp;
		_dscntAmt = dscntAmt;
	}
	protected MCBeans getQty() {
		return _qty;
	}
	protected MCBeans getUpri() {
		return _upri;
	}
	protected MCBeans getRndTyp() {
		return _rndTyp;
	}
	protected MCBeans getDscntAmt() {
		return _dscntAmt;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * <b>基準通貨金額、納税通貨金額</b>として振る舞います。
	 * 
	 * @param cur 通貨部品（基準通貨金額、納税通貨金額）
	 * @param amtDecPlace 金額小数部有効桁数部品
	 * @param trdCurAmt 取引通貨金額部品
	 * @param xrate 為替レート部品
	 */
	public void setRelateBeans(
			MCBeans cur, 
			MCBeans amtDecPlace, 
			MCBeans trdCurAmt, 
			MCBeans xrate) {

		_cur = cur;
		_decPlace = amtDecPlace;
		_trdCurAmt = trdCurAmt;
		_xrate = xrate;
	}
	protected MCBeans getTrdCurAmt() {
		return _trdCurAmt;
	}
	protected MCBeans getXrate() {
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
			MCBeans cur,
			MCBeans amtDecPlace, 
			MCBeans baseCurAmt, 
			MCBeans taxRate,
			boolean wtaxFlg) {

		_cur = cur;
		_decPlace = amtDecPlace;
		_baseCurAmt = baseCurAmt;
		_taxRate = taxRate;
		_wtaxFlg = wtaxFlg;
	}
	protected MCBeans getTaxRate() {
		return _taxRate;
	}
	protected MCBeans getBaseCurAmt() {
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
	 * 金額をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cur_cd_LC(MCEventInfo info) {
		setBaseCurAmt(info.getEventIndex());
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 金額をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		setBaseCurAmt(info.getEventIndex());
	}

	/**
	 * 数量が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_qty_LC(MCEventInfo info) {
		setAmt(info.getEventIndex());
	}

	/**
	 * 単価が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_upri_LC(MCEventInfo info) {
		setAmt(info.getEventIndex());
	}

	/**
	 * 値引金額が変更されたときに実行される。<br>
	 * <br>
	 * 金額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dscnt_amt_LC(MCEventInfo info) {
		setAmt(info.getEventIndex());
	}

	/**
	 * 取引通貨金額が変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨金額を計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_cur_amt_LC(MCEventInfo info) {
		setBaseCurAmt(info.getEventIndex());
	}

	/**
	 * 為替レートが変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨金額を計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_xrate_LC(MCEventInfo info) {
		setBaseCurAmt(info.getEventIndex());
	}

	/**
	 * 基準通貨金額が変更されたときに実行される。<br>
	 * <br>
	 * 源泉税額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_base_cur_amt_LC(MCEventInfo info) {
		setWtaxAmt(info.getEventIndex());
	}

	/**
	 * 税率が変更されたときに実行される。<br>
	 * <br>
	 * 源泉税額を計算する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_tax_rate_LC(MCEventInfo info) {
		setWtaxAmt(info.getEventIndex());
	}

	protected void setAmt(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (AmtR r : exceptBaseEmpty(AmtTable)) {
				setValueEx(columnAmt_amt, r.getGUIIndex(), getAmt(r.getGUIIndex()));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnAmt_amt, i, getAmt(i));
		}
	}
	
	protected MCNumber getAmt(int i) {
		if (getDscntAmt() == null) {
			return mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.getAmt(
					(MCNumber) getBeansValue(getUpri(), i),
					(MCNumber) getBeansValue(getQty(), i),
					(MCNumber) getBeansValue(getDecPlace(), i),
					(String) getBeansValue(getRndTyp(), i)
					);
		}
		else {
			return mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.getAmt(
					(MCNumber) getBeansValue(getUpri(), i),
					(MCNumber) getBeansValue(getQty(), i),
					(MCNumber) getBeansValue(getDecPlace(), i),
					(String) getBeansValue(getRndTyp(), i),
					(MCNumber) getBeansValue(getDscntAmt(), i)
					);
		}
	}

	protected void setBaseCurAmt(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (AmtR r : exceptBaseEmpty(AmtTable)) {
				setValueEx(columnAmt_amt, r.getGUIIndex(), getCurAmt(r.getGUIIndex()));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnAmt_amt, i, getCurAmt(i));
		}
	}
	protected MCNumber getCurAmt(int i) {
		if (getTrdCurAmt() == null || getXrate() == null) {
			return null;
		}
		return convCur(
				(MCNumber) getBeansValue(getTrdCurAmt(), i),
				(MCNumber) getBeansValue(getXrate(), i),
				(MCNumber) getBeansValue(getDecPlace(), i),
				getCo().xrate_rnd_typ());
	}

	protected void setWtaxAmt(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (AmtR r : exceptBaseEmpty(AmtTable)) {
				setValueEx(columnAmt_amt, r.getGUIIndex(), getWtaxAmt(r.getGUIIndex()));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnAmt_amt, i, getWtaxAmt(i));
		}
	}

	protected MCNumber getWtaxAmt(int i) {
		if (!getWtaxFlg() || getBaseCurAmt() == null || getTaxRate() == null) {
			return null;
		}
		return MAUCP_AmtUtil.getTaxAmt(
				(MCNumber) getBeansValue(getBaseCurAmt(), i),
				(MCNumber) getBeansValue(getTaxRate(), i),
				(MCNumber) getBeansValue(getDecPlace(), i),
				getCo().wtax_rnd_typ());
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		AmtTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			return column == columnAmt_amt;
		}

		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			if (isAmtColumn(column)) {
				return (MCNumber) getBeansValue(getDecPlace(), index);
			}
			return super.getAmtDecPlace(index, column);
		}

		@Override
		protected int getCustomScale(int index, MCColumnConfig column,
				MCTable table) {

			// 金額カラムのスケールは通貨の小数部有効桁数で決定する
			if (isAmtColumn(column)) {
				MCNumber decPlace = getAmtDecPlace(index, column);
				return MAUCP_AmtUtil.nullToZero(decPlace);
			}
			return super.getCustomScale(index, column, table);
		}

		@Override
		protected int getCustomLength(int index, MCColumnConfig column,
				MCTable table) {

			// 金額カラムの桁数は通貨の小数部有効桁数で決定する
			if (isAmtColumn(column)) {
				MCNumber decPlace = getAmtDecPlace(index, column);
				return MAUCP_AmtUtil.getAmtLength(column.getMeta(), decPlace);
			}
			return super.getCustomLength(index, column, table);
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnAmt_amt) {
			if (isNull((MCNumber) getBeansValue(getDecPlace(), index))) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}