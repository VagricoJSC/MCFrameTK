package mcframe.clientMAUB.MAUBP5060;

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
 * 画面"MAUBP_Upri_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Upri_D_MC extends MAUBP_Upri_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Upri_D_MC() {
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
	public MAUBP_Upri_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _cur;
	protected MCBeans _decPlace;
	protected MCBeans _itmCd;
	protected MCBeans _itmSub1;
	protected MCBeans _itmSub2;
	protected MCBeans _itmSub3;
	protected MCBeans _trdUnitCd;
	protected boolean _baseCurUpi = false;
	protected MCBeans _trdCurUpri;
	protected MCBeans _xrate;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param upriDecPlace 単価小数部有効桁数部品
	 */
	public void setRelateBeans(MCBeans cur, MCBeans upriDecPlace) {
		_cur = cur;
		_decPlace = upriDecPlace;
		_baseCurUpi = false;
	}
	protected MCBeans getCur() {
		return _cur;
	}
	protected MCBeans getDecPlace() {
		return _decPlace;
	}
	protected boolean isBaseCurUpri() {
		return _baseCurUpi;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur 通貨部品
	 * @param upriDecPlace 単価小数部有効桁数部品
	 * @param itmCd 品目ＣＤのGUI部品
	 * @param itmSub1 枝番１のGUI部品
	 * @param itmSub2 枝番２のGUI部品
	 * @param itmSub3 枝番３のGUI部品
	 * @param trdUnitCd 取引単位ＣＤのGUI部品
	 */
	public void setRelateBeans(MCBeans cur, MCBeans upriDecPlace
			, MCBeans itmCd
			, MCBeans itmSub1
			, MCBeans itmSub2
			, MCBeans itmSub3
			, MCBeans trdUnitCd) {
		_cur = cur;
		_decPlace = upriDecPlace;
		_itmCd = itmCd;
		_itmSub1 = itmSub1;
		_itmSub2 = itmSub2;
		_itmSub3 = itmSub3;
		_trdUnitCd = trdUnitCd;
		_baseCurUpi = false;
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
	protected MCBeans getTrdUnitCd() {
		return _trdUnitCd;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * <b>基準通貨単価、納税通貨単価</b>として振る舞います。
	 * 
	 * @param cur 通貨部品（基準通貨単価、納税通貨単価）
	 * @param upriDecPlace 単価小数部有効桁数部品
	 * @param trdCurUpri 取引通貨単価部品
	 * @param xrate 為替レート部品
	 */
	public void setRelateBeans(
			MCBeans cur, 
			MCBeans upriDecPlace, 
			MCBeans trdCurUpri, 
			MCBeans xrate) {

		_cur = cur;
		_decPlace = upriDecPlace;
		_trdCurUpri = trdCurUpri;
		_xrate = xrate;
		_baseCurUpi = true;
	}
	protected MCBeans getTrdCurUpri() {
		return _trdCurUpri;
	}
	protected MCBeans getXrate() {
		return _xrate;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) getCur()).addLCListener(this);
		((MCLCBeans) getDecPlace()).addLCListener(this);

		if (getItmCd() != null) {
			((MCLCBeans) getItmCd()).addLCListener(this);
		}
		if (getItmSub1() != null) {
			((MCLCBeans) getItmSub1()).addLCListener(this);
		}
		if (getItmSub2() != null) {
			((MCLCBeans) getItmSub2()).addLCListener(this);
		}
		if (getItmSub3() != null) {
			((MCLCBeans) getItmSub3()).addLCListener(this);
		}
		if (getTrdUnitCd() != null) {
			((MCLCBeans) getTrdUnitCd()).addLCListener(this);
		}
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
		else if(lc == getItmCd() || lc == getItmSub1() || lc == getItmSub2() || lc == getItmSub3()){
			doBeans_itm_LC(info);
		}
		else if(lc == getTrdUnitCd()){
			doBeans_trd_unit_cd_LC(info);
		}
		else if(lc == getXrate()){
			doBeans_xrate_LC(info);
		}
	}

	/**
	 * 通貨ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 取引通貨単価の場合はクリアする、基準通貨単価の場合は再計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cur_cd_LC(MCEventInfo info) {
		if (isBaseCurUpri()) {
			setBaseCurUpri(info.getEventIndex());
		}
		else {
			clearCurUpri(info.getEventIndex());
		}
	}
	
	/**
	 * 小数部有効桁数が変更されたときに実行される。<br>
	 * <br>
	 * 取引通貨単価の場合はクリアする、基準通貨単価の場合は再計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_dec_place_LC(MCEventInfo info) {
		if (isBaseCurUpri()) {
			setBaseCurUpri(info.getEventIndex());
		}
		else {
			clearCurUpri(info.getEventIndex());
		}
	}
	
	/**
	 *品目が変更されたときに実行される。<br>
	 * <br>
	 * 単価をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_LC(MCEventInfo info) {
		clearCurUpri(info.getEventIndex());
	}
	
	/**
	 *取引単位が変更されたときに実行される。<br>
	 * <br>
	 * 単価をクリアする。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_unit_cd_LC(MCEventInfo info) {
		clearCurUpri(info.getEventIndex());
	}

	/**
	 * 取引通貨単価が変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨単価を計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_cur_upri_LC(MCEventInfo info) {
		setBaseCurUpri(info.getEventIndex());
	}

	/**
	 * 為替レートが変更されたときに実行される。<br>
	 * <br>
	 * 基準通貨単価を計算する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_xrate_LC(MCEventInfo info) {
		setBaseCurUpri(info.getEventIndex());
	}

	protected void clearCurUpri(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (UpriR r : exceptBaseEmpty(UpriTable)) {
				setValueEx(columnUpri_upri, r.getGUIIndex(), null);
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnUpri_upri, i, null);
		}
	}

	protected void setBaseCurUpri(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (UpriR r : exceptBaseEmpty(UpriTable)) {
				setValueEx(columnUpri_upri, r.getGUIIndex(), getCurUpri(r.getGUIIndex()));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnUpri_upri, i, getCurUpri(i));
		}
	}
	protected MCNumber getCurUpri(int i) {
		if (getTrdCurUpri() == null || getXrate() == null) {
			return null;
		}
		return convCur(
				(MCNumber) getBeansValue(getTrdCurUpri(), i),
				(MCNumber) getBeansValue(getXrate(), i),
				(MCNumber) getBeansValue(getDecPlace(), i),
				getCo().xrate_rnd_typ());
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		UpriTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isUpriColumn(MCColumnConfig column) {
			return column == columnUpri_upri;
		}

		@Override
		protected MCNumber getUpriDecPlace(int index, MCColumnConfig column) {
			if (isUpriColumn(column)) {
				return (MCNumber) getBeansValue(getDecPlace(), index);
			}
			return super.getUpriDecPlace(index, column);
		}

		@Override
		protected int getCustomScale(int index, MCColumnConfig column,
				MCTable table) {

			// 単価カラムのスケールは通貨の小数部有効桁数で決定する
			if (isUpriColumn(column)) {
				MCNumber decPlace = getUpriDecPlace(index, column);
				return MAUCP_AmtUtil.nullToZero(decPlace);
			}
			return super.getCustomScale(index, column, table);
		}

		@Override
		protected int getCustomLength(int index, MCColumnConfig column,
				MCTable table) {

			// 単価カラムの桁数は通貨の小数部有効桁数で決定する
			if (isUpriColumn(column)) {
				MCNumber decPlace = getUpriDecPlace(index, column);
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
		if (column == columnUpri_upri) {
			if (isNull((MCNumber) getBeansValue(getDecPlace(), index))) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}