package mcframe.clientMSUB.MSUBP5040;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.list.MCListType;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_BdItem_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_BdItem_D_MC extends MSUBP_BdItem_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCBeans _asset_mng_typ = null;
	protected MCBeans _lot_mng_typ = null;
	protected MCBeans _sublot_mng_typ = null;
	protected MCBeans _sno1_mng_typ = null;
	protected MCBeans _sno2_mng_typ = null;
	protected MCBeans _sno3_mng_typ = null;
	protected MCBeans _sno4_mng_typ = null;
	protected MCBeans _sno_mng_typ = null;

	protected boolean _sno_mode_ctrl_flg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_BdItem_D_MC() {
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
	public MSUBP_BdItem_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void listInit() {
		super.listInit();

		getBdItem_bd_itm_sub1_ListPutter().putBind("itm_cd", columnBdItem_bd_itm_cd);
		getBdItem_bd_itm_sub2_ListPutter().putBind("itm_cd", columnBdItem_bd_itm_cd);
		getBdItem_bd_itm_sub2_ListPutter().putBind("itm_sub1", columnBdItem_bd_itm_sub1);
		getBdItem_bd_itm_sub3_ListPutter().putBind("itm_cd", columnBdItem_bd_itm_cd);
		getBdItem_bd_itm_sub3_ListPutter().putBind("itm_sub1", columnBdItem_bd_itm_sub1);
		getBdItem_bd_itm_sub3_ListPutter().putBind("itm_sub2", columnBdItem_bd_itm_sub2);
		
		// addIgnoreListBeansの設定
		columnBdItem_bd_itm_cd.addIgnoreListBeans(columnBdItem_bd_itm_sub1, columnBdItem_bd_itm_sub2, columnBdItem_bd_itm_sub3);
		columnBdItem_bd_itm_sub1.addIgnoreListBeans(columnBdItem_bd_itm_sub2, columnBdItem_bd_itm_sub3);
		columnBdItem_bd_itm_sub2.addIgnoreListBeans(columnBdItem_bd_itm_sub3);
	}

	/**
	 * ロット管理区分、サブロット管理区分、手配ＮＯ１管理区分～手配ＮＯ４管理区分を<br>
	 * 使用する画面で部品を設定する。理由setupPartsにて設定することを想定。
	 * 
	 * @param lot_mng_typ ロット管理区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sno1_mng_typ 手配ＮＯ１管理区分
	 * @param sno2_mng_typ 手配ＮＯ２管理区分
	 * @param sno3_mng_typ 手配ＮＯ３管理区分
	 * @param sno4_mng_typ 手配ＮＯ４管理区分
	 */
	public void setRelateBeans(
		MCBeans lot_mng_typ,
		MCBeans sublot_mng_typ,
		MCBeans sno1_mng_typ,
		MCBeans sno2_mng_typ,
		MCBeans sno3_mng_typ,
		MCBeans sno4_mng_typ
	) {
		_lot_mng_typ = lot_mng_typ;
		_sublot_mng_typ = sublot_mng_typ;
		_sno1_mng_typ = sno1_mng_typ;
		_sno2_mng_typ = sno2_mng_typ;
		_sno3_mng_typ = sno3_mng_typ;
		_sno4_mng_typ = sno4_mng_typ;
	}

	/**
	 * 資産管理区分、ロット管理区分、サブロット管理区分、手配ＮＯ１管理区分～手配ＮＯ４管理区分を<br>
	 * 使用する画面で部品を設定する。setupPartsにて設定することを想定。
	 * 
	 * @param asset_typ 資産管理区分
	 * @param lot_mng_typ ロット管理区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sno1_mng_typ 手配ＮＯ１管理区分
	 * @param sno2_mng_typ 手配ＮＯ２管理区分
	 * @param sno3_mng_typ 手配ＮＯ３管理区分
	 * @param sno4_mng_typ 手配ＮＯ４管理区分
	 */
	public void setRelateBeans(
		MCBeans asset_mng_typ,
		MCBeans lot_mng_typ,
		MCBeans sublot_mng_typ,
		MCBeans sno1_mng_typ,
		MCBeans sno2_mng_typ,
		MCBeans sno3_mng_typ,
		MCBeans sno4_mng_typ
	) {
		_asset_mng_typ = asset_mng_typ;
		_lot_mng_typ = lot_mng_typ;
		_sublot_mng_typ = sublot_mng_typ;
		_sno1_mng_typ = sno1_mng_typ;
		_sno2_mng_typ = sno2_mng_typ;
		_sno3_mng_typ = sno3_mng_typ;
		_sno4_mng_typ = sno4_mng_typ;
	}

	/**
	 * 手配ＮＯ管理区分が、管理する（任意：在庫対象外）の場合と<br>
	 * サブロット管理区分が、在庫のみサブロット管理するの場合、<br>
	 * 手配ＮＯのモード制御するかどうかを設定する。<br>
	 * デフォルトではモード制御をしない。
	 * 
	 * @param boo モード制御するかどうか
	 */
	public void setSnoModeCtrl(boolean boo) {
		_sno_mode_ctrl_flg = boo;
	}

	protected boolean getSnoModeCtrl() {
		return _sno_mode_ctrl_flg;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnBdItem_bd_itm_cd.addLCListener(this);
		columnBdItem_bd_itm_sub1.addLCListener(this);
		columnBdItem_bd_itm_sub2.addLCListener(this);
		columnBdItem_bd_itm_sub3.addLCListener(this);
		columnBdItem_bd_lot_no.addLCListener(this);
		
		if (_asset_mng_typ != null) {
			((MCLCBeans)_asset_mng_typ).addLCListener(this);
		}
		if (_lot_mng_typ != null) {
			((MCLCBeans)_lot_mng_typ).addLCListener(this);
		}
		if (_sublot_mng_typ != null) {
			((MCLCBeans)_sublot_mng_typ).addLCListener(this);
		}
		if (_sno1_mng_typ != null) {
			((MCLCBeans)_sno1_mng_typ).addLCListener(this);
		}
		if (_sno2_mng_typ != null) {
			((MCLCBeans)_sno2_mng_typ).addLCListener(this);
		}
		if (_sno3_mng_typ != null) {
			((MCLCBeans)_sno3_mng_typ).addLCListener(this);
		}
		if (_sno4_mng_typ != null) {
			((MCLCBeans)_sno4_mng_typ).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnBdItem_bd_itm_cd   ||
			lc == columnBdItem_bd_itm_sub1 ||
			lc == columnBdItem_bd_itm_sub2 ||
			lc == columnBdItem_bd_itm_sub3) {
			doBeans_itm_LC(info);
		}
		else if (lc == _asset_mng_typ) {
			doBeans_asset_mng_typ_LC(info);
		}
		else if (lc == _lot_mng_typ) {
			doBeans_lot_mng_typ_LC(info);
		}
		else if (lc == columnBdItem_bd_lot_no) {
			doBeans_sublot_mng_typ_LC(info);
		}
		else if (lc == _sublot_mng_typ) {
			doBeans_sublot_mng_typ_LC(info);
		}
		else if (lc == _sno1_mng_typ) {
			doBeans_sno1_mng_typ_LC(info);
		}
		else if (lc == _sno2_mng_typ) {
			doBeans_sno2_mng_typ_LC(info);
		}
		else if (lc == _sno3_mng_typ) {
			doBeans_sno3_mng_typ_LC(info);
		}
		else if (lc == _sno4_mng_typ) {
			doBeans_sno4_mng_typ_LC(info);
		}
	}

	protected void doBeans_itm_LC(MCEventInfo info) {
		int index = info.getEventIndex();

		clearBdItemAttr(index);
		doBeans_lot_mng_typ_LC(info);
	}

	protected void clearBdItemAttr(int i) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_ctg_cd, r.getGUIIndex(), null);
				setValueEx(columnBdItem_bd_oper_cd, r.getGUIIndex(), null);
			}
		}
		else {
			setValueEx(columnBdItem_bd_ctg_cd, i, null);
			setValueEx(columnBdItem_bd_oper_cd, i, null);
		}
	}

	protected void doBeans_asset_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		if (isNull(newVal) || MAC_ASSET_MNG_TYP.isMNG(newVal)) {
			clearBdItem(info.getEventIndex());
		}
	}

	public void clearBdItem(int i) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				clearBdItemSub(r.getGUIIndex());
			}
		}
		else {
			clearBdItemSub(i);
		}
	}

	protected void clearBdItemSub(int i) {
		setValueEx(columnBdItem_bd_dpt_cd, i, null);
		setValueEx(columnBdItem_bd_itm_cd, i, null);
		setValueEx(columnBdItem_bd_itm_sub1, i, null);
		setValueEx(columnBdItem_bd_itm_sub2, i, null);
		setValueEx(columnBdItem_bd_itm_sub3, i, null);
		setValueEx(columnBdItem_bd_lot_no, i, null);
		setValueEx(columnBdItem_bd_sublot_no, i, null);
		setValueEx(columnBdItem_bd_sno1, i, null);
		setValueEx(columnBdItem_bd_sno2, i, null);
		setValueEx(columnBdItem_bd_sno3, i, null);
		setValueEx(columnBdItem_bd_sno4, i, null);
		setValueEx(columnBdItem_bd_bp_cd, i, null);
		setValueEx(columnBdItem_bd_loc_cd, i, null);
		setValueEx(columnBdItem_bd_ctg_cd, i, null);
		setValueEx(columnBdItem_bd_oper_cd, i, null);
		setValueEx(columnBdItem_bd_iv_no, i, null);
		setValueEx(columnBdItem_bd_slo_no, i, null);
		setValueEx(columnBdItem_bd_po_no, i, null);
	}

	protected void doBeans_lot_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		int index = info.getEventIndex();

		if (isNull(newVal)) {
			setLot(index, null);
		}
		else if (!lotNoEditable(index)) {
			columnBdItem_bd_lot_no.setListType(MCListType.FREE);
			setLot(index, MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(index).bd_lot_no())) {
			setLot(index, null);
		}
	}

	protected void setLot(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_lot_no, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_lot_no, i, val);
		}
	}

	protected void doBeans_sublot_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		int index = info.getEventIndex();

		if (isNull(newVal)) {
			setSublot(index, null);
		}
		else if (!sublotNoEditable(index)) {
			columnBdItem_bd_sublot_no.setListType(MCListType.FREE);
			setSublot(index, MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(index).bd_sublot_no())) {
			setSublot(index, null);
		}
	}

	protected void setSublot(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_sublot_no, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_sublot_no, i, val);
		}
	}

	protected void doBeans_sno1_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		if (isNull(newVal)) {
			setSno1(info.getEventIndex(), null);
		}
		else if (MAC_SNO_MNG_TYP.isNOT_MNG(newVal)) {
			setSno1(info.getEventIndex(), MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(info.getEventIndex()).bd_sno1())) {
			setSno1(info.getEventIndex(), null);
		}
	}

	protected void setSno1(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_sno1, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_sno1, i, val);
		}
	}

	protected void doBeans_sno2_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		if (isNull(newVal)) {
			setSno2(info.getEventIndex(), null);
		}
		else if (MAC_SNO_MNG_TYP.isNOT_MNG(newVal)) {
			setSno2(info.getEventIndex(), MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(info.getEventIndex()).bd_sno2())) {
			setSno2(info.getEventIndex(), null);
		}
	}

	protected void setSno2(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_sno2, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_sno2, i, val);
		}
	}

	protected void doBeans_sno3_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		if (isNull(newVal)) {
			setSno3(info.getEventIndex(), null);
		}
		else if (MAC_SNO_MNG_TYP.isNOT_MNG(newVal)) {
			setSno3(info.getEventIndex(), MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(info.getEventIndex()).bd_sno3())) {
			setSno3(info.getEventIndex(), null);
		}
	}

	protected void setSno3(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_sno3, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_sno3, i, val);
		}
	}

	protected void doBeans_sno4_mng_typ_LC(MCEventInfo info) {
		String newVal = (String)info.getNewValue();
		if (isNull(newVal)) {
			setSno4(info.getEventIndex(), null);
		}
		else if (MAC_SNO_MNG_TYP.isNOT_MNG(newVal)) {
			setSno4(info.getEventIndex(), MAC_STR.NULL_VAL.value());
		}
		else if (MAC_STR.isNULL_VAL(getBdItemL().get(info.getEventIndex()).bd_sno4())) {
			setSno4(info.getEventIndex(), null);
		}
	}

	protected void setSno4(int i, String val) {
		if (i < 0) {
			for (BdItemR r : exceptBaseEmpty(BdItemTable)) {
				setValueEx(columnBdItem_bd_sno4, r.getGUIIndex(), val);
			}
		}
		else {
			setValueEx(columnBdItem_bd_sno4, i, val);
		}
	}

	/**
	 * 指定された GUI 部品のモードを取得する。
	 */
	@Override
	protected MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		
		// 資産管理区分と連携する場合
		if (_asset_mng_typ != null) {
			String asset_mng_typ = null;
			if (_asset_mng_typ instanceof MCRowBeans) {
				asset_mng_typ = (String)getValueOf((MCRowBeans)_asset_mng_typ);
			}
			else {
				asset_mng_typ = (String)getValueOf((MCColumnConfig)_asset_mng_typ, index);
			}
			if (MAC_ASSET_MNG_TYP.isMNG(asset_mng_typ)) {
				return MCMode.READ_ONLY;
			}
		}

		// 品目
		if (column == columnBdItem_bd_itm_cd ||
				column == columnBdItem_bd_itm_sub1 ||
				column == columnBdItem_bd_itm_sub2 ||
				column == columnBdItem_bd_itm_sub3) {
			BdItemR row = getBdItemL().get(index);
			boolean cn = isNull(row.bd_itm_cd());
			boolean nn = isNull(row.bd_itm_nm());
			if (column == columnBdItem_bd_itm_sub1) {
				if (cn) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnBdItem_bd_itm_sub2) {
				if (cn = cn || isNull(row.bd_itm_sub1())) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnBdItem_bd_itm_sub3) {
				if (cn = cn || isNull(row.bd_itm_sub2())) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
	
			// 品目が確定していない場合
			if (isNull(getValueOf(columnBdItem_bd_itm_sub3, index))) {
				return column.getMode();
			}
		}
		// 負担部門
		else if (column == columnBdItem_bd_dpt_cd) {
			return MCMode.REQUIRED;
		}
		// 負担ロットＮＯ
		else if (column == columnBdItem_bd_lot_no) {
			//負担品目が入力されない場合、負担ロットＮＯが入力できる。
			if (isNull(getBdItemL().get(index).bd_itm_cd())) {
				return MCMode.ENABLE;
			}else {
				if (lotNoEditable(index)) {
					return MCMode.ENABLE;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
		}
		// 負担サブロットＮＯ
		else if (column == columnBdItem_bd_sublot_no) {
			//負担品目が入力されない場合、負担サブロットＮＯが入力できる。
			if (isNull(getBdItemL().get(index).bd_itm_cd())) {
				return MCMode.ENABLE;
			}else {
				if (sublotNoEditable(index)) {
					return MCMode.ENABLE;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
		}
		// 負担手配ＮＯ１～負担手配ＮＯ４
		else if (column == columnBdItem_bd_sno1 ||
			column == columnBdItem_bd_sno2 ||
			column == columnBdItem_bd_sno3 ||
			column == columnBdItem_bd_sno4) {
			//負担品目が入力されない場合、負担手配ＮＯ１～負担手配ＮＯ４が入力できる。
			if (isNull(getBdItemL().get(index).bd_itm_cd())) {
				return MCMode.ENABLE;
			}else {
				setSnoMngTyp(column);
	
				// （管理する（必須））、管理する（任意）
				if (MAC_SNO_MNG_TYP.isMNG_REQ((String)getValueOf(_sno_mng_typ, index)) ||
					MAC_SNO_MNG_TYP.isMNG_ARB((String)getValueOf(_sno_mng_typ, index))) {
	
					return MCMode.ENABLE;
				}
				// 管理する（任意：在庫対象外）、手配ＮＯのモード制御フラグ（オン）
				else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)getValueOf(_sno_mng_typ, index)) && getSnoModeCtrl()) {
					return MCMode.ENABLE;
				}
				// 管理しない
				else {
					return MCMode.READ_ONLY;
				}
			}
		}
		// 負担取引先、負担場所、負担インボイスＮＯ、負担受注ＮＯ、負担発注ＮＯ
		else if (column == columnBdItem_bd_bp_cd ||
				column == columnBdItem_bd_loc_cd ||
				column == columnBdItem_bd_iv_no  ||
				column == columnBdItem_bd_slo_no ||
				column == columnBdItem_bd_po_no) {

				return MCMode.ENABLE;
		}
		// 負担品群、負担工程
		else if (column == columnBdItem_bd_ctg_cd || column == columnBdItem_bd_oper_cd ) {
			if (isNull(getBdItemL().get(index).bd_itm_cd())) {
				return MCMode.ENABLE;
			}
			else {
				return MCMode.READ_ONLY;
			}
		}

		return super.getCellMode(index, column);
	}

	protected boolean lotNoEditable(int index) {
		// 同一ロット許可、または、同一ロット不許可
		if (MAC_LOT_MNG_TYP.isDUPL_ABL((String)getValueOf(_lot_mng_typ, index)) ||
			MAC_LOT_MNG_TYP.isUNIQ((String)getValueOf(_lot_mng_typ, index))) {
			return true;
		}
		// ロット管理しない
		else {
			return false;
		}
	}

	protected boolean sublotNoEditable(int index) {
		// 同一ロット許可、または、同一ロット不許可
		if (MAC_SUBLOT_MNG_TYP.isDUPL_ABL((String)getValueOf(_sublot_mng_typ, index)) ||
			MAC_SUBLOT_MNG_TYP.isUNIQ((String)getValueOf(_sublot_mng_typ, index))) {
			return true;
		}
		// 在庫のみサブロット管理する
		else if (MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, index))) {
			return true;
		}
		// サブロット管理しない
		else {
			return false;
		}
	}

	protected void setSnoMngTyp(MCColumnConfig column) {
		if (column == columnBdItem_bd_sno1) {
			_sno_mng_typ = _sno1_mng_typ;
		}
		else if (column == columnBdItem_bd_sno2) {
			_sno_mng_typ = _sno2_mng_typ;
		}
		else if (column == columnBdItem_bd_sno3) {
			_sno_mng_typ = _sno3_mng_typ;
		}
		else  {
			_sno_mng_typ = _sno4_mng_typ;
		}
	}
	
	/**
	 * 本部品の項目かを判定する
	 * @param column 利用画面の項目
	 * @return 本部品の項目である場合、true。それ以外はfalse。
	 */
	public boolean isBdColumn(MCColumnConfig column) {
		return column == columnBdItem_bd_dpt_cd || column == columnBdItem_bd_dpt_nm || column == columnBdItem_bd_itm_cd || column == columnBdItem_bd_itm_sub1
				|| column == columnBdItem_bd_itm_sub2 || column == columnBdItem_bd_itm_sub3 || column == columnBdItem_bd_itm_nm || column == columnBdItem_bd_lot_no
				|| column == columnBdItem_bd_sublot_no || column == columnBdItem_bd_sno1 || column == columnBdItem_bd_sno2 || column == columnBdItem_bd_sno3 || column == columnBdItem_bd_sno4
				|| column == columnBdItem_bd_bp_cd || column == columnBdItem_bd_bp_nm || column == columnBdItem_bd_loc_cd || column == columnBdItem_bd_loc_nm
				|| column == columnBdItem_bd_ctg_cd || column == columnBdItem_bd_ctg_nm || column == columnBdItem_bd_oper_cd || column == columnBdItem_bd_oper_nm
				|| column == columnBdItem_bd_iv_no || column == columnBdItem_bd_slo_no || column == columnBdItem_bd_po_no;
	}

	@Override
	public void doBdItem_bd_lot_no_NE(MCEventInfo info) {
		super.doBdItem_bd_lot_no_NE(info);
		int index = info.getEventIndex();
		if (lotNoEditable(index)) {
			columnBdItem_bd_lot_no.setListType(MCListType.STRICT);
		}
		else {
			columnBdItem_bd_lot_no.setListType(MCListType.FREE);
		}
	}
	@Override
	public void doBdItem_bd_sublot_no_NE(MCEventInfo info) {
		super.doBdItem_bd_sublot_no_NE(info);
		int index = info.getEventIndex();
		if (sublotNoEditable(index)) {
			columnBdItem_bd_sublot_no.setListType(MCListType.STRICT);
		}
		else {
			columnBdItem_bd_sublot_no.setListType(MCListType.FREE);
		}
	}

}