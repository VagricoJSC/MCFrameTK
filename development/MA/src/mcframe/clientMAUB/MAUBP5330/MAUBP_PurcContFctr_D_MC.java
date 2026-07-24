package mcframe.clientMAUB.MAUBP5330;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_PurcContFctr_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_PurcContFctr_D_MC extends MAUBP_PurcContFctr_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCBeans _cont_fctr_flg = null;
	protected MCBeans _qty = null;
	protected MCBeans _cont_qty = null;
	protected MCBeans _cont_fctr_dec_place = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_PurcContFctr_D_MC() {
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
	public MAUBP_PurcContFctr_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
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
			setComponentInvisibleAllStatus(columnPurcContFctr_purc_cont_fctr);
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
	 * @param cont_qty 仕入有効成分
	 * @param cont_fctr_dec_place 有効成分小数部有効桁数
	 */
	public void setRelateBeans(
		MCBeans cont_fctr_flg,
		MCBeans qty,
		MCBeans cont_qty,
		MCBeans cont_fctr_dec_place
	) {
		_cont_fctr_flg = cont_fctr_flg;
		_qty = qty;
		_cont_qty = cont_qty;
		_cont_fctr_dec_place = cont_fctr_dec_place;
	}

	protected MCBeans getContFctrFlg() {
		return _cont_fctr_flg;
	}

	protected MCBeans getQty() {
		return _qty;
	}

	protected MCBeans getContQty() {
		return _cont_qty;
	}

	protected MCBeans getContFctrDecPlace() {
		return _cont_fctr_dec_place;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getContQty() != null) {
			((MCLCBeans) getContQty()).addLCListener(this);
		}

		if (getContFctrDecPlace() != null) {
			((MCLCBeans) getContFctrDecPlace()).addLCListener(this);
		}

		if (getQty() != null) {
			((MCLCBeans) getQty()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		// 仕入有効成分
		if (lc == getContQty()) {
			doBeans_cont_qty_LC(info);
		}

		// 有効成分小数部有効桁数・変更
		if (lc == getContFctrDecPlace()) {
			doBeans_cont_fctr_dec_place_LC(info);
		}

		// 基準単位数量・変更
		if (lc == getQty()) {
			doBeans_qty_LC(info);
		}
	}

	/**
	 * 仕入有効成分が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cont_qty_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (getContFctrFlg() != null && (_cont_fctr_enable_flg)) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
			boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			PurcContFctrR r = getPurcContFctrL().get(info.getEventIndex());
			r.purc_cont_fctr(getContFctr(info, contFctrFlg));
		}
	}

	/**
	 * 有効成分小数部有効桁数が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cont_fctr_dec_place_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (_cont_fctr_enable_flg) {
			if (isNull(getBeansValue(getContFctrDecPlace(), info.getEventIndex()))) {
				setValueEx(columnPurcContFctr_purc_cont_fctr, info.getEventIndex(), null);
			}
			else {
				if (getContFctrFlg() != null) {
					MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
					boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

					PurcContFctrR r = getPurcContFctrL().get(info.getEventIndex());
					r.purc_cont_fctr(getContFctr(info, contFctrFlg));
				}
			}
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
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (getContFctrFlg() != null && (_cont_fctr_enable_flg)) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
			boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			PurcContFctrR r = getPurcContFctrL().get(info.getEventIndex());
			r.purc_cont_fctr(getContFctr(info, contFctrFlg));
		}
	}

	/**
	 * 有効成分係数を取得する。
	 *
	 * @return 有効成分
	 */
	protected MCNumber getContFctr(MCEventInfo info, boolean contFctrFlg) {
		MCNumber val = null;

		if (contFctrFlg) {
			MCColumnConfig conf = (MCColumnConfig) getQty();
			MCNumber qty = (MCNumber) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			conf = (MCColumnConfig) getContQty();
			MCNumber cont_qty = (MCNumber) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			conf = (MCColumnConfig) getContFctrDecPlace();
			MCNumber cont_fctr_dec_place = (MCNumber) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			val = calcContFctr(qty, cont_qty, cont_fctr_dec_place);
		}

		return val;
	}

}