package mcframe.clientMAUB.MAUBP0390;

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
 * 画面"MAUBP_PurcContQty_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_PurcContQty_H_MC extends MAUBP_PurcContQty_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCRowBeans _cont_fctr_flg = null;
	protected MCRowBeans _qty = null;
	protected MCRowBeans _std_cont_fctr = null;
	protected MCRowBeans _act_cont_fctr = null;
	protected MCRowBeans _cont_fctr_dec_place = null;
	protected MCRowBeans _cont_fctr_rnd_typ = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_PurcContQty_H_MC() {
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
	protected MAUBP_PurcContQty_H_MC(mcframe.clientMAUB.MAUBP0390.PurcContQtyR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_PurcContQty START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_PurcContQty END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	boolean _cont_fctr_enable_flg = false;

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		_cont_fctr_enable_flg = convStringToBoolean(getSysParm("CONT_FCTR_ENABLE_FLG"));
		if (!_cont_fctr_enable_flg) {
			setComponentInvisibleAllStatus(PurcContQty_purc_cont_qty);
		}
	}

	protected boolean convStringToBoolean(String s) {
		return s.equals("1") ? true : false;
	}

	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cont_fctr_flg 有効成分対象ＦＬＧ
	 * @param qty 基準単位数量
	 * @param std_cont_fctr 標準有効成分係数
	 * @param act_cont_fctr 実際有効成分係数
	 * @param cont_fctr_dec_place 有効成分小数部有効桁数
	 * @param cont_fctr_rnd_typ 有効成分換算端数処理区分
	 */
	public void setRelateBeans(
		MCRowBeans cont_fctr_flg,
		MCRowBeans qty,
		MCRowBeans std_cont_fctr,
		MCRowBeans act_cont_fctr,
		MCRowBeans cont_fctr_dec_place,
		MCRowBeans cont_fctr_rnd_typ
	) {
		_cont_fctr_flg = cont_fctr_flg;
		_qty = qty;
		_std_cont_fctr = std_cont_fctr;
		_act_cont_fctr = act_cont_fctr;
		_cont_fctr_dec_place = cont_fctr_dec_place;
		_cont_fctr_rnd_typ = cont_fctr_rnd_typ;
	}

	protected MCRowBeans getContFctrFlg() {
		return _cont_fctr_flg;
	}

	protected MCRowBeans getQty() {
		return _qty;
	}

	protected MCRowBeans getStdContFtr() {
		return _std_cont_fctr;
	}

	protected MCRowBeans getActContFtr() {
		return _act_cont_fctr;
	}

	protected MCRowBeans getContFctrDecPlace() {
		return _cont_fctr_dec_place;
	}

	protected MCRowBeans getContFctrRndTyp() {
		return _cont_fctr_rnd_typ;
	}

	// モード設定

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setGUIMode();
		setGUILength();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

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

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setGUIMode();
		setGUILength();
	}


	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getStdContFtr() != null) {
			((MCLCBeans) getStdContFtr()).addLCListener(this);
		}

		if (getActContFtr() != null) {
			((MCLCBeans) getActContFtr()).addLCListener(this);
		}

		if (getContFctrDecPlace() != null) {
			((MCLCBeans) getContFctrDecPlace()).addLCListener(this);
		}

		if (getContFctrRndTyp() != null) {
			((MCLCBeans) getContFctrRndTyp()).addLCListener(this);
		}

		if (getQty() != null) {
			((MCLCBeans) getQty()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		// 標準有効成分係数・変更
		if (lc == getStdContFtr()) {
			doBeans_std_cont_fctr_LC(info);
		}

		// 実際有効成分係数・変更
		if (lc == getActContFtr()) {
			doBeans_act_cont_fctr_LC(info);
		}

		// 有効成分小数部有効桁数・変更
		if (lc == getContFctrDecPlace()) {
			doBeans_cont_fctr_dec_place_LC(info);
		}

		// 有効成分換算端数処理区分・変更
		if (lc == getContFctrRndTyp()) {
			doBeans_cont_fctr_rnd_typ_LC(info);
		}

		// 基準単位数量・変更
		if (lc == getQty()) {
			doBeans_qty_LC(info);
		}
	}

	/**
	 * 標準有効成分係数が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_std_cont_fctr_LC(MCEventInfo info) {
		if (!isNull(getContFctrFlg().getRowValue()) && (_cont_fctr_enable_flg)) {
			getPurcContQtyR().purc_cont_qty(getContQty());
			setGUILength();
		}
	}

	/**
	 * 実際有効成分係数が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_act_cont_fctr_LC(MCEventInfo info) {
		if (!isNull(getContFctrFlg().getRowValue()) && (_cont_fctr_enable_flg)) {
			getPurcContQtyR().purc_cont_qty(getContQty());
			setGUILength();
		}
	}

	/**
	 * 有効成分小数部有効桁数が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cont_fctr_dec_place_LC(MCEventInfo info) {
		if (_cont_fctr_enable_flg) {
			if (isNull(getContFctrDecPlace().getRowValue())) {
				setValueEx(PurcContQty_purc_cont_qty, null);
			}
			else {
				if (!isNull(getContFctrFlg().getRowValue())) {
					getPurcContQtyR().purc_cont_qty(getContQty());
					setGUILength();
				}
			}
			setGUIMode();
		}
	}

	/**
	 * 有効成分換算端数処理区分が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cont_fctr_rnd_typ_LC(MCEventInfo info) {
		if (!isNull(getContFctrFlg().getRowValue()) && (_cont_fctr_enable_flg)) {
			getPurcContQtyR().purc_cont_qty(getContQty());
			setGUILength();
		}
	}

	/**
	 * 基準単位数量が変更されたときに実行される。<br>
	 * <br>
	 * 有効成分を計算し設定する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_qty_LC(MCEventInfo info) {
		if (!isNull(getContFctrFlg().getRowValue()) && (_cont_fctr_enable_flg)) {
			getPurcContQtyR().purc_cont_qty(getContQty());
			setGUILength();
		}
	}

	/**
	 * 有効成分を取得する。
	 *
	 * @return 有効成分
	 */
	protected MCNumber getContQty() {
		MCNumber val = null;

		if ((Boolean)getContFctrFlg().getRowValue()) {
			Comparable<?> qty = getQty().getRowValue();
			Comparable<?> std_cont_fctr = getStdContFtr().getRowValue();
			Comparable<?> act_cont_fctr = getActContFtr().getRowValue();
			Comparable<?> cont_fctr_dec_place = getContFctrDecPlace().getRowValue();
			Comparable<?> cont_fctr_rnd_typ = getContFctrRndTyp().getRowValue();

			if (!isNull((MCNumber)act_cont_fctr)) {
				std_cont_fctr = act_cont_fctr;
			}

			val = convToContFctrUnit(
				(MCNumber)qty,
				(MCNumber)std_cont_fctr,
				(MCNumber)cont_fctr_dec_place,
				(String)cont_fctr_rnd_typ);
		}

		return val;
	}

	/**
	 * GUI 部品の桁数を設定する。<br>
	 * 小数部有効桁数に合わせて、数量の桁数を設定する。
	 */
	protected void setGUILength() {
		Comparable<?> val = getContFctrDecPlace().getRowValue();
		MAUCP_UnitUtil.setLength(PurcContQty_purc_cont_qty, (MCNumber)val);
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 仕入有効成分部品が入力可能なモードでも、<br>
	 * 連携する有効成分小数部有効桁数がnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == PurcContQty_purc_cont_qty && isDefaultModeEditable(compo)) {
			if (isNull(getContFctrDecPlace().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}