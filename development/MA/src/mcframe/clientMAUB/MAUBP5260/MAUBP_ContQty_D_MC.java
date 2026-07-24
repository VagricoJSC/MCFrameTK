package mcframe.clientMAUB.MAUBP5260;

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
 * 画面"MAUBP_ContQty_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_ContQty_D_MC extends MAUBP_ContQty_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCBeans _cont_fctr_flg = null;
	protected MCBeans _qty = null;
	protected MCBeans _std_cont_fctr = null;
	protected MCBeans _act_cont_fctr = null;
	protected MCBeans _cont_fctr_dec_place = null;
	protected MCBeans _cont_fctr_rnd_typ = null;
	
	// 0埋めの処理のみ行い、有効成分の設定は行わない場合に、trueを設定する。
	// 投入数量のように有効成分を元に基準単位数量を換算するような画面の場合に、trueを設定する
	protected boolean _no_conv_flg = false;
	
	protected boolean _cont_fctr_enable_flg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ContQty_D_MC() {
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
	public MAUBP_ContQty_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		_cont_fctr_enable_flg = convStringToBoolean(getSysParm("CONT_FCTR_ENABLE_FLG"));
		if (!_cont_fctr_enable_flg) {
			setComponentInvisibleAllStatus(columnContQty_cont_qty);
		}
	}

	protected boolean convStringToBoolean(String s) {
		return s.equals("1") ? true : false;
	}

	/**
	 * 連携に必要な部品を設定する。<br>
	 * 標準有効成分係数がない画面では、std_cont_fctrにnullを指定する。<br>
	 * 実際有効成分係数がない画面では、act_cont_fctrにnullを指定する。<br>
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
		MCBeans cont_fctr_flg,
		MCBeans qty,
		MCBeans std_cont_fctr,
		MCBeans act_cont_fctr,
		MCBeans cont_fctr_dec_place,
		MCBeans cont_fctr_rnd_typ
	) {
		setRelateBeans(cont_fctr_flg, qty, std_cont_fctr, act_cont_fctr,
				cont_fctr_dec_place, cont_fctr_rnd_typ, false);
	}
	
	public void setRelateBeans(
			MCBeans cont_fctr_flg,
			MCBeans qty,
			MCBeans std_cont_fctr,
			MCBeans act_cont_fctr,
			MCBeans cont_fctr_dec_place,
			MCBeans cont_fctr_rnd_typ,
			boolean no_conv_flg
		) {
			_cont_fctr_flg = cont_fctr_flg;
			_qty = qty;
			_std_cont_fctr = std_cont_fctr;
			_act_cont_fctr = act_cont_fctr;
			_cont_fctr_dec_place = cont_fctr_dec_place;
			_cont_fctr_rnd_typ = cont_fctr_rnd_typ;
			_no_conv_flg = no_conv_flg;
		}

	protected MCBeans getContFctrFlg() {
		return _cont_fctr_flg;
	}

	protected MCBeans getQty() {
		return _qty;
	}

	protected MCBeans getStdContFtr() {
		return _std_cont_fctr;
	}

	protected MCBeans getActContFtr() {
		return _act_cont_fctr;
	}

	protected MCBeans getContFctrDecPlace() {
		return _cont_fctr_dec_place;
	}

	protected MCBeans getContFctrRndTyp() {
		return _cont_fctr_rnd_typ;
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
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (getContFctrFlg() != null && (_cont_fctr_enable_flg)) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
			boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			ContQtyR r = getContQtyL().get(info.getEventIndex());
			setContQty(info, r, contFctrFlg);
		}
	}

	/**
	 * 実際有効成分係数が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_act_cont_fctr_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (getContFctrFlg() != null && (_cont_fctr_enable_flg)) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
			boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			ContQtyR r = getContQtyL().get(info.getEventIndex());
			setContQty(info, r, contFctrFlg);
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
				setValueEx(columnContQty_cont_qty, info.getEventIndex(), null);
			}
			else {
				if (getContFctrFlg() != null) {
					MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
					boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

					ContQtyR r = getContQtyL().get(info.getEventIndex());
					setContQty(info, r, contFctrFlg);
				}
			}
		}
	}

	/**
	 * 有効成分換算端数処理区分が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cont_fctr_rnd_typ_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}

		if (getContFctrFlg() != null && (_cont_fctr_enable_flg)) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrFlg();
			boolean contFctrFlg = (boolean) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			ContQtyR r = getContQtyL().get(info.getEventIndex());
			setContQty(info, r, contFctrFlg);
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

			ContQtyR r = getContQtyL().get(info.getEventIndex());
			setContQty(info, r, contFctrFlg);
		}
	}

	/**
	 * 有効成分を設定する。
	 *
	 * @return 有効成分
	 */
	protected void setContQty(MCEventInfo info, ContQtyR r, boolean contFctrFlg) {
		if (contFctrFlg && !_no_conv_flg) {
			MCColumnConfig conf = (MCColumnConfig) getQty();
			MCNumber qty = (MCNumber) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			conf = (MCColumnConfig) getStdContFtr();
			MCNumber std_cont_fctr = conf != null ? (MCNumber)conf.getBaseTable().getValue(info.getEventIndex(), conf) : null;

			conf = (MCColumnConfig) getActContFtr();
			MCNumber act_cont_fctr = conf != null ? (MCNumber)conf.getBaseTable().getValue(info.getEventIndex(), conf) : null;

			conf = (MCColumnConfig) getContFctrDecPlace();
			MCNumber cont_fctr_dec_place = (MCNumber) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			conf = (MCColumnConfig) getContFctrRndTyp();
			String cont_fctr_rnd_typ = (String) conf.getBaseTable().getValue(info.getEventIndex(), conf);

			if (!isNull(act_cont_fctr)) {
				std_cont_fctr = act_cont_fctr;
			}
			setValueEx(columnContQty_cont_qty, info.getEventIndex(), convToContFctrUnit(
					qty, std_cont_fctr, cont_fctr_dec_place, cont_fctr_rnd_typ));
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		ContQtyTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			return column == columnContQty_cont_qty;
		}

		@Override
		protected MCNumber getUnitDecPlace(int index, MCColumnConfig column) {
			MCColumnConfig conf = (MCColumnConfig) getContFctrDecPlace();
			return (MCNumber) conf.getBaseTable().getValue(index, conf);
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}

		if (column == columnContQty_cont_qty) {
			if (isNull((MCNumber) getBeansValue(getContFctrDecPlace(), index))) {
				return MCMode.READ_ONLY;
			}
		}

		return super.getCellMode(index, column);
	}

}