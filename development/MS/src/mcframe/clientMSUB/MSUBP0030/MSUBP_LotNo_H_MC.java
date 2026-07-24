package mcframe.clientMSUB.MSUBP0030;

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
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_LotNo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_LotNo_H_MC extends MSUBP_LotNo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final int LOT_NO_FREE = 0; // 入力制御なし
	protected static final int LOT_NO_CRT_SLCT = 1; // ロットＮＯ発行または選択仕様
	protected static final int LOT_NO_CRT = 2; // ロットＮＯ発行仕様
	protected static final int LOT_NO_SLCT = 3; // ロットＮＯ選択仕様
	protected int _lot_no_mode = LOT_NO_FREE;
	protected MCRowBeans _itm_cd = null;
	protected MCRowBeans _itm_sub1 = null;
	protected MCRowBeans _itm_sub2 = null;
	protected MCRowBeans _itm_sub3 = null;
	protected MCRowBeans _lot_mng_typ = null;
	protected MCRowBeans _lot_no_typ = null;
	protected MCRowBeans _sublot_mng_typ = null;
	protected MCRowBeans _sublot_no_typ = null;
	protected MCRowBeans _crt_lot_flg = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_LotNo_H_MC() {
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
	protected MSUBP_LotNo_H_MC(mcframe.clientMSUB.MSUBP0030.LotNoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_LotNo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_LotNo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 * @param crt_lot_flg ロット作成ＦＬＧ
	 */
	public void setRelateBeans(MCRowBeans itm_cd, MCRowBeans itm_sub1, MCRowBeans itm_sub2, MCRowBeans itm_sub3, MCRowBeans lot_mng_typ, MCRowBeans lot_no_typ, MCRowBeans sublot_mng_typ, MCRowBeans sublot_no_typ, MCRowBeans crt_lot_flg) {
		_lot_no_mode = LOT_NO_CRT_SLCT;
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_lot_mng_typ = lot_mng_typ;
		_lot_no_typ = lot_no_typ;
		_sublot_mng_typ = sublot_mng_typ;
		_sublot_no_typ = sublot_no_typ;
		_crt_lot_flg = crt_lot_flg;
	}

	/**
	 * ロットＮＯを発番するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 */
	public void setRelateBeans(MCRowBeans itm_cd, MCRowBeans itm_sub1, MCRowBeans itm_sub2, MCRowBeans itm_sub3, MCRowBeans lot_mng_typ, MCRowBeans lot_no_typ, MCRowBeans sublot_mng_typ, MCRowBeans sublot_no_typ) {
		_lot_no_mode = LOT_NO_CRT;
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_lot_mng_typ = lot_mng_typ;
		_lot_no_typ = lot_no_typ;
		_sublot_mng_typ = sublot_mng_typ;
		_sublot_no_typ = sublot_no_typ;
	}

	/**
	 * ロットＮＯを選択するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param sublot_mng_typ サブロット管理区分
	 */
	public void setRelateBeans(MCRowBeans itm_cd, MCRowBeans itm_sub1, MCRowBeans itm_sub2, MCRowBeans itm_sub3, MCRowBeans lot_mng_typ, MCRowBeans sublot_mng_typ) {
		_lot_no_mode = LOT_NO_SLCT;
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_lot_mng_typ = lot_mng_typ;
		_sublot_mng_typ = sublot_mng_typ;
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_cd, _itm_cd);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub1, _itm_sub1);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub2, _itm_sub2);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub3, _itm_sub3);
		
		// setRelateBeans実行後になるようにlistInitでなくlinkBeansToISPanelに実装する
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_cd, _itm_cd);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub1, _itm_sub1);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub2, _itm_sub2);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub3, _itm_sub3);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_lot_no, LotNo_lot_no);
	}
	
	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_itm_cd != null) {
			((MCLCBeans)_itm_cd).addLCListener(this);
		}
		if (_itm_sub1 != null) {
			((MCLCBeans)_itm_sub1).addLCListener(this);
		}
		if (_itm_sub2 != null) {
			((MCLCBeans)_itm_sub2).addLCListener(this);
		}
		if (_itm_sub3 != null) {
			((MCLCBeans)_itm_sub3).addLCListener(this);
		}
		if (_crt_lot_flg != null) {
			((MCNCBeans)_crt_lot_flg).addNCListener(this);
		}
		if (_lot_mng_typ != null) {
			((MCLCBeans)_lot_mng_typ).addLCListener(this);
		}
		if (_sublot_mng_typ != null) {
			((MCLCBeans)_sublot_mng_typ).addLCListener(this);
		}
		if (_lot_no_typ != null) {
			((MCLCBeans)_lot_no_typ).addLCListener(this);
		}
		if (_sublot_no_typ != null) {
			((MCLCBeans)_sublot_no_typ).addLCListener(this);
		}
	}
	

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (_lot_no_mode == LOT_NO_CRT_SLCT && nc == _crt_lot_flg) {
			doBeans_crt_lot_flg_NC(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _itm_cd || lc == _itm_sub1 || lc == _itm_sub2 || lc == _itm_sub3) {
			doBeans_itm_LC(info);
		}
		else if (lc == _lot_mng_typ) {
			doBeans_lot_mng_typ_LC(info);
		}
		else if (lc == _sublot_mng_typ) {
			doBeans_sublot_mng_typ_LC(info);
		}
		else if (lc == _lot_no_typ) {
			doBeans_lot_no_typ_LC(info);
		}
		else if (lc == _sublot_no_typ) {
			doBeans_sublot_no_typ_LC(info);
		}
	}
	
	@Override
	public void doLotNo_lot_no_LC(MCEventInfo info) {
		super.doLotNo_lot_no_LC(info);
		// 新規サブロットを指定するケースで、サブロットが入力不可になるケースでは、サブロットを自動発番するために、ロット入力時にはクリアしておく
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ, info.getEventIndex()))
					&& MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, info.getEventIndex()))) {
				if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
					setValueEx(LotNo_sublot_no, null);
				}
			}
			else {
				if ((Boolean)getValueOf(_crt_lot_flg)) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
						setValueEx(LotNo_sublot_no, null);
					}
				}
			}
		}
		else if (_lot_no_mode == LOT_NO_CRT) {
			if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
				setValueEx(LotNo_sublot_no, null);
			}
		}
	}
	
	@Override
	public void doLotNo_sublot_no_LC(MCEventInfo info) {
		super.doLotNo_sublot_no_LC(info);
		// ロットＮＯ管理区分がロット管理しない、かつサブロットＮＯ管理区分が在庫のみサブロット管理する場合は、ロットＮＯにＮＵＬＬ文字を指定する
		// ロットＮＯが入力不可になり、ＮＵＬＬ文字が入っていないとサブロットＮＯのリストロジックや在庫選択などの機能に悪影響があるため
		if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ)) && MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ))) {
			if (isNull(getLotNoR().sublot_no())) {
				setValueEx(LotNo_lot_no, null);
			}
			else {
				getLotNoR().lot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}
	
	protected void doBeans_itm_LC(MCEventInfo info) {
		setValueEx(LotNo_lot_no, null);
		setValueEx(LotNo_sublot_no, null);
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			setValueEx(_crt_lot_flg, false);
		}

		setGUIMode();
		setCrtLotFlgMode();
	}

	protected void doBeans_lot_mng_typ_LC(MCEventInfo info) {
		setGUIMode();
		setCrtLotFlgMode();
	}

	protected void doBeans_sublot_mng_typ_LC(MCEventInfo info) {
		setGUIMode();
		setCrtLotFlgMode();
	}

	protected void doBeans_lot_no_typ_LC(MCEventInfo info) {
		setGUIMode();
		setCrtLotFlgMode();
	}

	protected void doBeans_sublot_no_typ_LC(MCEventInfo info) {
		setGUIMode();
		setCrtLotFlgMode();
	}
	
	protected void doBeans_crt_lot_flg_NC(MCEventInfo info) {
		Boolean boo = (Boolean)getValueOf(_crt_lot_flg);
		// ロット作成ＦＬＧをオフにした場合のみ消す（オンにした場合はFREE入力なので、入力値が不正ではないため）
		if (!boo) {
			setValueEx(LotNo_lot_no, null);
			if (!MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, info.getEventIndex()))) {
				setValueEx(LotNo_sublot_no, null);
			}
		}

		setGUIMode();
	}


	// モード設定

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		setGUIMode();
		setCrtLotFlgMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		setGUIMode();
		setCrtLotFlgMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		setGUIMode();
		setCrtLotFlgMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		setGUIMode();
		setCrtLotFlgMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		setGUIMode();
		setCrtLotFlgMode();
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * ■ロットＮＯ<br>
	 * 品目変更時に値をクリアする<br>
	 * ロット作成ＦＬＧをオンからオフに変更時にクリアする（オフからオンの場合、値は不正にならないのでクリアしない）<br>
	 * 品目が確定しない場合は入力不可<br>
	 * ロット管理区分が「ロット管理しない」の場合は入力不可<br>
	 * <br>
	 * ロット作成ＦＬＧで入力制御する場合は以下の仕様となる<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ・ロット作成ＦＬＧがオフ：入力可かつ入力モードはSTRICT<br>
	 * 常にロット作成する場合は以下の仕様となる<br>
	 * ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ロット作成しない場合は以下の仕様となる<br>
	 * ・入力可かつ入力モードはSTRICT<br>
	 * <br>
	 * ■サブロットＮＯ<br>
	 * 品目変更時に値をクリアする<br>
	 * ロット作成ＦＬＧをオンからオフに変更時にクリアする（オフからオンの場合、値は不正にならないのでクリアしない）<br>
	 * 品目が確定しない場合は入力不可<br>
	 * サブロット管理区分が「サブロット管理しない」の場合は入力不可<br>
	 * ロット作成ＦＬＧで入力制御する場合は以下の仕様となる<br>
	 * ・サブロット管理区分が「在庫のみサブロット管理する」の場合<br>
	 *  ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 *  ・ロット作成ＦＬＧがオフ、かつロットＮＯ区分が「自動」：入力可かつ入力モードはFREE<br>
	 *  ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ・サブロット管理区分が「ロット管理しない」、「在庫のみサブロット管理する」以外の場合<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオフ：入力可かつ入力モードはSTRICT<br>
	 * 常にロット作成する場合は以下の仕様となる<br>
	 * ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ロット作成しない場合は以下の仕様となる<br>
	 * ・入力可かつ入力モードはSTRICT<br>
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		final int index = 0;
		if (compo == LotNo_lot_no && isDefaultModeEditable(compo)) {
			// 品目が確定するまでは入力不可
			if (isNull(getValueOf(_itm_sub3, index))) {
				return MCMode.READ_ONLY;
			}
			// 品目確定後は属性とロット作成ＦＬＧに応じて入力制御
			else if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ, index))) {
				return MCMode.READ_ONLY;
			}
			else {
				if (_lot_no_mode == LOT_NO_CRT_SLCT) {
					if ((Boolean)getValueOf(_crt_lot_flg, index)) {
						if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_lot_no_typ, index))) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_lot_no_typ, index))) {
							LotNo_lot_no.setListType(MCListType.FREE);
							return MCMode.ENABLE;
						}
						else {
							LotNo_lot_no.setListType(MCListType.FREE);
							return getDefaultMode(compo);
						}
					}
					else {
						LotNo_lot_no.setListType(MCListType.STRICT);
						return getDefaultMode(compo);
					}
				}
				else if (_lot_no_mode == LOT_NO_CRT) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_lot_no_typ, index))) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_lot_no_typ, index))) {
						LotNo_lot_no.setListType(MCListType.FREE);
						return MCMode.ENABLE;
					}
					else {
						LotNo_lot_no.setListType(MCListType.FREE);
						return getDefaultMode(compo);
					}
				}
				else if (_lot_no_mode == LOT_NO_SLCT) {
					LotNo_lot_no.setListType(MCListType.STRICT);
					return getDefaultMode(compo);
				}
				else {
					return getDefaultMode(compo);
				}
			}
		}
		else if (compo == LotNo_sublot_no && isDefaultModeEditable(compo)) {
			// 品目が確定するまでは入力不可
			if (isNull(getValueOf(_itm_sub3, index))) {
				return MCMode.READ_ONLY;
			}
			// 品目確定後は属性とロット作成ＦＬＧに応じて入力制御
			else if (MAC_SUBLOT_MNG_TYP.isNOT_MNG((String)getValueOf(_sublot_mng_typ, index))) {
				return MCMode.READ_ONLY;
			}
			else {
				if (_lot_no_mode == LOT_NO_CRT_SLCT) {
					// 「在庫のみサブロット管理する」場合、基本的にはロット作成ＦＬＧによらず、発番区分に応じて入力制御する
					if (MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, index))) {
						LotNo_sublot_no.setListType(MCListType.FREE);
						if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
							if ((Boolean)getValueOf(_crt_lot_flg, index)) {
								return MCMode.READ_ONLY;								
							}
							else {
								return MCMode.ENABLE;
							}
						}
						else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
							return MCMode.ENABLE;
						}
						else {
							return getDefaultMode(compo);
						}
					}
					// 「サブロット管理しない」、「在庫のみサブロット管理する」以外の場合、ロット作成ＦＬＧ＋発番区分に応じて入力制御する
					else {
						if ((Boolean)getValueOf(_crt_lot_flg, index)) {
							LotNo_sublot_no.setListType(MCListType.FREE);
							if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
								return MCMode.READ_ONLY;
							}
							else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
								return MCMode.ENABLE;
							}
							else {
								return getDefaultMode(compo);
							}
						}
						else {
							LotNo_sublot_no.setListType(MCListType.STRICT);
							return getDefaultMode(compo);
						}
					}
				}
				else if (_lot_no_mode == LOT_NO_CRT) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
						LotNo_sublot_no.setListType(MCListType.FREE);
						return MCMode.ENABLE;
					}
					else {
						LotNo_sublot_no.setListType(MCListType.FREE);
						return getDefaultMode(compo);
					}
				}
				else if (_lot_no_mode == LOT_NO_SLCT) {
					LotNo_sublot_no.setListType(MCListType.STRICT);
					return getDefaultMode(compo);
				}
				else {
					return getDefaultMode(compo);
				}
			}
		}
		return super.getGUIMode(compo);
	}
	
	/**
	 * ■ロット作成ＦＬＧ<br>
	 * 品目が確定しない場合は入力不可。<br>
	 * ロット管理区分が「ロット管理しない」の場合は入力不可。<br>
	 */
	protected void setCrtLotFlgMode() {
		final int index = 0;
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			// 品目が確定するまでは入力不可
			if (isNull(getValueOf(_itm_sub3, index))) {
				((MCModeBeans)_crt_lot_flg).setMode(MCMode.READ_ONLY);
			}
			// 品目確定後は属性に応じて入力制御
			else if (MAC_LOT_MNG_TYP.isNOT_MNG((String)_lot_mng_typ.getRowValue())) {
				((MCModeBeans)_crt_lot_flg).setMode(MCMode.READ_ONLY);
			}
			else {
				((MCModeBeans)_crt_lot_flg).setMode(getDefaultMode((MCModeBeans)_crt_lot_flg));
			}
		}
	}

}